//Create a java program that accept two integer numbers and print sum of number
import java.util.Scanner;
class SumOfTwoNumber
{
	public static void main(String []args)
	{
		//Create an Scanner object that can read data from keyboard
		Scanner kb=new Scanner(System.in);
		int a,b,c;
		System.out.printf("Enter 1st Number:");
		a=kb.nextInt();
		System.out.printf("Enter 2nd Number:");
		b=kb.nextInt();
		c=a+b;
		System.out.printf("%d + %d = %d",a,b,c);
	}
}