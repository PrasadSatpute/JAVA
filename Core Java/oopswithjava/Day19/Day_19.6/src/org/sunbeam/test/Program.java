package org.sunbeam.test;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Scanner;

import org.sunbeam.util.Convert;

public class Program {
	public static void main(String[] args) {
		//Use java.lang.reflect.Array class
		try( Scanner sc = new Scanner(System.in)){
			System.out.print("Type Name	:	");
			String type = sc.nextLine();
			System.out.print("length	:	");
			int length = sc.nextInt();
			//Use Reflection to create array instance and to set and get values at runtime
		}
	}
	public static void main1(String[] args) {
		try( Scanner sc = new Scanner(System.in)){
			//Step 1 : Accept F.Q.Class Name from terminal
			System.out.print("F.Q.Class Name	:	");
			String className = sc.nextLine();	//org.sunbeam.util.Calculator
			
			//Step 2 : Accept method name from terminal
			System.out.print("Method Name	:	");
			String methodName = sc.nextLine();	//sub
			
			//Step 3 : Get the reference of Class class instance associated with runtime class
			Class<?> c = Class.forName(className);
			
			//Step 4 : Find method and call method on instance of runtime class
			Method[] methods = c.getMethods();
			for (Method method : methods) {
				if( method.getName().equals(methodName)) {
					//Step 5: Accept method arguments
					Object[] arr = new Object[ method.getParameterCount() ];
					Parameter[] parameters = method.getParameters();
					for( int index = 0; index < parameters.length; ++ index ) {
						String type =  parameters[ index ].getType().getName();
						System.out.println("Enter value for the argument of type "+type+" : ");
						String value = sc.nextLine();
						arr[ index ] =  Convert.changeType(type, value);
					}
					
					//Step 6 : Create a new instance of the class represented by this Class object.
					Object calculatorInstance = c.newInstance();
					
					//Step 7 : Invoke method on instance
					Object result = method.invoke(calculatorInstance,arr );
					System.out.println("Result	:	"+result);
					break;
				}
			}
		}catch( Exception ex ) {
			ex.printStackTrace();
		}
	}
}
