package v1;

public class NotFoundServlet extends HttpServlet {
    @Override
    public void doGet(Request req, Response resp) {
        resp.setStatus("404 Not Found");
        resp.println("<h1>页面不存在</h1>");
    }
}
