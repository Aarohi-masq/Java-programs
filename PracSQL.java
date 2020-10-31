import java.sql.*;
import javax.swing.JOptionPane;
class PracSQL{
	public static void main(String[] args) throws Throwable{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection 