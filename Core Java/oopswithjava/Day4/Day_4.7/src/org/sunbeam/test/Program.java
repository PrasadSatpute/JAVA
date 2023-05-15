package org.sunbeam.test;
public class Program {
	public static void main(String args) {
		System.out.println("public static void main(String args)");
	}
	public static void main(String[] args) {	
		System.out.println("public static void main(String[] args)");
		Program.main("");
	}
}
//Output : public static void main(String[] args)
//public static void main(String args)