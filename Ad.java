import java.util.*;
class Ad
{
	public static void add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String a[])
	{
		Scanner scan=new Scanner(System.in);
		int num1,num2;
		try
		{
			System.out.println("Enter numbers");
			num1=scan.nextInt();
		    num2=scan.nextInt();
			add(num1,num2);
		}
		
		/*if(num1%10==num1&&num1%10==num1)
			add(num1,num2);
		else 
			throw new ArithmeticException("Not Valid");*/
		catch(InputMismatchException e)
		{
			System.out.println("Invalid");
		}
		finally
		{
			System.out.println("Aarohi Mangal\nR134218001");
		}
	}
}
		