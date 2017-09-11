package org.action;
import org.model.*;
import com.opensymphony.xwork2.*;
import java.util.*;
import org.Dao.*;
public class LoginAction extends ActionSupport {
	private Login login;
	private Login newone;
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
	public String register()throws Exception{
//		LoginBao logindao = new LoginBao();
		System.out.println(newone.getName());
//		Boolean status = logindao.Addone(newone.getId(), newone.getName(), newone.getPasswords(), newone.getRole());
//		if(status) {
//			return "Success";
//		}
		return "Error";
	}
//	public void validate(){
//		if(login.getName()=="" || login.getPasswords()=="") {
//			addFieldError("error", "账户或者密码不能为空");
//			System.out.println("Please input name or password");
//		}
//	}
	public Login getLogin() {
		return newone;
	}
	public void setLogin(Login newone) {
		this.newone = newone;
	}
	public Login getNewone() {
		return newone;
	}
	public void set

}
