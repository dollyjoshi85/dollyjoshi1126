package com.core;

import java.util.Scanner;

public class IfCondition {
	public static void main(String[] args) 
    {
	int a;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter A and B:");
	a=sc.nextInt();
	if(a>0	)
	{
		System.out.println("A is positive number");
	}
	else
	{
		System.out.println("A is negative number");
		
	}
    }
}


