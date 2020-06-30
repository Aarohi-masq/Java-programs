import java.sql.*;

class Emp_DB {
    public static void main(String[] args) throws Throwable 
	{
        
        String driverClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost/shop";
        String user = "root";
        String pwd = "toor";
		
        
        Class.forName(driverClassName).newInstance();
		
        
        Connection con = DriverManager.getConnection(url, user, pwd);
		
        System.out.println("con---->" + con);
        
		
		
		
        Statement st = con.createStatement();
        String sql= "Insert into emp_details(name,city,mobno,salary) value ('Bhawana', 'Ahemdabad', 5467571988, 60000)"; 
		
        st.executeUpdate(sql);
		
        
        st.close();
        con.close();
        System.out.println("---Aarohi R134218001 SQL executed successfully---");
    }
}