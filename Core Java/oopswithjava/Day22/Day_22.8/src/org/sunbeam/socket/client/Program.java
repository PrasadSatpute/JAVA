package org.sunbeam.socket.client;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Program {
	public static final int PORT = 4312;
	public static void main(String[] args) {
		String message = null;
		Scanner sc = null;
		byte[] buffer = null;
		
		DatagramSocket  socket = null;
		try {
			sc = new Scanner(System.in);
			socket = new DatagramSocket( );
			while( true ) {
				System.out.print("C:Client	:	");
				message = sc.nextLine();
				buffer = message.getBytes();
				DatagramPacket sendPacket = new  DatagramPacket(buffer, buffer.length, InetAddress.getByName("localhost"), PORT);
				socket.send(sendPacket);
				
				buffer = new byte[ 1024 ];
				DatagramPacket receivePacket = new DatagramPacket(buffer, buffer.length);
				socket.receive(receivePacket);
				message = new String( receivePacket.getData());
				System.out.println("C:Server	:	"+message);
			}
			
		}catch( Exception ex ) {
			ex.printStackTrace();
		}finally {
			sc.close();
			socket.close();
		}
	}

}
