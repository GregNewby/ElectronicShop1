/**
 * 
 */
package com.electronicshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.electronicshop.entity.Purchase;
import com.electronicshop.repo.PurchaseRepo;

/**
 * @author Greg N.
 * @date :
 * 
 */
@RestController

@RequestMapping("/api/purchase")
public class PurchaseController {
	
	@Autowired
	PurchaseRepo purchaseRepo;
	
	@GetMapping("/getpurchase")
	public List<Purchase> getPurchase(){
		return purchaseRepo.findAll();
	}

	@PostMapping("/addpurchase")
	public Purchase addPurchase(@RequestBody Purchase purchase) {
		return purchaseRepo.save(purchase);
	}
	
	@DeleteMapping("/deletepurchase/{id}")
	public String deletePurchase(@PathVariable("id") int Id) {
		try{
			purchaseRepo.deleteById(Id);
			return "PURCHASE DELETED";
		} catch(Exception e) {
			return "PURCHASE NOT DELETED";
		}
	}
}
