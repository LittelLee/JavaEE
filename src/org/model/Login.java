package org.model;

public class Login {
	private String id;
	private String name;
	private String passwords;
	private Boolean role;
	public Login(String id, String name, String password, Boolean role) {
		super();
		this.id = id;
		this.name = name;
		this.passwords = password;
		this.role = role;
	}
	public Login() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return passwords;
	}
	public void setPasswor(String password) {
		this.passwords = password;
	}
	public Boolean getRole() {
		return role;
	}
	public void setRole(Boolean role) {
		this.role = role;
	}
}
