package org.model;

public class Login {
	private String id;
	private String name;
	private String passwords;
	private Boolean role;
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
	public String getPasswords() {
		return passwords;
	}
	public void setPasswords(String passwords) {
		this.passwords = passwords;
	}
	public Boolean getRole() {
		return role;
	}
	public void setRole(Boolean role) {
		this.role = role;
	}
	public Login(String id, String name, String passwords, Boolean role) {
		super();
		this.id = id;
		this.name = name;
		this.passwords = passwords;
		this.role = role;
	}
	public Login() {
		super();
	}
	
}
