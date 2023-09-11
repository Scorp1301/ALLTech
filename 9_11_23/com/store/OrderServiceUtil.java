package com.store;

import java.util.Scanner;
import java.util.TreeMap;

public class OrderServiceUtil {
	private TreeMap<Integer, Order> map = new TreeMap<>();
	public void addOrder(Order o1) throws InvalidOrderException {
		if(o1.getOrderAmount()< 100 || o1.getPaymentOption() != "COD" || o1.getPaymentOption() != "Gift Card" || o1.getPaymentOption() != "Internet Banking") {
			throw new InvalidOrderException("The amount should be more than 100 or enter valid payment method");
		}
		map.put(o1.getOrderId(), o1);

	}
	
	public Order searchOrder(String orderId) {
		return map.get(orderId);

	}
	public float computeTotal() {
		
		float total = 0f;
		for (Order order : map.values()) {
			total += order.getOrderAmount();
		}
		return total;
	}
	
	

}
