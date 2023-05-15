package org.sunbeam.socket.server;
import java.net.ServerSocket;
import java.net.Socket;
public class Program {
	public static final int PORT = 2102;
	public static void main(String[] args) {
		try( ServerSocket serverSocket = new ServerSocket( PORT ); ){	
			System.out.println("Server is ready...");
			while( true ) {
				Socket socket = serverSocket.accept();
				new CommunicationHandler( socket );
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
