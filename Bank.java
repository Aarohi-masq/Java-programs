import java.util.Scanner;
class Bank
{
long acc_no;
String name;
long amount;
long deposit;
long withdraw;
public void insertData()
{
Scanner s=new Scanner (System.in);
System.out.println("enter account number");
acc_no=s.nextLong();
System.out.println("enter name");
name=s.next();
System.out.println("enter amount");
amount=s.nextLong();
}
public void deposit()
{
Scanner s=new Scanner (System.in);
System.out.println("enter amount to be deposited");
deposit=s.nextLong();
amount=amount-deposit;
System.out.println(amount);
}
public void withdraw()
{
Scanner s=new Scanner (System.in);
System.out.println("enter amount to be withdrawn");
withdraw=s.nextLong();
amount=amount+withdraw;
System.out.println(amount);
}
}
class New{
public static void main(String a[])
{
Bank b=new Bank();
b.insertData();
b.deposit();
b.withdraw();
}
}


