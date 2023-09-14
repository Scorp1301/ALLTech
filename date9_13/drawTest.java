package date9_13;

public class drawTest implements Drawable {
	@Override 
	public void draw() {
		Drawable.super.draw();
		System.out.println("I am drawing from test");
	}
	public static void main(String[] args) {
		drawTest d = new drawTest();
		
		d.draw();
		d.painting();
		//super.d.draw();
		
	}

}
