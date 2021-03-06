package com.simplilearn.userShoppingCart.controller;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.simplilearn.userShoppingCart.entity.UserShoppingCart;
import com.simplilearn.userShoppingCart.exception.UserShoppingCartAlreadyExist;
import com.simplilearn.userShoppingCart.exception.UserShoppingCartProductNotFound;

@RestController
public class UserShoppingCartController {
	
	
	List<UserShoppingCart> products = new ArrayList<UserShoppingCart>();

	// get one product by id
	@GetMapping("/product/{id}")
	public UserShoppingCart getOne(@PathVariable(value = "id") int id) {
		for (UserShoppingCart product : products) {
			if (product.getId() == id) {
				return product;
			}
		}
		throw new UserShoppingCartProductNotFound("Product is not found with given id "+id);
	}

		
@GetMapping("/product")
	public UserShoppingCart getOne(@RequestParam String description) {
		for (UserShoppingCart product : products) {
			if (product.getDescription().equals(description)) {
				return product;
			}
		}
	throw new UserShoppingCartProductNotFound("Product is not found with given use/disease "+description);
	}

@GetMapping("/product/search")
public UserShoppingCart searchOne(@RequestParam String name) {
	for (UserShoppingCart product : products) {
		if (product.getName().contains(name)) {
			return product;
		}
	}
throw new UserShoppingCartProductNotFound("Product is not found with given name "+name);
}
	
/// get one product by name
	//	@GetMapping("/product/search")
		//public UserShoppingCart searchOne(@RequestParam(value = "name") String name) {
			//for (UserShoppingCart product : products) {
				//if (product.getCompanyName().contains(name)) {
					//return product;
			//	}
			//}
			//throw new UserShoppingCartProductNotFound("Product is not found with given name "+name);
		//}

	// get all products
	@GetMapping("/products")
	public List<UserShoppingCart> getProducts() {
		if (products.isEmpty()) {
			addDefaults();
		}
		return products;
	}

	// add product
	@PostMapping("/products")
	public List<UserShoppingCart> addOne(@RequestBody UserShoppingCart product) {
		for (UserShoppingCart pt : products) {
			if (pt.getId()==product.getId()) {
				throw new UserShoppingCartAlreadyExist("Product is already available with given id "+product.getId());
			}
		}
		products.add(product);
		return products;
	}

	// update product
	@PutMapping("/products")
	public UserShoppingCart updateOne(@RequestBody UserShoppingCart product) {
		for (int index = 0; index < products.size(); index++) {
			if (product.getId() == products.get(index).getId()) {
				// set : replace user product
				products.set(index, product);
				return product;
			}
		}
		throw new UserShoppingCartProductNotFound("Product is not found with given id "+product.getId());
	}

	// delete product
	@DeleteMapping("/products/{id}")
	public List<UserShoppingCart> deleteOne(@PathVariable(value = "id") int id) {
		for (int index = 0; index < products.size(); index++) {
			if (id == products.get(index).getId()) {
				// set : replace user product
				products.remove(index);
				return products;
			}
		}
		throw new UserShoppingCartProductNotFound("Product is not found with given id "+id);
	}

	// add default products
	
		private void addDefaults() {
		products.add(new UserShoppingCart(10001, "Paracetamol", "Company A",100.00, 1, "Pain", true, new Date(), new Date(1726281120000L)));
		products.add(new UserShoppingCart(10002, "Acriflavin ", "Company B", 200.00, 2, "Antiseptic", true, new Date(), new Date(1718332320000L)));
		products.add(new UserShoppingCart(10003, "Chlorpheniramine", "Company C", 300.00, 3, "Antiallergics", false, new Date(), new Date(1720924320000L)));
		products.add(
				new UserShoppingCart(10004, "Calcium", "Company D", 400.00, 4, "Vitamin", false, new Date(), new Date(1723602720000L)));
		products.add(
				new UserShoppingCart(10005, "Allopurino", "Company E", 500.00, 5, "Gout", true, new Date(), new Date(1723602720000L)));
	}

}
