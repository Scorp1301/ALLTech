package com.store;
import java.util.*;

public class Order {
	private int orderId;
	private String customerName;
	private float orderAmount;
	private String paymentOption;
	public Order(int orderId, String customerName, float orderAmount, String paymentOption) {
		super();
		this.orderId = orderId;
		this.customerName = customerName;
		this.orderAmount = orderAmount;
		this.paymentOption = paymentOption;
	
	}


public void validOrder() throws InvalidOrderException{
	if(orderAmount<100) {
		throw new InvalidOrderException("Order Amount should be greater than 100");
	}
	if(!paymentOption.equals("COD") &&!paymentOption.equals("Internet Banking") &&!paymentOption.equals("Gift Card")) {
		throw new InvalidOrderException("Please Enter valid Payment Method.");
	}
	
	
	
}


public int getOrderId() {
	return orderId;
}


public String getCustomerName() {
	return customerName;
}


public float getOrderAmount() {
	return orderAmount;
}


public String getPaymentOption() {
	return paymentOption;
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Order ID:" + orderId + "Customer Name: "+customerName+"Order Amount:"+orderAmount+"Payment Method:"+paymentOption;
}

}

	


