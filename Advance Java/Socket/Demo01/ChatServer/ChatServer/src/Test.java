import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Test {
	public static void main(String[] args) {
		ServerSocket ss=null;
		Socket s=null;
		System.out.println("Server started");
		
		try {
			ss = new ServerSocket(9552);
			s=ss.accept();
			System.out.println("connection enstabilished ");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		ChatReader cr=new ChatReader(s,ss);
		ChatWriter cw=new ChatWriter(ss, s);
		cr.start();		
		cw.start();
	}
}
