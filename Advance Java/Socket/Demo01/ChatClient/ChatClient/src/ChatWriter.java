import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatWriter extends Thread {
	Socket sc;

	public ChatWriter(Socket sc) {
		this.sc = sc;
	}

	@Override
	public void run() {
		BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
		String str = "";

		while (!str.equals("End")) {
			System.out.println("enter a msg ");
			try {
				str = userInput.readLine();
				PrintWriter out = new PrintWriter(sc.getOutputStream(), true);
				out.println(str);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
