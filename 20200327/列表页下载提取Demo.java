package lab;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.Html;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import javax.xml.bind.Element;
import java.io.IOException;
import java.util.List;

public class 列表页下载提取Demo {
    public static void main(String[] args) throws IOException {
        try (WebClient webClient = new WebClient(BrowserVersion.CHROME)) {
            webClient.getOptions().setJavaScriptEnabled(false);
            webClient.getOptions().setCssEnabled(false);
            String url = "https://so.gushiwen.org/gushi/tangshi.aspx";
            HtmlPage page = webClient.getPage(url);
            HtmlElement body = page.getBody();
            List<HtmlElement> elements = body.getElementsByAttribute(
                    "div",
                    "class",
                    "typecont"
            );

            int count = 0;
            for (HtmlElement element : elements) {
                List<HtmlElement> aElements = element.getElementsByTagName("a");
                for (HtmlElement a : aElements) {
                    System.out.println(a.getAttribute("href"));
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
