class MyThread1 extends Thread
{
	public void run()
	{
		for(int i=0; i<10; i++)
	{
		System.out.println(i);
	}
	}
}
class MyThread2 extends Thread{
	public void start()
	{
		super.start();
		System.out.println("hy");
	}
	public void run()
	{
		for(int i=0; i<10; i++)
	{
		System.out.println(i);
	}
	}
}
class Mythread 
{
	public static void main(String a[])
	{
		MyThread1 mt1= new MyThread1();
		MyThread2 mt2= new MyThread2();
		
		mt2.start();
		//mt1.start();
	}
}