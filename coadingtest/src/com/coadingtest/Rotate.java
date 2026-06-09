package com.coadingtest;

public class Rotate { 

	public static void main(String[] args) {
		// 1,2,3,4,5,6,7
		int a[]= {1,2,3,4,5,6,7};
		int b=2,n=a.length;
		int temp[] =new int[b];
		
		 temp[0]=1;
		 temp[1]=2;
		 
		 for(int i=2;i<=a.length-3;i++)
		 {
			 a[i]=a[i+2];
			 if(i==a.length-3)
			 {
				 a[i+1]=temp[0];
				 a[i+2]=temp[1];
			 }
		 }
		 for(int j=0;j<a.length;j++)
		 {
			 System.out.print(" "+a[j]);
		 }
		
		
	

	}

}
