package com.coadingtest;

public class RotateLeft

{
	public static int[] rotateLeft3(int[]z)
	{
		int[]c={z[1],z[2],z[0]};
		printarr(c);
		return c;
	}
	public static void printarr(int[]d)
	{
		for(int i=0;i<=d.length-1;i++)
		{
             System.out.print(d[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[]a={1,2,3};
		rotateLeft3(a);
		
		int[]b={5,11,9};
		rotateLeft3(b);
		
		int[]c={7,0,0};
		rotateLeft3(c);
	}
	

}
