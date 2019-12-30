package v1;

public class HelloServlet extends HttpServlet{
    @Override
    public void doGet(Request req, Response resp){
        String currentUser = "sehun";
        String cookie = req.headers.get("Cookie");
        if (cookie != null) {
            currentUser = cookie.split("=")[1];
        }
        resp.setHeader("Content-Type","text/plain;Charset=utf-8");
        resp.setHeader("X-Teacher","sehun");
        resp.setHeader("X-Room","201");
        resp.println("你好" + req.parameters.get("target"));
        resp.println("当前用户是 " + currentUser);
    }
}
