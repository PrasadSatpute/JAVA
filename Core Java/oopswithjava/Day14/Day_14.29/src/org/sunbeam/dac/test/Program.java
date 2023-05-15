package org.sunbeam.dac.test;

import java.util.StringTokenizer;

public class Program {
	public static void main(String[] args) {
		String str = "https://classroom.udacity.com/nanodegrees/nd064-1/parts/30cb07da-8fd4-4438-a209-b3457adb5d82/modules/7b21dfa4-aac8-4d24-82c5-65325e6dc691/lessons/092ac437-081d-4946-b54d-a2f537931c13/concepts/c42a8b82-a44a-4250-8f41-05999db57475#";
		String delim = "/:-.//#";
		StringTokenizer stk = new StringTokenizer(str, delim, true);
		
		String token  = null;
		while( stk.hasMoreTokens()) {
			token = stk.nextToken();
			System.out.println(token);
		}
	}
	public static void main5(String[] args) {
		String str = "https://classroom.udacity.com/nanodegrees/nd064-1/parts/30cb07da-8fd4-4438-a209-b3457adb5d82/modules/7b21dfa4-aac8-4d24-82c5-65325e6dc691/lessons/092ac437-081d-4946-b54d-a2f537931c13/concepts/c42a8b82-a44a-4250-8f41-05999db57475#";
		String delim = "/:-.//";
		StringTokenizer stk = new StringTokenizer(str, delim);
		
		String token  = null;
		while( stk.hasMoreTokens()) {
			token = stk.nextToken();
			System.out.println(token);
		}
	}
	public static void main4(String[] args) {
		String str = "www.yahoo.com";
		StringTokenizer stk = new StringTokenizer(str, ".");
		
		String token  = null;
		while( stk.hasMoreTokens()) {
			token = stk.nextToken();
			System.out.println(token);
		}
	}
	public static void main3(String[] args) {
		String str = "SunBeam Infotech Pune";
		StringTokenizer stk = new StringTokenizer(str);
		
		String token  = null;
		while( stk.hasMoreTokens()) {
			token = stk.nextToken();
			System.out.println(token);
		}
	}
	public static void main2(String[] args) {
		String str = "SunBeam Infotech Pune";
		StringTokenizer stk = new StringTokenizer(str);
		
		String token  = null;
		while( stk.hasMoreElements()) {
			token = (String) stk.nextElement();
			System.out.println(token);
		}
	}
	public static void main1(String[] args) {
		String str = "SunBeam Infotech Pune";
		StringTokenizer stk = new StringTokenizer(str);
		int count = stk.countTokens();
		System.out.println("Count	:	"+count);
	}
}
