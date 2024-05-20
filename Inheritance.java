package com.core;

import java.util.Scanner;

class A
{
	int a;
	void getA()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter A");
		a=sc.nextInt();
	}
	void putA()

		{
		System.out.println("a:"+a);
		}
}
	class B extends A
	{
	int b;
	void getB()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter B:");
		b=sc.nextInt();
	}
		void putB()
		{
			System.out.println("B:"+b);
		}
		class B extends C
		int C;
		void getC()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter B:");
			b=sc.nextInt();
		}
		void putC()
		{
			System.out.println("B:"+b);
		}
	}


public class Inheritance {
	public static void main(String[] args) {
		B b1=new B();
		b1.getA();
		b1.getB();
		b1.putA();
		b1.putB();
		
	}

}
