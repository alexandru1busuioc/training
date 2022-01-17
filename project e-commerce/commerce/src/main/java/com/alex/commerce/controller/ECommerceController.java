package com.alex.commerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alex.commerce.dto.Transaction;
import com.alex.commerce.model.Product;
import com.alex.commerce.service.ECommerceService;

@RestController
public class ECommerceController {

	@Autowired
	ECommerceService eCommerceService;
	 
	@GetMapping("/searchProductLike")
	public List<Product> searchProductLike(@RequestParam String name){
		return eCommerceService.searchProductLike(name);
	}
	
	@PostMapping("/buyProduct")
	public String buyProduct(@RequestBody Transaction transaction) {
		return eCommerceService.buyProduct(transaction);
	}
	
	@GetMapping("/getHistory")
	public List<Transaction> getHistory(){
		return eCommerceService.getHistory();
	}
	
	@GetMapping("/getInventory")
	public List<Product> getInventory(){
		return eCommerceService.getInventory();
	}
}
