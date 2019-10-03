package com.rewardsprogram.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rewardsprogram.model.Customer;
import com.rewardsprogram.model.Product;
import com.rewardsprogram.model.RewardsPerPurchase;
import com.rewardsprogram.model.Transaction;

@RestController
public class CustomerController {
	
	@RequestMapping("/getCustomers")
    public List<Customer> getCustomers() 
    {
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer(1,"Venkatest","","Ganji", new Date(), "MR"));
		return customers;
    }
	
	
	@RequestMapping("/purchase")
    public RewardsPerPurchase purchase(Transaction transaction) 
    {
		
		List<Product> products = transaction.getProducts();
		BigDecimal totalTxnAmount = BigDecimal.ZERO;
		if(products != null) {
			for(Product product : products) {
				totalTxnAmount = totalTxnAmount.add(new BigDecimal(product.getPrice() * product.getQuantity()));
			}
		}
		RewardsPerPurchase rewardsPerPurchase = new RewardsPerPurchase();
		rewardsPerPurchase.setId(1);
		rewardsPerPurchase.setTxnAmount(totalTxnAmount);
		if(totalTxnAmount.compareTo(new BigDecimal(50)) > 0) {
			rewardsPerPurchase.setPoints(totalTxnAmount.longValue() - 50);
		} else if(totalTxnAmount.compareTo(new BigDecimal(100)) > 0) {
			rewardsPerPurchase.setPoints((totalTxnAmount.longValue() - 100) * 2);
		} else {
			rewardsPerPurchase.setPoints(0);
		}
		
		return rewardsPerPurchase;
    }

}
