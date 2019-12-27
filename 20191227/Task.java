import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Task implements Runnable {
    // socket 代表的就是客人
    private Socket socket;

    public Task(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            // 获取输入流
            InputStream is = socket.getInputStream();
            // 获取输出流
            OutputStream os = socket.getOutputStream();
            // 按照 TCP 服务器的处理流程
            // 1. 读取客户端的输入
            // 2. 理解客户端的输入(HTTP 请求解析)
            // Request 对象代表客人的要求
            Request request = Request.parse(is);
            System.out.println(request);
            if (request.path.equalsIgnoreCase("/")) {
                String body = "alert('必须关掉');";
                byte[] bodyBuffer = body.getBytes("UTF-8");
                StringBuilder response = new StringBuilder();
                response.append("HTTP/1.0 200 OK\r\n");
                response.append("Content-Type: application/javascript; charset=UTF-8\r\n");
                response.append("Content-Length: ");
                response.append(bodyBuffer.length);
                response.append("\r\n");
                response.append("\r\n");

                os.write(response.toString().getBytes("UTF-8"));
                os.write(bodyBuffer);
                os.flush();
            } else if (request.path.equalsIgnoreCase("/run")) {
                String body = "<script src='/'></script>";
                byte[] bodyBuffer = body.getBytes("UTF-8");
                StringBuilder response = new StringBuilder();
                response.append("HTTP/1.0 200 OK\r\n");
                response.append("Content-Type: text/html; charset=UTF-8\r\n");
                response.append("Content-Length: ");
                response.append(bodyBuffer.length);
                response.append("\r\n");
                response.append("\r\n");

                os.write(response.toString().getBytes("UTF-8"));
                os.write(bodyBuffer);
                os.flush();
            } else {
                StringBuilder response = new StringBuilder();
                response.append("HTTP/1.0 404 Not Found\r\n");
                response.append("\r\n");
                os.write(response.toString().getBytes("UTF-8"));
                os.flush();
            }
            // 3. 处理客人的要求
            // 4. 说让客人能理解的话
            // 5. 把话说出去
            // 6. 通知客人可以走了
            socket.close();
        } catch (Exception e) {}
    }
}
