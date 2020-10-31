import java.util.*;
class Employee
{
	String name;
	int empid;
	long salary;
	Employee(){};
	Employee(String n, int e,long s){
		name=n;
		empid=e;
		salary=s;
	}
	void SetData()
	{
		name="Aarohi";
		empid=01;
		salary=500067432;
	}
	void GetData()
	{
		System.out.println(name);
		System.out.println(empid);
		System.out.println(salary);
	}
	void IncreaseSalary()
	{
		Scanner scan= new Scanner(System.in);
		int per= scan.nextInt();
		salary=salary+((salary*per)/100);
		System.out.println("Updated Salary:"+salary);
	}
}
class Manager extends Employee
{
	public static void main(String a[])
	{
		Manager m= new Manager();
		m.SetData();
		m.GetData();
		m.IncreaseSalary();
		System.out.println("Aarohi "+"R134218001");
	}
}
		