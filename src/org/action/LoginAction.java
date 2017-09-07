package org.action;
import org.model.*;
import com.opensymphony.xwork2.*;
import java.util.*;
import org.Dao.*;
public class LoginAction extends ActionSupport {
	private Login login;
	public String execute()throws Exception{
		System.out.println(login.getName()+" password = "+login.getId());
		LoginBao logindao = new LoginBao();
		Login I = logindao.checkLogin(login.getName(), login.getId());
		if(I!=null) {
			Map session = ActionContext.getContext().getSession();
			session.put("login", I);
			return "Success";
		}else {
			return "Error";
		}
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
}
