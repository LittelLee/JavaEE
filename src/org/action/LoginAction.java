package org.action;
import org.model.*;
import com.opensymphony.xwork2.*;
import java.util.*;
import org.Dao.*;
public class LoginAction extends ActionSupport {
	private Login login;
	public String execute()throws Exception{
		LoginBao logindao = new LoginBao();
		Login I = logindao.checkLogin(login.getName(), login.getPasswords());
		if(I!=null) {
			Map session = ActionContext.getContext().getSession();
			session.put("login", I);
			return "Success";
		}else {
			return "Error";
		}
	}
	public void validate(){
		if(login.getName()=="" || login.getPasswords()=="") {
			addFieldError("error", "账户或者密码不能为空");
			System.out.println("Please input name or password");
		}
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
}
