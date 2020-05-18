interface Principle
{
	void signature();
}
class Teacher implements Principle
{
	public void signature()
	{
		System.out.println("Aarohi "+"R134218001");
	}
	public static void main(String a[])
	{
		Teacher t= new Teacher();
		t.signature();
	}
}
	