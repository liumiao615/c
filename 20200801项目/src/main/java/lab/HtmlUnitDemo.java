package lab;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class HtmlUnitDemo {
    public static void main(String[] args) throws IOException {
        //无界面的浏览器
        WebClient webClient = new WebClient(BrowserVersion.CHROME);
        //用此方法不用去执行CSS引擎和JS引擎，关闭js和css执行引擎
        webClient.getOptions().setJavaScriptEnabled(false);
        webClient.getOptions().setCssEnabled(false);
        //可以具体对页面进行请求，请求一个具体对url
        HtmlPage page = webClient.getPage("https://www.gushiwen.org/gushi/tangshi.aspx");
        System.out.println(page);
        //注意Sava只能一次
        //page.save(new File("唐诗三百首\\列表页.html"));
        //以上为请求过程

        //如何从html中获取详情信息
        HtmlElement body = page.getBody();
        List<HtmlElement> elements = body.getElementsByAttribute(
                "div",//元素名称
                "class",//标签名称
                "typecont");//标签值
        for(HtmlElement element:elements){
            System.out.println(element);
        }
    }
}
