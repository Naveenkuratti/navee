package com;

import java.util.Arrays;

public class Test {
public static void main(String[] args) {
	String arr[] = {"3","30","34","5","9"};
	System.out.println(largestNumber(arr));
}
public static String largestNumber (String arr[]) {
	//3,30,34,5,9
	Arrays.sort(arr, (num1,num2)->(num2+num1).compareTo(num1+num2));
	String  str="";
	for(String s:arr){
		str=str+s;
		
	}
	return str;
}
}
