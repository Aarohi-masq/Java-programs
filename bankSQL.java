import java.sql.*;

class bank {
    public static void main(String[] args) throws Throwable 
	{
        String driverClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost/jdbc";
        String user = "root";
        String pwd = "toor";
		
        Class.forName(driverClassName).newInstance();
		
        Connection con = DriverManager.getConnection(url, user, pwd);
		
        System.out.println("con---->" + con);
  
        Statement st = con.createStatement();
        String sql = "INSERT INTO bank VALUE(01,'Aarohi',8001)";
		String sql3 = "INSERT INTO bank VALUE(03,'rohi',78001)";
        st.executeUpdate(sql);
		st.executeUpdate(sql3);
		int a=67;
		int b=45;
		System.out.println("Withraw ammount= "+a);
		System.out.println("Deposit ammount= "+b);
		String sql1 = "UPDATE bank Set amnt=amnt+45-67 where ID=01";
		st.executeUpdate(sql1);
		String sql2="DELETE from bank where ID=01";
		st.executeUpdate(sql2);
        st.close();
        con.close();
        System.out.println("---Aarohi R134218001 SQL executed successfully---");
		
    }
}