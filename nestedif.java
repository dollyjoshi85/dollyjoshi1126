package com.core;

import java.util.Scanner;

public class nestedif {
public static void main(String[] args) {
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter A");
	a=sc.nextInt();
	System.out.println("Enter B");
	b=sc.nextInt();
	System.out.println("Enter c");
	c=sc.nextInt();
	if(a>b)
	{
		if(a>c)
		{
			System.out.println("A is Max");
		}
	}
		else
			{
			if(b>c)
		{
			System.out.println("c id Max");
		}
	}
}
}
