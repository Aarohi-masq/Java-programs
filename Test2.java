 class Animal
{
	final int m;
	void m1(){
		System.out.println("Animals");
	}
}
class Dog extends Animal{
	void m1()
	{
		System.out.println("Dog");
	}
}
class Test{
	public static void main()
	{
		Dog d= new Dog();
		d.m1();
		d.m=5;
	}
}
	