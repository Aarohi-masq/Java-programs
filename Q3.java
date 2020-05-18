public class Q3
{
	public static void main(String ar[])
	{
		int a=3;
		Integer i=Integer.valueOf(a);
		System.out.println(a+"(declaration of int)");
		System.out.println(i+"(int to Integer)");
		String s=String.valueOf(i);
		int b =Integer.parseInt(s);
		String s1=Integer.toString(b);
		Integer i1=Integer.valueOf(s1);
		int c=i1.intValue();
		System.out.println(s+"(Integer to String)");
		System.out.println(b+"(String to int)");
		System.out.println(s1+"(int to String)");
		System.out.println(i1+"(String to Integer)");
		System.out.println(c+"(Integer to int)");
		System.out.println("Aarohi Mangal R134218001");
	}
}