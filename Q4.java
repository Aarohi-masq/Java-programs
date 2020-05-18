public class Q4
{
	public static void main(String ar[])
	{
		float a=3.5f;
		Float i=Float.valueOf(a);
		System.out.println(a+"(declaration of int)");
		System.out.println(i+"(float to Float)");
		String s=String.valueOf(i);
		float b =Float.parseFloat(s);
		String s1=Float.toString(b);
		Float i1=Float.valueOf(s1);
		float c=i1.floatValue();
		System.out.println(s+"(Float to String)");
		System.out.println(b+"(String to float)");
		System.out.println(s1+"(float to String)");
		System.out.println(i1+"(String to Float)");
		System.out.println(c+"(Float to float)");
		System.out.println("Aarohi R134218001");
	}
}