package HttpServerTest;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;




public class WebServ {

	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		ServerSocket servSocket = new ServerSocket(81);
		while (true){
			Socket socket = servSocket.accept();
			try (InputStream in = socket.getInputStream();
					OutputStream out = socket.getOutputStream()){
				byte[] response = new Date().toString().getBytes();
				out.write(response);
				out.write(10);
				byte[] hw = "Hello World".getBytes();
				out.write(hw);
			} finally {
				socket.close();
			}
		}

	}

}
