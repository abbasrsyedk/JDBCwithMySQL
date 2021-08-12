package firstmysqlcon;

import java.sql.*;


public class sqlprg1 {

	public static void main(String[] args) throws Exception
	{	
		//step1 registering the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
//		//step2 creating the connection
		//check the localhost in mysql workbench might cause a massive error if not
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/sonoo","root","Tiger");  
		Statement st = con.createStatement();
		//step4 query
//		//create table
		String query = "create table empa2(empno int, empname char(10), empsal int)";
//		//insert values into tablle
//		String ins = "insert into empa (empno,empname,empsal) values(222,'abbas',87),(223,\"abbas\",87)";
//		//update the values in table
		String upd = "update empa set empname='syed' where empno=222";
		
		
		//step5 execution
		try 
		{
//			st.execute(query);
//			st.execute(ins);
			st.executeUpdate(upd);
//			System.out.println("Table Created");
//			System.out.println("Table inserted values");
			System.out.println("Table updated");
		}
		catch(Exception e) 
		{
//			System.out.println("Error "+ e.getMessage());
			System.out.println("Error "+ e.toString());
		}
	}

}
