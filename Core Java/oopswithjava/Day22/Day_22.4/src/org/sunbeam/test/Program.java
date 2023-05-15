package org.sunbeam.test;

import java.net.InetAddress;
import java.net.UnknownHostException;

//URL : protocol://domain-name:port number/path name
//https://www.sunbeaminfo.com:8080/students/index.html
//Protocol : http, https, tcp, udp, ftp, telnet, ssh etc
//domain name :  www.sunbeaminfo.com -> mapped to -- ip address
//Port number : 8080
//Path : /students/index.html : 1. Application name 2. Resource name

public class Program {
	public static void main(String[] args) {
		try {
			InetAddress localhost = InetAddress.getLocalHost();
			String hostName = localhost.getHostName();
			String hostAddress = localhost.getHostAddress();
			
			System.out.println("Host Name	:	"+hostName);
			System.out.println("Host Address	:	"+hostAddress);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
