import java.util.*;
class Unchecked
{
	static void Array() throws Exception
	{
		int a[]= new int[3];
		a[4]=5;
	}
	public static void main(String ar[])
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		try{
			Array();
			if (b==5)
		throw new ArithmeticException("Not Valid");
	    try
	    {
		   c=a/b;
	    }
	    catch(Exception e)
	    {
		   System.out.println("unChecked");
	    }
		
		}
		catch (ArithmeticException e)
		{
			System.out.println("Checked");
		}
		finally 
		{
			System.out.println("Rest");
		}
	}
}