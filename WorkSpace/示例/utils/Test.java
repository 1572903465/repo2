package com.neuedu.utils;


import java.sql.SQLException;

public class Test {

	public static void main(String[] args) throws SQLException {

		JdbcUtil.getConnection();
		String sql="insert into orders(order_no,order_user,order_phoneno) " + 
				"values(?,?,?)";
	    String no="20191225110901";
	    String user="liu";
	    String phoneno="123456";
		int ret=JdbcUtil.execute(sql, no,user,phoneno);
		System.out.println(ret);
	}

}
