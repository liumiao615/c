
package v1;

public class LoginServlet extends HttpServlet {
    @Override
    public void doGet(Request req, Response resp){
        String username = req.parameters.get("username");
        if(username == null){
            resp.setStatus("401 Unauthorized");
            resp.println("<h1>请登录</h1>");
            return;
        }
        resp.setHeader("Set-Cookie", "username=" + username +"; expires=Tue, 07-Apr-2020 08:46:16 GMT; Max-Age=8640000\n");
        resp.print("<h1>欢迎 " + username + "光临</h1>");
    }
}
