package org.sunbeam.test;

import java.util.Arrays;

public class Program {
	public static void main(String[] args) {
		Class<?> c = Thread.class;
		
		String packageName = c.getPackage().getName();
		System.out.println("Package		:	"+packageName);
		
		String name = c.getName();
		System.out.println("F.Q.Name	:	"+name);
		
		String simpleName = c.getSimpleName();
		System.out.println("SimpleName	:	"+simpleName);
		
		String superclass = c.getSuperclass().getSimpleName();
		System.out.println("Super Class	:	"+superclass);
		
		Class<?>[] interfaces = c.getInterfaces();
		System.out.println(Arrays.toString(interfaces));
		
		ClassLoader classLoader = c.getClassLoader();
		System.out.println(classLoader);	//null -> Bootstrap
		
		//System.out.println(Program.class.getClassLoader());//AppClassLoader
		//System.out.println(Program.class.getClassLoader().getParent());//ExtClassLoader
		//System.out.println(Program.class.getClassLoader().getParent().getParent());//null
		
	}
}
