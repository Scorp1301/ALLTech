package pkg;

import java.util.Objects;

public class FactoryDesignPatternDemo {

	public static void main(String[] args) {
		System.out.println(IphoneFactory.getIphone(IphoneType.ELEVEN));
		System.out.println(IphoneFactory.getIphone(IphoneType.TWELVE));
	}

}
interface Iphone{
	public String getRam();
	public String getMemory();
	public String getScreenSize();
}

class Iphone11 implements Iphone{
	private String ram;
	private String memory;
	private String screenSize;
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
	public String getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}
	@Override
	public int hashCode() {
		return Objects.hash(memory, ram, screenSize);
	}
	
	@Override
	public String toString() {
		return "Iphone11 [ram=" + ram + ", memory=" + memory + ", screenSize=" + screenSize + "]";
	}
	/**
	 * @param ram
	 * @param memory
	 * @param screenSize
	 */
	public Iphone11(String ram, String memory, String screenSize) {
		super();
		this.ram = ram;
		this.memory = memory;
		this.screenSize = screenSize;
	}	
}

class Iphone12 implements Iphone{
	private String ram;
	private String memory;
	private String screenSize;
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
	public String getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}
	@Override
	public int hashCode() {
		return Objects.hash(memory, ram, screenSize);
	}
	
	@Override
	public String toString() {
		return "Iphone11 [ram=" + ram + ", memory=" + memory + ", screenSize=" + screenSize + "]";
	}
	/**
	 * @param ram
	 * @param memory
	 * @param screenSize
	 */
	public Iphone12(String ram, String memory, String screenSize) {
		super();
		this.ram = ram;
		this.memory = memory;
		this.screenSize = screenSize;
	}	
}

class IphoneFactory{
	public static Iphone getIphone(IphoneType iphoneType) {
		if(iphoneType.equals(iphoneType.ELEVEN)) {
			return new Iphone11("4GB", "256 GB", "5.7'");
		}else if (iphoneType.equals(iphoneType.TWELVE)) {
			return new Iphone12("6GB", "128", "6.0'");
		}else {
			return null;
		}
	}
}
