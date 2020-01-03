package v2.servlet;

import v2.Request;
import v2.Response;

import java.io.IOException;

public class HelloServlet extends HttpServlet {
    @Override
    public void doGet(Request req, Response resp) throws IOException {
        String currentUser = "未登录";
        String cookie = req.headers.get("Cookie");
        if (cookie != null) {
            // "username=陈沛鑫"
            currentUser = cookie.split("=")[1];
        }

        resp.setHeader("Content-Type", "text/plain; charset=UTF-8");
        resp.setHeader("X-Teacher", "peixinchen");
        resp.setHeader("X-Room", "201");
        resp.println("你好 " + req.parameters.get("target"));
        resp.println("当前用户是 " + currentUser);
    }
}
