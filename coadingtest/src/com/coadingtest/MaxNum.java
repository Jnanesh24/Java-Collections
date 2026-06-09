package com.coadingtest;

public class MaxNum {

	public static void main(String[] args) {
		
		int a[]= {100,800,1000,1500};
		
		int min=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			
		}
		System.out.println(" Max num is : "+min);

	}

}
