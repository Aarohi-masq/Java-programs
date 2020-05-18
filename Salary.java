import java.util.*;
class Worker
{
	String name;
	int sal;
	int h;
	int ComPay()
	{
		int t_sal;
		t_sal=h*sal;
		return t_sal;
	}
		
}
class DailyWorker extends Worker
{
	int days;
	DailyWorker()
	{
		Scanner scan= new Scanner(System.in);
		days=scan.nextInt();
	}
		
	int ComPay()
	{
		int t_sal;
		t_sal=days*sal;
		return t_sal;
	}
}
class SalariedWorker extends Worker
{
	int ComPay()
	{
		int t_sal;
		t_sal=40*sal;
		return t_sal;
	}
}
class Salary
{
	public static void main(String a[])
	{
		DailyWorker d =new DailyWorker();
		SalariedWorker s= new SalariedWorker();
		Scanner scan= new Scanner(System.in);
		System.out.println("Daily Worker:");
		d.name=scan.next();
		d.sal=scan.nextInt();
		System.out.println("Total Salary:"+d.ComPay());
		System.out.println("Salaried Worker:");
		s.name=scan.next();
		s.sal=scan.nextInt();
		System.out.println("Total Salary:"+s.ComPay());
		System.out.println("Aarohi "+"R134218001");
	}
}