package v1;

class RunServlet extends HttpServlet {
    @Override
    public void doGet(Request req, Response resp) {
        resp.println("<script src='joke.js'></script>");
    }
}
