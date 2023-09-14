package date9_13;

public interface Drawable {
	public default void draw() {
		System.out.println("I am drawing from interface");
	}
	public default void painting() {
		System.out.println("I am painting from interface");
	}

}
