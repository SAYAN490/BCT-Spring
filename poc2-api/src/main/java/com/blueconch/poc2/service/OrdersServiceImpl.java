package com.blueconch.poc2.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.blueconch.poc2.dto.Orders;

@Service
public class OrdersServiceImpl implements IOrdersService {
	
	List<Orders> ordersList= new ArrayList<> (Arrays.asList(
			new Orders(1,1,1,4500,1),
			new Orders(2,2,2,400,2)));

	@Override
	public List<Orders> getAllOrders() {
		// TODO Auto-generated method stub
		return ordersList;
	}
	

}
