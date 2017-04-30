import java.util.*;
class Highest
{
	public static void main(String args[])
{
	Scanner g= new Scanner(System.in);
	System.out.println("enter three numbers.");
	int a=g.nextInt();
	int b=g.nextInt();		//input numbers through scanner
	int c=g.nextInt();
	if(c>b)
	{
		if(a>c)						//prints a if a is greater than c
		{System.out.println(a +" is the highest number.");}
		if(a<c)						///prints c if c is greater than a
		{System.out.println(c+" is the highest number.");}
	}
	if(b>c)
	{
		if(a<b)						//prints b if b is greater than a
		{ System.out.println(b+" is the largest number.");}
		if(a>b)						//prints a if a is greater than b
		{ System.out.println(a+" is the largest number.");}
	}
}
}