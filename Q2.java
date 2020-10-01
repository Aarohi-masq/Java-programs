public class Q2
{
	public static void main(String a[])
	{
		 int hashValue = Integer.hashCode(15);  
         System.out.println("Hash code Value for object is: " + hashValue);
		 String s="Aarohi";
		 String s1= new String("Aarohi");
		 String s2=s1.intern();
		 System.out.println(s.trim()+"Mangal");
		 System.out.println (s1==s2);
         System.out.println (s1==s);
         System.out.println("Length of s"+s.length());
        String re= s.replace('a','x');
        System.out.println(re);
        System.out.println(s.substring(1,3));
	}
}	
