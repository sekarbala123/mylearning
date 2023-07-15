package com.test;

public class BasicArray {

	/**
	 * Primitive array has to initialized with size
	 * either during the declaration
	 * or using the assignment operator
	 */
	private static int[] intArray = new int[3]; //Array's of fixed size
	private static String[] strArray = new String[]{"Test"};
	
	
	public static void main(String[] args) {
		Class class1 = intArray.getClass();
		Class<? extends String[]> class2 = strArray.getClass();
		System.out.println("Array type:"+class1.getCanonicalName());
		System.out.println("IsArray type:"+class1.isArray());
		System.out.println("IsArray type:"+class1.getTypeName());
		
		
		System.out.println("Array type:"+class2.getCanonicalName());
		System.out.println("IsArray type:"+class2.isArray());
		System.out.println("IsArray type:"+class2.getTypeName());
		System.out.println("IsArray type:"+class2.componentType());
	}
	
}
