package com.neuedu.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/orders";
	//jdbc:mysql://localhost:3306/sample_db?user=root&password=your_password
	private static final String USER = "root";
	private static final String PASSWORD = "123456";
	public static Connection conn;
	
    // insert delete  update
	public static int execute(String sql,Object... params) throws SQLException {
		PreparedStatement pstmt=conn.prepareStatement(sql);
		setParams(pstmt, params);
		return pstmt.executeUpdate();
	}
	
	// select
	public static ResultSet executeQuery(String sql,
			Object...param) throws SQLException {
		PreparedStatement pstmt=conn.prepareStatement(sql);
		setParams(pstmt, param);
		return pstmt.executeQuery();
		
	}
	
	
	
	public static void setParams(
			PreparedStatement pstmt,
			Object... param
			) throws SQLException {
		pstmt.clearParameters();
		int index=1;
		for(Object p:param) {
			pstmt.setObject(index++, p);
		}
		
	}

	
	public static Connection getConnection() {
		try {
			Class.forName(DRIVER);
			conn=DriverManager.getConnection(URL, USER, PASSWORD);
		    return conn;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	public static void closeAll(Connection con, Statement stmt, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close(); 
				rs = null;   
			}
			if (stmt != null) {
				stmt.close();
				stmt = null;
			}
			if (con != null && !con.isClosed()) {
				con.close();
				con = null;
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
