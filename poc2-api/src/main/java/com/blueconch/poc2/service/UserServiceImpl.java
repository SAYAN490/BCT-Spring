package com.blueconch.poc2.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.blueconch.poc2.dto.User;

@Service
public class UserServiceImpl implements IUserService{
	
	List<User> userList= new ArrayList<> (Arrays.asList(
			new User(1,"User-1","1234",7,1031089723, 4500),
			new User(2,"User-2","4321",8,2031123451, 4500)));

	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userList;
	}
	
	
	}


