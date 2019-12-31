package v1;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

public class Response {
    String status;
    Map<String, String> headers = new HashMap<>();
    StringBuilder bodyBuilder = new StringBuilder();

    void setStatus(String status) {
        this.status = status;
    }

    void setHeader(String key, String value) {
        headers.put(key, value);
    }

    void print(String s) {
        bodyBuilder.append(s);
    }

    void println(String s) {
        bodyBuilder.append(s);
        bodyBuilder.append("\r\n");
    }

    public void writeAndFlush(OutputStream os) throws IOException {
        // 1. 组装 response
        StringBuilder responseBuilder = new StringBuilder();
        // 组装了状态行
        responseBuilder.append("HTTP/1.0 ");
        responseBuilder.append(status);
        responseBuilder.append("\r\n");
        // 组装响应头
        if (bodyBuilder.length() != 0) {
            // 计算 Content-Length
            int contentLength = bodyBuilder.toString().getBytes("UTF-8").length;
            setHeader("Content-Length", String.valueOf(contentLength));
        }
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            responseBuilder.append(entry.getKey());
            responseBuilder.append(": ");
            responseBuilder.append(entry.getValue());
            responseBuilder.append("\r\n");
        }
        responseBuilder.append("\r\n");
        responseBuilder.append(bodyBuilder);
        // 2. 发送
        os.write(responseBuilder.toString().getBytes("UTF-8"));
        os.flush();
    }
}

