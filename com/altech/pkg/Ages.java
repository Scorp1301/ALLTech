package com.altech.pkg;

class GrandFather{
	int grandFatherAge;
public GrandFather(int grandFatherAge) {

	this.grandFatherAge = grandFatherAge;
}
public void ShowGrandFatherAge(){
	System.out.println("Grand Father Age in" +grandFatherAge);
}
}

class Father extends GrandFather{
	int fatherAge;



public Father(int fatherAge) {
	super(fatherAge+30);
	this.fatherAge = fatherAge;
}
public void ShowFatherAge(){
	ShowGrandFatherAge();
	System.out.println("Grand Father Age in" +fatherAge);
}
}
class Son extends Father{
	int sonAge;

public Son(int sonAge) {
	super(sonAge+30);
	this.sonAge = sonAge;
}
public void ShowSonAge(){
	ShowFatherAge();
	System.out.println("Son Age in" +sonAge);
}
}
public class Ages {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s1 = new Son(20);
		
		s1.ShowSonAge();

	}

}
