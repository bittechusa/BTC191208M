package com.bit.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IntegrationTest {
WebDriver dr;
Connection con;
Statement  st;
ResultSet r;
@Test
public void getData() throws SQLException {
	//Object[][] o=new Object[2][3];
	ArrayList ar=new ArrayList();
	try {
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/BTC191208M","root", "");
		 st=con.createStatement();
		 r=st.executeQuery("select id from table1");
		while(r.next())
		{
			//System.out.println(r.getString(1));
			ar.add(r.getString(1));
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		if(con!=null)
		{
		con.close();
		}
	}
}




	@Test
	public void test2() {
		dr=new ChromeDriver();
		dr.get("http://www.facebook.com");
		dr.manage().deleteAllCookies();
	}
}
