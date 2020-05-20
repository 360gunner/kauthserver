package com.microservices.elit.model;

public class UsersCRUD {
	
	Users test;
	
	HTTPTYPE type;
	
	public UsersCRUD() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsersCRUD(Users test, HTTPTYPE type) {
		super();
		this.test = test;
		this.type = type;
	}

	public Users getUsers() {
		return test;
	}

	public void setUsers(Users test) {
		this.test = test;
	}

	public HTTPTYPE getType() {
		return type;
	}

	public void setType(HTTPTYPE type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "UsersCRUD [this=" + test + ", type=" + type + "]";
	}
	
}