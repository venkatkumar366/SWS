package com.sws.demo.ro;

import lombok.Data;

@Data
public class UsersRO {

	String id;
	String username;
	String usertype;

	public UsersRO(String id, String username, String usertype) {
		super();
		this.id = id;
		this.username = username;
		this.usertype = usertype;
	}
	
	
}
