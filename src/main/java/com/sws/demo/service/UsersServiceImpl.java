package com.sws.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sws.demo.entity.Users;
import com.sws.demo.repo.UsersRepo;
import com.sws.demo.ro.UsersRO;

@Component
public class UsersServiceImpl implements UsersService {

	@Autowired
	private UsersRepo userRepo;

	@Override
	public List<UsersRO> getusers() {
		List<Users> userList = userRepo.findAll();
		List<UsersRO> userROList = populateToRo(userList);
		return userROList;
	}

	private List<UsersRO> populateToRo(List<Users> userList) {
		List<UsersRO> roList = new ArrayList<>();
		for (Users user : userList) {
			UsersRO ro = new UsersRO(user.getUsername(), user.getUsertype(), user.getId());
			roList.add(ro);

		}
		return roList;
	}

	@Override
	public String addUser(UsersRO ro) {
		String response ="";
		try {
			if(ro!=null) {
				Users entity =  populateToEntity(ro);
				userRepo.save(entity);
				response="YOU ROCK IN ADDING";
			}
		}
		catch(Exception e){
			e.printStackTrace();
			response="YOU ROCK IN CODING";
		}
		return response;
	}

	private Users populateToEntity(UsersRO ro) {
		Users entity = new Users();
		entity.setId(ro.getId());
		entity.setUsername(ro.getUsername());
		entity.setUsertype(ro.getUsertype());
		return entity;
	}

}
