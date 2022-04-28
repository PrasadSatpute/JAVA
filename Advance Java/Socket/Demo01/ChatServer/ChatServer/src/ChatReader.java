import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatReader extends Thread{
	ServerSocket ss;
	Socket s;
	public ChatReader(Socket s, ServerSocket ss) {
		this.s=s;
		this.ss=ss;
	}
	
	@Override
	public void run() {
		
		BufferedReader in;
		try {
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String str="";
			while(!str.equals("End")) {
			str=in.readLine();
			System.out.println("Client says-->"+str);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
	
}
