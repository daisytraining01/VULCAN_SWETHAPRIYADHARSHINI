package com.picnic.swetha;

import java.util.Scanner;

public class Question6
{
	public static void main(String args[])
	{
		// Program to Check Whether the string is Palindrome or not 
		String a,rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		a=sc.nextLine();
		int length = a.length();
		for(int i=length-1;i>=0;i--)
		rev=rev+a.charAt(i);
			if(a.contentEquals(rev))
				System.out.println(a+ " is a Palindrome"); 
			else
				System.out.println(a+  " not a Palindrome");
	}
			
}
/* Output:
 * Enter the string:
radar
radar is a Palindrome
 */


	


