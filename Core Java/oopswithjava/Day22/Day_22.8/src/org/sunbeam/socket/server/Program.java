package org.sunbeam.socket.server;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Program {
	public static final int PORT = 4312;

	public static void main(String[] args) {
		String message = null;
		byte[] buffer = null;
		Scanner sc = null;
		DatagramSocket serverSocket = null;
		try {
			sc = new Scanner(System.in);
			serverSocket = new DatagramSocket(PORT);
			while (true) {
				buffer = new byte[1024];
				DatagramPacket receivePacket = new DatagramPacket(buffer, buffer.length);
				serverSocket.receive(receivePacket);
				message = new String(receivePacket.getData());
				System.out.println("S:Client	:	" + message);

				System.out.print("S:Server	:	");
				message = sc.nextLine();
				buffer = message.getBytes();
				DatagramPacket sendPacket = new DatagramPacket(buffer, buffer.length, receivePacket.getAddress(),
						receivePacket.getPort());
				serverSocket.send(sendPacket);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			sc.close();
			serverSocket.close();
		}
	}

}
