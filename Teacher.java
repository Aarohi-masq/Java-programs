abstract class Principle
{
	abstract void signature();
	Principle()
	{
		System.out.println("hy, constructor here");
	}
}
class Teacher extends Principle
{
	void signature()
	{
		System.out.println("Aarohi "+"R134218001");
	}
	public static void main(String a[])
	{
		Teacher t= new Teacher();
		t.signature();
	}
}
	