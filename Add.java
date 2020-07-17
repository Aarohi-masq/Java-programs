class Sum{
void sum(int a)
{
System.out.println("1");
}
void sum(double a)
{
System.out.println("2");
}
}
class New{
public static void main(String a[]){
Sum s= new Sum();
s.sum(2);
s.sum(3.5);
}
}