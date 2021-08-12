package firstmysqlcon;

import java.sql.*;

public class allinone {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//establish the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/sonoo","root","Tiger");
		
		//create statement and execute queries
		Statement st = con.createStatement();
		String cre = "create table empa3(srno int , srname char(10) , stper int)";
//		st.execute(cre);
		
		String ins = "insert into empa3 (srno,srname,stper) values(111,'Abbas',90),(222,'syed' ,89)";
		st.executeUpdate(ins);
		
		String upd = "update empa3 set srname='broski' where srno=111";
		st.executeUpdate(upd);
		
		String show = "select * from empa3";
		ResultSet r = st.executeQuery(show);
		while(r.next()) {
			System.out.println(r.getInt(1)+" "+ r.getString(2)+" "+ r.getString(3));
		}
		con.close();
		st.close();
	}

}
