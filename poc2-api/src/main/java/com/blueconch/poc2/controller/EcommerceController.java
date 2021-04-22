package com.blueconch.poc2.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.blueconch.poc2.dto.Address;
import com.blueconch.poc2.dto.Orders;
import com.blueconch.poc2.dto.Product;
import com.blueconch.poc2.dto.Shipping;
import com.blueconch.poc2.dto.User;
import com.blueconch.poc2.service.IAddressService;
import com.blueconch.poc2.service.IOrdersService;
import com.blueconch.poc2.service.IProductService;
import com.blueconch.poc2.service.IShippingService;
import com.blueconch.poc2.service.IUserService;

@RestController
public class EcommerceController {
	
	@Autowired
	IProductService prodServiceRef;
	@Autowired
	IUserService userServiceRef;
	@Autowired
	IAddressService addressServiceRef;
	@Autowired
	IShippingService shippingServiceRef;
	@Autowired
	IOrdersService ordersServiceRef;
	
	//demo purpose
	@RequestMapping("/welcome")
	public String welcomeEcommerce()
	{
		return "Hello";
	}
	
	//view all product
	@RequestMapping("/product")
	public List<Product> getAllProduct()
	{
		return(prodServiceRef.getAllProduct());
	}
	
	//view product by id
	@RequestMapping("/product/{prodId}")
	public Product getproductById(@PathVariable int prodId)
	{
		return prodServiceRef.getProductById(prodId);
	}
	
	//add new product
	@RequestMapping(method=RequestMethod.POST, value="/product")
	public void addProduct(@RequestBody Product product)
	{
		prodServiceRef.addProduct(product);
	}
	
	//update existing product by id
	@RequestMapping(method=RequestMethod.PUT, value="/product/{prodId}")
	public void updateProduct(@RequestBody Product product,@PathVariable int prodId)
	{
		prodServiceRef.updateProduct(product,prodId);
	}
	
	//delete product by id
	@RequestMapping(method=RequestMethod.DELETE, value="/product/{prodId}")
	public void deleteProduct(@PathVariable int prodId)
	{
		prodServiceRef.deleteProduct(prodId);
	}
	
	@RequestMapping("/user")
	public List<User> getAllUser()
	{
		return userServiceRef.getAllUser();
	}
	
	@RequestMapping("/address")
	public List<Address> getAllAddress()
	{
		return addressServiceRef.getAllAddress();
	}
	
	@RequestMapping("/shipping")
	public List<Shipping> getAllShipping()
	{
		return shippingServiceRef.getAllShipping();
	}
	
	@RequestMapping("/orders")
	public List<Orders> getAllOrders()
	{
		return ordersServiceRef.getAllOrders();
	}
	

}
