 class Animal
{
	final void m1(){
		System.out.println("Animals");
	}
}
class Dog extends Animal{
	void m2()
	{
		System.out.println("Dog");
	}
}
class Test{
	public static void main(String a[])
	{
		Dog d= new Dog();
		d.m1();
	}
}
	
