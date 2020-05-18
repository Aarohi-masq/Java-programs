class Test{
	public static void main(String a[])
	{
		try{
		int data = 50/0;}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println ("Exception handled");
	}
}