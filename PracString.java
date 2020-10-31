class PracString{
	public static void main(String a[]){
		char[] c={'s','h','r','u','t','i'};
		String s=new String(c);
		String s1="shruti";
		String s2="shruti";
		String s3="shruti";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
		s1=s1.concat(" ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
	}
}
