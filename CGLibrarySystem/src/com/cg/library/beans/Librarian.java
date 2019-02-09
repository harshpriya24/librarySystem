package com.cg.library.beans;

public class Librarian {
	private String name;
	private String password;
 public Librarian() {}
 
public Librarian(String name, String password) {
	super();
	this.name = name;
	this.password = password;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
 
}
