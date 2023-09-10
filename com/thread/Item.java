package com.thread;

class Item{
	int itemId;
	String itemName;
	public Item(int itemId, String itemName) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
	}
	
	public void displayItemDetails() {
		System.out.println("Item id:" +itemId);
		System.out.println("Item Name:" +itemName);
	}
	

}
