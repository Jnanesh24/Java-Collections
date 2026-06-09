package com.coadingtest;

import java.util.Scanner;

public class RevString {

	public static void main(String[] args) {
		                                         
		String str="Hello Jnanesh";
		String rev=" ";                                       
		 
	/*	int len=str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		
		}
		System.out.println("Rev number is :"+rev);    */
		
		char a[]=str.toCharArray();
		int len=a.length;
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println("Rev String is :"+rev);
		

	}

}
