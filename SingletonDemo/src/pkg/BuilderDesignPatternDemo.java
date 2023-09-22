package pkg;

public class BuilderDesignPatternDemo {
	public static void main(String[] args) {
		Car car = new Car.CarBuilder("MRF Tyre", "Smart Stering", "Power Engin", "Massaging Seats").setHasAc(true).setSpeaker("BOAT").build();
		System.out.println(car);
		
	}

}

class Car{
	//mandatory
	private String tyre;
	private String steering;
	private String engine;
	private String seats;

	//optional
	private String speakers;

	private boolean hasAc;

	private boolean hasSeatCover;
	
	public Car(CarBuilder carbuilder) {
		this.tyre=carbuilder.tyre;
		this.steering = carbuilder.steering;               
		this.engine = carbuilder.engine;
		this.seats = carbuilder.seats;
		this.speakers = carbuilder.speakers;
		this.hasAc = carbuilder.hasAc;
		this.hasSeatCover = carbuilder.hasSeatCover;
	}
	
	
	public static class CarBuilder{
		private String tyre;
		private String steering;
		private String engine;
		private String seats;

		//optional
		private String speakers;

		private boolean hasAc;

		private boolean hasSeatCover;

		public CarBuilder(String tyre, String steering, String engine, String seats) {
			this.tyre = tyre;
			this.steering = steering;
			this.engine = engine;
			this.seats = seats;
		}
		
		public CarBuilder setSpeaker(String speakers) {
			this.speakers = speakers;
			return this;
		}
		public CarBuilder setHasAc(boolean hasAC) {
			this.hasAc = hasAC;
			return this;
		}
		public CarBuilder sethasSeatCover(boolean hasSeatCover) {
			this.hasSeatCover = hasSeatCover;
			return this;
		}
		
		public Car build() {
			return new Car(this);
		}		
		
	}

	public String getTyre() {
		return tyre;
	}

	public void setTyre(String tyre) {
		this.tyre = tyre;
	}

	public String getSteering() {
		return steering;
	}

	public void setSteering(String steering) {
		this.steering = steering;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getSeats() {
		return seats;
	}

	public void setSeats(String seats) {
		this.seats = seats;
	}

	public String getSpeakers() {
		return speakers;
	}

	public void setSpeakers(String speakers) {
		this.speakers = speakers;
	}

	public boolean isHasAc() {
		return hasAc;
	}

	public void setHasAc(boolean hasAc) {
		this.hasAc = hasAc;
	}

	public boolean isHasSeatCover() {
		return hasSeatCover;
	}

	public void setHasSeatCover(boolean hasSeatCover) {
		this.hasSeatCover = hasSeatCover;
	}

	@Override
	public String toString() {
		return "Car [tyre=" + tyre + ", steering=" + steering + ", engine=" + engine + ", seats=" + seats
				+ ", speakers=" + speakers + ", hasAc=" + hasAc + ", hasSeatCover=" + hasSeatCover + "]";
	}
	

}
