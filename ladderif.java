package com.core;

import java.util.Scanner;

import javax.annotation.processing.AbstractProcessor;

public class ladderif {
public static void main(String[] args) {
	int rno,s1,s2,s3,total;
	double per;
	String sname;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the name of student");
	sname=sc.next();
	System.out.println("Enter roll number of the student" );
	rno=sc.nextInt();
	System.out.println("Enter mark of subject");
	total=sc.nextInt();
	per=total/3;
	s1=sc.nextInt();
	System.out.println("Enter the mark s1 subject");
	s2=sc.nextInt();
	System.out.println("Enter the mark s2 subject");
	s3=sc.nextInt();
	System.out.println("enter the mark s3 subject");
	if(per>70)
	{
		System.out.println("destination");
	}
	else if(per>60)
	{
		System.out.println("frist class");
	}
	else if(per>50)
	{
		System.out.println("secound class");
	}
	else
	{
		System.out.println("fail");
	}
}
}
