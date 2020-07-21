import java.util.Scanner;
class Rectangle
{
int l,b,area;
public void insertData()
{
Scanner s=new Scanner (System.in);
System.out.println("enter length");
l=s.nextInt();
System.out.println("enter length");
b=s.nextInt();
}
public void getData()
{

area=l*b;
System.out.println(area);
}
}
class Calculate
{
public static void main(String a[])
{
Rectangle r=new Rectangle();
r.insertData();
r.getData();

}
}
