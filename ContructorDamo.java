package com.core;

import java.util.Scanner;

public class ContructorDamo {
	int rno;
	String sname;
	double per;
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter roll no:");
		rno=sc.nextInt();
		System.out.println("Enter secound name");
		
		
	}
	public static void main(String[] args) {
		box b1=new box();
		b1.volume();
		box b2=new box(4,5,6);
		b2.volume();
		box b3=nre box(b2);
		b3.volume();
	}

}
