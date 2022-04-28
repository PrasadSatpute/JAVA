import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatWriter extends Thread{
	ServerSocket ss;
	Socket s;
	
	public ChatWriter(ServerSocket ss, Socket s) {
		this.ss=ss;
		this.s=s;
	}

	@Override
	public void run() {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		
		while(!str.equals("End")) {
		System.out.println("enter a msg");
		try {
			str=in.readLine();
			PrintWriter out=new PrintWriter(s.getOutputStream(),true);
			out.println(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		}
	}
	
}
