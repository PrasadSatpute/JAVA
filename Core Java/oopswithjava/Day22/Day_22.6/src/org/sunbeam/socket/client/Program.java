package org.sunbeam.socket.client;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Program {
	public static final String host = "localhost"; // 127.0.0.1
	public static final int PORT = 2102;

	public static void main(String[] args) {
		try (Socket socket = new Socket(host, PORT);
				DataInputStream inputStream = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
				DataOutputStream outputStream = new DataOutputStream(
						new BufferedOutputStream(socket.getOutputStream()));
				Scanner sc = new Scanner(System.in);) {

			String message = null;
			do {
				message = inputStream.readUTF(); // Read string send by server
				System.out.println("C:Server	:	" + message); // print string on client console

				System.out.print("C:Client	:	");
				message = sc.nextLine(); // Read string from client console
				outputStream.writeUTF(message); // send string to the server
				outputStream.flush();
			} while (!message.equals("end"));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
