interface Parent
{
	void eat();
	//Parent();
}
class Child implements Parent
{
	public void eat()
	{
		System.out.println("Burger");
	}
	Child()
	{
		super();
		System.out.println("Done");
	}
	public static void main(String a[])
	{
		Child c= new Child();
		c.eat();
	}
}
