import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Test {
	public static void main(String[] args) {
		System.out.println("client Started....");
		Socket sc=null;
		try {
			sc=new Socket("localhost",9552);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		ChatWriter cw=new ChatWriter(sc);
		ChatReader cr=new ChatReader(sc);
		cw.start();
		cr.start();
		
	}
	
}
