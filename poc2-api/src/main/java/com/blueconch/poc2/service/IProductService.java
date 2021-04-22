package com.blueconch.poc2.service;

import java.util.List;

import com.blueconch.poc2.dto.Product;

public interface IProductService {

	List<Product> getAllProduct();
	Product getProductById(int prodId);
	void addProduct(Product product);
	void updateProduct(Product product, int prodId);
	void deleteProduct(int prodId);

}
