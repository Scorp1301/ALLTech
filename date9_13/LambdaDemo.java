package date9_13;

interface Add {
	public void add(int a, int b);
}

public class LambdaDemo {
	public static void main(String[] args) {
		Add add = (int a,int b) -> System.out.println(a+b);
		add.add(4,5);
	}

}
