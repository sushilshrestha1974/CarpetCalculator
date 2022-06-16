package carpetCaclulator;

public class Room {
	private double length;
	private double width;
	public Room(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getArea() {
		return length*width;
		
	}
	
	@Override
	public String toString() {
		return "Room [length=" + length + ", width=" + width + "]";
	}
}


