package com.core;

import java.util.Scanner;

public class Arraydemo {
	public static void main(String[] args) {
		int a[]=new int[5];
		int i,j,sum=0,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Element");
		for(i=0;i<a.length;i++);
		{
		System.out.println("Enter"+i+"Element");
		a[i]=sc.nextInt();
		sum=sum+a[i];
		}
		System.out.println("Sum of Array Element"+sum);
		System.out.println("Array Element are");
		for(i=0;i<a.length;i++);
		{
			System.out.println("A["+i+"]="+a[i]);
		}
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}

		
	}
	}
}
