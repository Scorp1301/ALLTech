package com.altech.pkg;

class Parents{
	public void buildingConstruction() {
		System.out.println("With the help of labour!");
	}
}

class Child extends Parents{
	public void buildingConstruction() {
		System.out.println("With the help of Machines!");
	}
}

public class OverringDemo {
	
	public static void main(String[] args) {
		Parents p = new Child();
		p.buildingConstruction();
	}

}
