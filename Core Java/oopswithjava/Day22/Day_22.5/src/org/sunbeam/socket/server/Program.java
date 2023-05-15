package org.sunbeam.socket.server;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Program {
	public static final int PORT = 2102;
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		DataInputStream inputStream = null;
		DataOutputStream outputStream = null;
		Scanner sc = null;
		try {
			serverSocket = new ServerSocket( PORT );
			System.out.println("Server is ready...");
			Socket socket = serverSocket.accept();//Blocking Call	//Listening for incoming client request
			//socket contains reference of connected client. It is also called as proxy
			
			inputStream = new DataInputStream(new BufferedInputStream( socket.getInputStream()));
			outputStream = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
			sc = new Scanner(System.in);
			String message = null;
			do {
				System.out.print("S:Server	:	");
				message = sc.nextLine();	//accept string from server console
	 			outputStream.writeUTF(message); //send string to client
	 			outputStream.flush();
	 			
	 			
	 			message = inputStream.readUTF(); //Read string send by client
	 			System.out.println("S:Client	:	"+message); //print string on server console
			}while( !message.equals("end"));
 			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				sc.close();
				inputStream.close();
				outputStream.close();
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
