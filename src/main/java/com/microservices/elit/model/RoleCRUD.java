package com.microservices.elit.model;

public class RoleCRUD {
	
	Role test;
	
	HTTPTYPE type;
	
	public RoleCRUD() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RoleCRUD(Role test, HTTPTYPE type) {
		super();
		this.test = test;
		this.type = type;
	}

	public Role getRole() {
		return test;
	}

	public void setRole(Role test) {
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
		return "RoleCRUD [this=" + test + ", type=" + type + "]";
	}
	
}