package com.test;

public class AddTwoSum {

	private static int[] input = new int[]{4,7,2,5,3};
	static int target = 8;
	
	public static void findTarget(int target) {
		boolean found =false;
		for(int i=0; i< input.length-1; i++) {
			for(int j=i+1; j< input.length; j++) {
				if(input[i]+input[j] > target)
					break;
				System.out.println("i:"+i+",j: "+j);
				if(target == input[i]+input[j]) {
					System.out.println("Target: "+target+"="+i+"("+input[i]+")+"+j+"("+input[j]+")");
					found = true;
					break;
				}
			}
			if(found) break;
		}
		System.out.println(found?"Found!":"Not Found :(");
	}
	
	private static int[] sampleAr = new int[9]; 
	public static void addArray() {
		for(int i=0; i<10; i++) {
			sampleAr[i] = i;
		}
		for(int i=0; i<10; i++) {
			System.out.println(sampleAr[i]);
		}
	}
	
	public static void main(String[] args) {
//		findTarget(target);
		addArray();
	}
	
}
