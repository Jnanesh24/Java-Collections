package com.coadingtest;

public class LinearSearch {

	public static void main(String[] args) 
	{
		int a[]= {10,20,30,40,60,80};
		int search_ele=10;
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(search_ele==a[i])
			{
				System.out.println("Search element is found :"+a[i]);
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Search element is not found");
		}

	}

}
