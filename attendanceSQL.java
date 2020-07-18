import java.sql.*;
import javax.swing.JOptionPane;
class attendanceSQL {
public static void main(String[] args) throws Throwable 
{
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendance?user=root&password=toor");
    String a=JOptionPane.showInputDialog("Enter Enrollment number:");
    String b=JOptionPane.showInputDialog("Enter SapId:");
	String c=JOptionPane.showInputDialog("Enter Name:");
	String d=JOptionPane.showInputDialog("Enter batch:");
    int tb=Integer.parseInt(b);
    // ? : place holder or parameter (parameterized query) 
    String sql = "INSERT INTO CSF VALUE(?,?,?,?)";
    PreparedStatement st = con.prepareStatement(sql);
    //bind data in PST
    st.setString(1, a);// 1 specifies the first parameter in the query
    st.setInt(2, tb); // 2 specifies the second parameter in the query
    st.setString(3, c);
    st.setString(4, d);
    st.executeUpdate(); //no agrument
    st.close();
    con.close();
    System.out.println("---SQL executed successfully---");
}
}