package org.sunbeam.socket.server;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class CommunicationHandler implements Runnable {
	private Socket socket;
	private Thread thread;

	public CommunicationHandler(Socket socket) {
		this.socket = socket;
		this.thread = new Thread(this);
		this.thread.start();
	}

	@Override
	public void run() {
		try (DataInputStream inputStream = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
				DataOutputStream outputStream = new DataOutputStream(
						new BufferedOutputStream(socket.getOutputStream()));
				Scanner sc = new Scanner(System.in);) {
			String message = null;
			do {
				System.out.print("S:Server	:	");
				message = sc.nextLine(); // accept string from server console
				outputStream.writeUTF(message); // send string to client
				outputStream.flush();

				message = inputStream.readUTF(); // Read string send by client
				System.out.println("S:Client	:	" + message); // print string on server console
			} while (!message.equals("end"));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
