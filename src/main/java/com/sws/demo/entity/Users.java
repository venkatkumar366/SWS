package com.sws.demo.entity;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection  = "users")
public class Users implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5432216877264678307L;
	
	String id;
	String username;
	String usertype;
}