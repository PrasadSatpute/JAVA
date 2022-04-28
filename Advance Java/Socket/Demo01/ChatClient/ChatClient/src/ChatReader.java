import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatReader extends Thread {
	Socket sc;

	public ChatReader(Socket sc) {
		this.sc = sc;
	}

	@Override
	public void run() {
		String str = "";

		while (!str.equals("End")) {
			try {
				BufferedReader in = new BufferedReader(new InputStreamReader(sc.getInputStream()));
				str = in.readLine();
				System.out.println("Server says-->"+str);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
