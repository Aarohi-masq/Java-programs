import java.sql.*;
import java.util.*;
class TestSQL
{
	public static void main(String[] args) throws Throwable
	{
		String driverClassName="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost/attendance";
		String user="root";
		String pwd="toor";
		
		Class.forName(driverClassName).newInstance();
		
		Connection con=DriverManager.getConnection(url,user,pwd);
		System.out.println("con---->"+con);
		
		Scanner sc= new Scanner(System.in);
		String a= sc.next();
		int b= sc.nextInt();
		String c=sc.next();
		String d=sc.next();
		int ta= Integer.parseInt(a);
        int tc= Integer.parseInt(c);
        int td= Integer.parseInt(d);
        		
		String sql="Insert Into aarohi value(?,?,?,?)";
		PreparedStatement st=con.prepareStatement(sql);
		
		st.setInt(1,ta);
		st.setInt(2,b);
		st.setInt(3,tc);
		st.setInt(4,td);
		st.executeUpdate();
		
		st.close();
		con.close();
		System.out.println("---SQL executed successfully---");
	}
}