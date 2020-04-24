package com.picnic.swetha;

interface MyInterface
{
	//Program using Interface with Method overloading
	public void show();
	public void show (String name, int age);
}
public class Question8 implements MyInterface
{
	String name;
	int age;

	@Override
	public void show() {
		System.out.println("This is the show method of Interface");
	}

	@Override
	public void show(String name, int age) {
		System.out.println("Name: " +name);
		System.out.println("Age: " +age);
	}
	
	public static void main(String args[])
	{
		
		Question8 a = new Question8();
		a.show();
		a.show("priya", 39);
	}
		
	/* output:
	 * This is the show method of Interface
Name: priya
Age: 39
 */	
	
	

		
	

}
