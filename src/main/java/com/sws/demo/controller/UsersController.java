package com.sws.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sws.demo.ro.UsersRO;
import com.sws.demo.service.UsersService;

@RestController
@RequestMapping(value = "/users")
public class UsersController {

	@Autowired
	private UsersService usersService;

	@GetMapping(value = "/getAllUsers", produces = MediaType.APPLICATION_PROBLEM_JSON_VALUE)
	public List<UsersRO> getUsers() {

		return usersService.getusers();
	}

	@PostMapping(value = "/addUser", consumes = MediaType.APPLICATION_PROBLEM_JSON_VALUE, produces = MediaType.APPLICATION_PROBLEM_JSON_VALUE)
	public String addUser(@RequestBody UsersRO ro) {
		return usersService.addUser(ro);
	}

}
