package Executive.pkg;

import java.util.concurrent.Callable;

class RectangleCal implements Callable<Double> {
	double length;
	double width;
	public RectangleCal(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	@Override
	public Double call() throws Exception {
		double area = length * width;
		return area;
	}

}
