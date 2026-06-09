package com.coadingtest;

public class DuplicatesArray {

	public static void main(String[] args) 
	{
		String arr[]= {"Jnanesh","Vitthal","Vinod","Sachin","jnanesh"};
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicates Found : ");
					
					flag=true;
				}
			}
		}
		if(flag==false)
		{
			System.out.println("Duplictes not Found");
		}

	}

}
