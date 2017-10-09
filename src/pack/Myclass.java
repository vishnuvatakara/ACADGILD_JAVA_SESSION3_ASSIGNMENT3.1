package pack;

import java.util.Scanner;

public class Myclass {
	int no,age;
	String name;
	static String clgname="fisat";//Static varible
	Scanner sc=new Scanner(System.in);
	
	public void get()
	{	//reading details
		System.out.println("enter the student name");
		name=sc.nextLine();
		System.out.println("enter the roll num age");
		no=sc.nextInt();
		System.out.println("enter the  age");
		age=sc.nextInt();
		clgname="scms";//reassign static varible
	}
	public void display()
	{
		
		System.out.println(name);
		System.out.printf("age is "+age);
		System.out.printf("\nroll num is "+no);
		
	}
	public static void main(String args[])
	{	Myclass my=new Myclass();
		my.get();
		System.out.println("student details");
		System.out.print("collage name ");
		System.out.println(clgname);//call static varible directly
		my.display();
	}

}
