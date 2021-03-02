package com.sws.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sws.demo.ro.UsersRO;
@Service
public interface UsersService {


	List<UsersRO> getusers();

	String addUser(UsersRO ro);
}
