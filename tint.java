interface Principle
{
	void signature();
}
interface VicePrinciple
{
	void sno();
}
class Teacher implements Principle, VicePrinciple
{
	public void signature()
	{
		System.out.println("Aarohi "+"R134218001");
	}
	public void sno()
	{
		System.out.println("500067432");
	}
	public static void main(String a[])
	{
		Teacher t= new Teacher();
		t.signature();
		t.sno();
	}
}
	