package Thread.pkg;

public class MyyThread extends Thread{
	DisplayMsg dm;
	String name;
	public MyyThread(DisplayMsg dm, String name) {
		super();
		this.dm = dm;
		this.name = name;
	}
	public void run() {
		dm.sayHello(name);
	}

}
