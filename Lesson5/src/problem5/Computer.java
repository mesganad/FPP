package problem5;

public class Computer {

	private String manufacturer;
	private String processor;
	private int ramSize;
	private double processorSpeed;

	public Computer(String manufacturer, String processor, int ramSize, double processorSpeed) {
		this.manufacturer = manufacturer;
		this.processor = processor;
		this.ramSize = ramSize;
		this.processorSpeed = processorSpeed;
	}

	public int getRamSize() {
		return this.ramSize;
	}

	public double getProcessorSpeed() {
		return this.processorSpeed;
	}

	public double computePower() {
		return ramSize * processorSpeed;
	}

	@Override
	public String toString() {
		return "Manufacturer: " + manufacturer + "\nProcessor: " + processor + "\nRAM: " + "" + ramSize
				+ "\nProcessor speed: " + processorSpeed + "\nComputer power " + computePower();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Computer)) {
			return false;
		}
		Computer c = (Computer) obj;
		if (this.manufacturer.equals(c.manufacturer) && this.processor.equals(c.processor)
				&& (this.ramSize == c.ramSize) && (this.processorSpeed == c.processorSpeed)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		//assuming all deterministic fields of the objects are not null
		int hc = 13;
		hc = hc+manufacturer.hashCode();
		hc = hc+processor.hashCode();
		long bit = Double.doubleToLongBits(ramSize);
		int rbit = (int) (bit ^ (bit >>> 32));
		hc = hc+rbit;
		bit = Double.doubleToLongBits(processorSpeed);
		rbit = (int) (bit ^ (bit >>> 32));
		hc = hc+rbit;
		return hc;
	}
}
