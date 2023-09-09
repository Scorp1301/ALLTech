package Thread.pkg.syncwait;

public class Storage {
	int num;

	public synchronized int getNum() {
		return num;
	}

	public synchronized void setNum(int num) {
		this.num = num;
	}
}
