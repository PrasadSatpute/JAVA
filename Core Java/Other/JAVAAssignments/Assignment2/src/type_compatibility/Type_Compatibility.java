package type_compatibility;

public class Type_Compatibility {

	public static void main(String[] args) {
		
		// int : 9348.39
		double n1 = 9348.39;
		int n101 = (int) n1;
		System.out.println("int			:"+n101);
		System.out.println("Size of int		: " + (Integer.SIZE));
		
		//long int : 100
		int n2 = 100;
		long n201 = (long) n2;
		System.out.println("Long int		:"+n201);
		System.out.println("Size of Long int	: " + (Long.SIZE));
		
		//short : 80999
		long n3 = 80999;
		short n301 = (short) n3;
		System.out.println("short			:"+n301);
		System.out.println("Size of short		: " + (Short.SIZE));
		
		//long : 2373467e18
		double n4 = 2373467e18;
		long n401 = (long) n4;
		System.out.println("long			:"+n401);
		System.out.println("Size of long		: " + (Long.SIZE));
		
		//byte : 129
		int n5 = 129;
		byte n501 = (byte) n5;
		System.out.println("byte			:"+n501);
		System.out.println("Size of byte		: " + (Byte.SIZE));
		
		//float : 218.928
		double n6 = 218.928;
		float n601 = (float) n6;
		System.out.println("float			:"+n601);
		System.out.println("Size of float		: " + (Float.SIZE));
		
		//double : 2930.3f
		float n7 = 2930.3f;
		double n701 = (double) n7;
		System.out.println("double			:"+n701);
		System.out.println("Size of double		: " + (Double.SIZE));
		
		//char : -3
		byte n8 = -3;
		char n801 = (char) n8;
		System.out.println("char			:"+n801);
		System.out.println("Size of char		: " + (Character.SIZE));
		
		//boolean : 0
		String n9 = "0";
		boolean n901 = Boolean.parseBoolean(n9);
		System.out.println("boolean			:"+n901);
		


	}

}
