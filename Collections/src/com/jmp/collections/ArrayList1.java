package com.jmp.collections;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		al.add("Hello World");
		al.add(9663520403l);
		al.add("Putti");
		al.add(10.00);
		
		al.remove(2);
		 System.out.println(al.size());
		
		
		System.out.println(al);

	}

}
