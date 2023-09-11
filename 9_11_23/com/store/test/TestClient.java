package com.store.test;
import com.store.*;
public class TestClient {

	public static void main(String[] args) throws InvalidOrderException {
		OrderServiceUtil o1 = new OrderServiceUtil();
		
		Order ord = new Order(1, "Nirav", 150.34f, "COD");
		Order ord2 = new Order(3, "Scorp", 80.5f, "Gift Card");
		
		System.out.println(o1.computeTotal());

	}

}
