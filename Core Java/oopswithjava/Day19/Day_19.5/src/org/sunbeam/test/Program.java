package org.sunbeam.test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Vector;

public class Program {
	private static int capacity(ArrayList<Integer> list) throws Exception {
		Class<?> c = list.getClass();
		Field field = c.getDeclaredField("elementData");
		field.setAccessible(true);
		Object[] arr =  (Object[]) field.get(list);
		return arr.length;
	}
	public static void main(String[] args) {
		try {
			ArrayList<Integer> list = new ArrayList< >( );
			for( int count = 1; count <= 16; ++ count )
				list.add(count);
			System.out.println(Program.capacity( list )+"	"+list.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main1(String[] args) {
		Vector<Integer> v = new Vector<>( );
		for( int count = 1; count <= 11; ++ count )
			v.add(count);
		
		System.out.println(v.capacity()+"	"+v.size());
	}
}
