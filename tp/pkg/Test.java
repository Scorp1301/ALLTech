package tp.pkg;

class ShopingPortal{
	public void makePayment(String username, String password) {
		System.out.println("Making Payment through online portal");
	}
	public void makePayment(long mobilenumber, String password) {
		System.out.println("Making payment through UPI");
	}
	public void makePayment(long creditcard, int CVV, String name, String expDate) {
		System.out.println("Making payment through card");
	}
}

public class Test {
	public static void main(String[] args) {
		ShopingPortal sp = new ShopingPortal();
		sp.makePayment("shd", "shdv");
	}

}
