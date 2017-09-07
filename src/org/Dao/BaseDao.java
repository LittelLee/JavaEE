package org.Dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.*;
import javax.sql.DataSource;

public class BaseDao {
	DataSource datasource;
	Connection Bconn ;
	public BaseDao() {
		try {
			Context  context = new InitialContext();
			datasource = (DataSource)context.lookup("java:comp/env/jdbc/db");
		} catch (Exception e) {
			System.out.println("BaseDao Init error is "+e.toString());
		}
	}
	public Connection getConnection() throws Exception {
		Bconn = datasource.getConnection();
		return Bconn;
	}
	public void Closeconn(Connection conn) {
		try {
			conn.close();
		} catch (Exception e) {
			System.out.println("BseDao has close error is "+e.toString());
		}
	}
}
