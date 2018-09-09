import java.util.Scanner;
public class fizzBuzz
{
	public static void main(String args [])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("What numbers do you want to play Fizz Buzz with?");
		System.out.println("Please press Enter after each number");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		for(int i=0;i<101;i++)
		{
			Decider(i,num1,num2);
		}
	}
	public static void Decider(int num,int num1,int num2)
	{
		if(num%num2==0&&num%num1==0)
		{
			System.out.println("Fizz Buzz");
		}
		else if(num%num1==0)
		{
			Fizz(num);
		}
		else if(num%num2==0)
		{
			Buzz(num);
		}
		else
		{
			System.out.println(num);
		}
	}
	public static void Buzz(int num)
	{
		System.out.println("Buzz");
	}
	public static void Fizz(int num)
	{
		System.out.println("Fizz");
	}
}