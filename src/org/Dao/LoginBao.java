package org.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.model.*;

public class LoginBao extends BaseDao {
	Connection conn;
	public Login checkLogin(String name,String password) {
		try {
			conn = datasource.getConnection();
			String sql = "select * from minfo_1 where name='"+name+"' and password ='"+password+"'";
			PreparedStatement preparestatement = conn.prepareStatement(sql);
			ResultSet result = preparestatement.executeQuery();
			if(result.next()) {
				Login login = new Login();
				login.setId(result.getInt("id"));
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
	public Boolean Addone(int id,String name,String password,Boolean role) {
		try {
			conn = datasource.getConnection();
			String sql = "insert into minfo_1 values(?,?,?,?)";
			PreparedStatement preparedstatement = conn.prepareStatement(sql);
			preparedstatement.setInt(1, id);
			preparedstatement.setString(2, name);
			preparedstatement.setString(3, password);
			preparedstatement.setBoolean(4, role);
			int infludecount = preparedstatement.executeUpdate();
			if(infludecount>0) {
				return true;
			}
		} catch (Exception e) {
			System.out.print("Addone has error, it is "+e.toString());
		}finally {
			Closeconn(conn);
		}
		return false;
	}
	public int Maxrows() {
		try {
			conn = datasource.getConnection();
			String sql = "select count(id) from minfo_1";
			PreparedStatement pre = conn.prepareStatement(sql);
			ResultSet re = pre.executeQuery();
			while(re.next()) {
				return re.getInt(1);
			}
		} catch (Exception e) {
			System.out.println("Maxrows has error , it is "+e.toString());
		}finally {
			Closeconn(conn);
		}
		return 0;
	}
}
