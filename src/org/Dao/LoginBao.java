package org.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.model.*;

public class LoginBao extends BaseDao {
	Connection conn;
	public Login checkLogin(String name,String password) {
		try {
			conn = datasource.getConnection();
			String sql = "select * from Minfo where name='"+name+"' and password ='"+password+"'";
			PreparedStatement preparestatement = conn.prepareStatement(sql);
			ResultSet result = preparestatement.executeQuery();
			if(result.next()) {
				Login login = new Login();
				login.setId(result.getString("id"));
				login.setName(result.getString("name"));
				login.setPasswords(result.getString("password"));
				login.setRole(result.getBoolean("role"));
				System.out.println(result.getString("name"));
				
				return login;
			}else {
				return null;
			}
				
			
		} catch (Exception e) {
			System.out.println("LoginDao hss error is "+e.toString());
		} finally {
			Closeconn(conn);
		}
		return null;
	}
}
