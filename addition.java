package com.core;

import java.util.Scanner;

public class addition {
public static void main(String[] args) {
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter A:");
	a=sc.nextInt();
	System.out.println("Enter B:");
	b=sc.nextInt();
	c=a+b;
	System.out.println("addition"+c);
	c=a-b;
	System.out.println("subtraction"+c);
	c=a*b;
	System.out.println("multiplication"+c);
	c=a/b;
	System.out.println("division"+c);
}
}