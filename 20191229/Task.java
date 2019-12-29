package v1;
//处理一个完整的HTTP请求
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;


public class Task implements Runnable {
    private final Socket socket;

    public Task(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();

            Request request = Request.parse(is);
            Response response = new Response();
            HttpServlet servlet;

            if (request.path.equals("/joke.js")) {
                servlet = new JokeJSServlet();
                //HttpServlet servlet = new JokeJSServlet();
                //servlet.doGet(request, response);
            } else if(request.path.equals("/login")){
                servlet = new LoginServlet();
            }else if(request.path.equals("/hello")){
                servlet = new HelloServlet();
            }else {
                servlet = new NotFoundServlet();
            }
            servlet.doGet(request,response);
            response.writeAndFlush(os);

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
