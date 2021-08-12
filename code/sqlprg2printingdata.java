package firstmysqlcon;

import java.sql.*;
public class sqlprg2printingdata {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		Class.forName("com.mysql.jdbc.Driver");
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		//step2 creating the connection
		//check the localhost in mysql workbench might cause a massive error if not
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/sonoo","root","Tiger");  
		Statement st = con.createStatement();
		
		String sel = "select * from empa";
		ResultSet r = st.executeQuery(sel);
		while(r.next())
		{
			System.out.println(r.getInt(1)+ " " + r.getString(2)+ " " + r.getString(3));
		}
		con.close();
		st.close();
	}

}
