package com.blueconch.poc2.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.blueconch.poc2.dto.Address;

@Service
public class AddressServiceImpl implements IAddressService {
	
	List<Address> addressList= new ArrayList<> (Arrays.asList(
			new Address(1,"Sayan","Dumariatand","Dhanbad","Dhanbad","Jharkhand",12345,1),
			new Address(2,"Sayan","Dumariatand","Dhanbad","Dhanbad","Jharkhand",12345,2)));

	@Override
	public List<Address> getAllAddress() {
		// TODO Auto-generated method stub
		return addressList;
	}

}
