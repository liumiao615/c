public class httpdemo{
	public static void main(String[] args){
		//请求是get方法，没有请求体
		String request = "GET / HTTP/1.0\r\n"
		+"Host: www.baidu.com\r\n"
		+"\r\n";
		
		//建立tcp连接
		Socket socket = new Socket("www.baidu.com",80);
		OutputStream os = socket.getOutputStream();
		PrintWriter writer = new PrintWriter(new OutputStreamWriter(os,"UTF-8"));
		//发送HTTP请求
		writer.print(request);
		writer.flush();
		
		//接收百度发回的Http响应
		InputStream is = socket.getInputString();
		byte[] buffer = new byte[8192];
		int len = is.read(buffer);
		String response = new String(buffer,0,len,"UTF-8");
		//打印响应
		System.out.println(response);
		socket.close();
	}
}