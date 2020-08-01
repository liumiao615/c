package lab;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomText;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import org.ansj.domain.Term;
import org.ansj.splitWord.analysis.NlpAnalysis;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Connection;

import java.util.List;

public class SingleTnread {
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException, SQLException {
        WebClient webClient = new WebClient(BrowserVersion.CHROME);
        webClient.getOptions().setJavaScriptEnabled(false);
        webClient.getOptions().setCssEnabled(false);
        String baseurl = "https://so.gushiwen.org";
        String pathurl = "/gushi/tangshi.aspx";
        List<String> detailurlList = new ArrayList<>();

        //列表页的解析和请求
        {
            String Lurl = baseurl + pathurl;
            HtmlPage page = webClient.getPage(Lurl);
            List<HtmlElement> elements = page.getBody().getElementsByAttribute("div",
                    "class",
                    "typecont");
            for(HtmlElement element:elements){
                List<HtmlElement> aElements = element.getElementsByTagName("a");
                for(HtmlElement a:aElements){
                    String detailurl = a.getAttribute("href");
                    detailurlList.add(baseurl + detailurl);
                }
            }
        }
        //建立数据库连接
        MysqlDataSource dataSource = new MysqlConnectionPoolDataSource();
        dataSource.setServerName("127.0.0.1");
        dataSource.setPort(3306);
        dataSource.setUser("root");
        dataSource.setPassword("123456");
        dataSource.setDatabaseName("tangshi0720");
        dataSource.setUseSSL(false);
        dataSource.setCharacterEncoding("UTF8");

        Connection connection = dataSource.getConnection();
        String sql = "INSERT INTO tangshi(sha256,dynastay,title,author,content,words) VALUES(?,?,?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        //
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        //详情页的解析和请求
        {
            for(String url:detailurlList){
                //System.out.println(url);
                HtmlPage page = webClient.getPage(url);
                String Xpath;
                DomText domText;
                Xpath = "//div[@class='cont']/h1/text()";
                domText = (DomText) page.getBody().getByXPath(Xpath).get(0);
                String title = domText.asText();

                Xpath = "//div[@class='cont']/p[@class='source']/a[1]/text()";
                domText = (DomText) page.getBody().getByXPath(Xpath).get(0);
                String dynasty = domText.asText();

                Xpath = "//div[@class='cont']/p[@class='source']/a[2]/text()";
                domText = (DomText) page.getBody().getByXPath(Xpath).get(0);
                String author = domText.asText();

                Xpath = "//div[@class='cont']/div[@class='contson']";
                HtmlElement element = (HtmlElement)page.getBody().getByXPath(Xpath).get(0);
//                HtmlElement body = page.getBody();
//                Object o = body.getByXPath(Xpath).get(0);
//                HtmlElement element = (HtmlElement) o;
                String content = element.getTextContent().trim();

                //1.计算sha-256
                String s = title + content;
                messageDigest.update(s.getBytes("UTF-8"));
                byte[] result = messageDigest.digest();
                StringBuilder sb = new StringBuilder();
                for(byte b:result) {
                    sb.append(String.format("%02x",b));
                }
                //2.计算分词
                List<Term> termList = new ArrayList<>();
                termList.addAll(NlpAnalysis.parse(title).getTerms());
                termList.addAll(NlpAnalysis.parse(content).getTerms());
                List<String> words = new ArrayList<>();
                for(Term term:termList){
                    if(term.getNatureStr().equals("w")){
                        continue;
                    }
                    if(term.getNatureStr().equals(null)){
                        continue;
                    }
                    if(term.getNatureStr().length() < 2){
                        continue;
                    }
                    words.add(term.getRealName());
                }
                String insertWords = String.join(",",words);

                statement.setString(1,sb.toString());
                statement.setString(2,dynasty);
                statement.setString(3,title);
                statement.setString(4,author);
                statement.setString(5,content);
                statement.setString(6,insertWords);

                statement.executeUpdate();
//                com.mysql.jdbc.PreparedStatement mysqlStatement = (com.mysql.jdbc.PreparedStatement)statement;
//                System.out.println(mysqlStatement.asSql());
            }
        }
    }
}
