package com.picnic.swetha;

public class Question2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, b=1, c=0, n=10;
		if(n==1)
		{
			System.out.println(a);
		}
		else
		{
			System.out.println("Fibonacci series:");
			System.out.println(a);
			System.out.println(b);
			n=n-2;
			while(n>0)
			{
				c=a+b;
				System.out.println(c);
				a=b;
				b=c;
				n--;
			}
		}
	}
}
/*output:
 * Fibonacci series:
0
1
1
2
3
5
8
13
21
34
*/



