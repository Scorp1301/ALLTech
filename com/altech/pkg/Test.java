package com.altech.pkg;
interface A{
	default void foo() {
		System.out.println("A's foo");
	}
}
interface B extends A{
	default void foo() {
		System.out.println("B's foo");
	}
}
interface C extends A{
	default void foo() {
		System.out.println("C's foo");
	}
}

class D implements B,C{

	@Override
	public void foo() {
		// TODO Auto-generated method stub
		B.super.foo();
		C.super.foo();
	}
	
}
public class Test {
	public static void main(String[] args) {
		D d = new D();
		d.foo();
	}
}
