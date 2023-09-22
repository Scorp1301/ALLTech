package pkg;

public class SingletonExample {

	public static void main(String[] args) {
		//singletonType1 t1 = new singletonType1();
		//System.out.println(t1);
		
		System.out.println(SingletonType3.getSingletonInstance());
		System.out.println(SingletonType4.getSingletonInstance());
	}

}

class SingletonType1{
	private static final SingletonType1 INSTANCE = new SingletonType1();
	
	private SingletonType1 getInstance() {
		return INSTANCE;
	}
}

class SingletonType2{
	private static SingletonType2 instance;
	
	static {
		instance = new SingletonType2();
	}
	
	public static SingletonType2 getInstance() {
		return instance;
	}
}

class SingletonType3{
	
	private SingletonType3() {
		
	}
	private static SingletonType3 singletonInstance;
	
	public static SingletonType3 getSingletonInstance() {
		if(singletonInstance == null) {
			singletonInstance = new SingletonType3();
		}
		return singletonInstance;
	}
}
class SingletonType4{
	
	private SingletonType4() {
		
	}
	private static SingletonType4 singletonInstance;
	
	public static synchronized SingletonType4 getSingletonInstance() {
		if(singletonInstance == null) {
			singletonInstance = new SingletonType4();
		}
		return singletonInstance;
	}
}

