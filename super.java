class A 
{
	A()
	{
		System.out.println("Grand parent");
	}
}
class B extends A
{
	B()
	{
		System.out.println("Immediate Parent");
	}
}
class C extends B
{
	C()
	{
		//super();
		System.out.println("Child");
	}
	public static void main( String a[])
	{
		C c= new C();
	}
}
	
	
