package com.core;

import java.util.Scanner;

public class loopstatment {
public static void main(String[] args) {
	int i,n,sum=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter n:");
	n=sc.nextInt();
	for(i=0;i<10;i++)
	{
		sum=sum+i;
	}
System.out.println("sum:"+sum);
}
}