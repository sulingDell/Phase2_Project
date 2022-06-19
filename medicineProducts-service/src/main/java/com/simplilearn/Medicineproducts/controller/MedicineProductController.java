package com.simplilearn.Medicineproducts.controller;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.Medicineproducts.entity.MedicineProduct;
import com.simplilearn.Medicineproducts.exception.MedicineProductAlreadyExist;
import com.simplilearn.Medicineproducts.exception.MedicineProductNotFound;

@RestController
public class MedicineProductController {
	
	List<MedicineProduct> products = new ArrayList<MedicineProduct>();

	// get one product by id
	@GetMapping("/product/{id}")
	public MedicineProduct getOne(@PathVariable(value = "id") int id) {
		for (MedicineProduct product : products) {
			if (product.getId() == id) {
				return product;
			}
		}
		throw new MedicineProductNotFound("Product is not found with given id "+id);
	}

	// get one product by name
	@GetMapping("/product")
	public MedicineProduct getOne(@RequestParam(value = "name") String name) {
		for (MedicineProduct product : products) {
			if (product.getMedicineName().equals(name)) {
				return product;
			}
		}
		throw new MedicineProductNotFound("Product is not found with given name "+name);
	}

	// get one product by name
	@GetMapping("/product/search")
	public MedicineProduct searchOne(@RequestParam(value = "name") String name) {
		for (MedicineProduct product : products) {
			if (product.getMedicineName().contains(name)) {
				return product;
			}
		}
		throw new MedicineProductNotFound("Product is not found with given name "+name);
	}

	// get all products
	@GetMapping("/products")
	public List<MedicineProduct> getProducts() {
		if (products.isEmpty()) {
			addDefaults();
		}
		return products;
	}

	// add product
	@PostMapping("/products")
	public List<MedicineProduct> addOne(@RequestBody MedicineProduct product) {
		for (MedicineProduct pt : products) {
			if (pt.getId()==product.getId()) {
				throw new MedicineProductAlreadyExist("Product is already available with given id "+product.getId());
			}
		}
		products.add(product);
		return products;
	}

	// update product
	@PutMapping("/products")
	public MedicineProduct updateOne(@RequestBody MedicineProduct product) {
		for (int index = 0; index < products.size(); index++) {
			if (product.getId() == products.get(index).getId()) {
				// set : replace user product
				products.set(index, product);
				return product;
			}
		}
		throw new MedicineProductNotFound("Product is not found with given id "+product.getId());
	}

	// delete product
	@DeleteMapping("/products/{id}")
	public List<MedicineProduct> deleteOne(@PathVariable(value = "id") int id) {
		for (int index = 0; index < products.size(); index++) {
			if (id == products.get(index).getId()) {
				// set : replace user product
				products.remove(index);
				return products;
			}
		}
		throw new MedicineProductNotFound("Product is not found with given id "+id);
	}

	// add default products
	
		private void addDefaults() {
		products.add(new MedicineProduct(10001, "Paracetamol", "Company A",100.00, 1, "Pain", true, new Date(), new Date(1726281120000L)));
		products.add(new MedicineProduct(10002, "Acriflavin ", "Company B", 200.00, 2, "Antiseptic", true, new Date(), new Date(1718332320000L)));
		products.add(new MedicineProduct(10003, "Chlorpheniramine", "Company C", 300.00, 3, "Antiallergics", false, new Date(), new Date(1720924320000L)));
		products.add(
				new MedicineProduct(10004, "Calcium", "Company D", 400.00, 4, "Vitamin", false, new Date(), new Date(1723602720000L)));
		products.add(
				new MedicineProduct(10005, "Allopurino", "Company E", 500.00, 5, "Gout", true, new Date(), new Date(1723602720000L)));
	}

}
