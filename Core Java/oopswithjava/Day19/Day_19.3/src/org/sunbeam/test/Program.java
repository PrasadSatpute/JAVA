package org.sunbeam.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Program {
	private static void printTypeInfo(Class<?> c) {
		String name = c.getName();
		System.out.println("F.Q.Class Name	:	"+name);
		System.out.println();
	}
	private static void printFieldInfo(Class<?> c) {
		Field[] fields = c.getFields();
		for (Field field : fields) {
			System.out.println(field.toString());
		}
		System.out.println();
	}
	private static void printConstructorInfo(Class<?> c) {
		Constructor<?>[] constructors = c.getConstructors();
		for (Constructor<?> constructor : constructors) {
			System.out.println(constructor.toString());
		}
		System.out.println();
	}
	private static void printMethodInfo(Class<?> c) {
		Method[] methods = c.getMethods();
		for (Method method : methods) {
			System.out.println(method.toString());
		}
	}
	public static void main(String[] args) {
		Class<?> c = Thread.class;
		
		Program.printTypeInfo( c );
		
		Program.printFieldInfo( c );
		
		Program.printConstructorInfo( c );
		
		Program.printMethodInfo( c );
	}
}
