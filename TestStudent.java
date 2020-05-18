class Student
{
int roll;
String name;
double marks;
public void setData(int r,String s, double m)
{
roll=r;
name=s;
marks=m;
}
public void getData()
{
System.out.println("Rollno:"+roll);
System.out.println("Name:"+name);
System.out.println("Marks:"+marks);
}}
class TestStudent{
public static void main(String args[])
{
Student s1=new Student();
s1.setData(1, "aarohi", 82);
s1.getData();
System.out.println();
Student s2=new Student();
s2.setData(11, "aditi",90);
s2.getData();
System.out.println();
}}