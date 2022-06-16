package carpetCaclulator;

import java.util.ArrayList;

public class carpetCalculator implements calculatable {

	private float pricePerSquareft;
	private float installationCharge;
	private ArrayList<Room> rooms;

	public carpetCalculator(float pricePerSquareft) {
		this.pricePerSquareft = pricePerSquareft;
		rooms = new ArrayList<Room>();
	}

	public carpetCalculator( float pricePerSquareft, float installationCharge) {
		this.pricePerSquareft = pricePerSquareft;
		this.installationCharge = installationCharge;
		rooms = new ArrayList<Room>();
	}

	@Override
	public void addRoom(Room room) {
		rooms.add(room);
	}

	@Override
	public String getTotalCost() {
		double totalCost = 0;
		for (Room room : this.rooms) {
			totalCost += (room.getArea() * this.pricePerSquareft);
		}
		totalCost += this.installationCharge;
		return "$" + totalCost;
	}

	@Override
	public void addPercentdDiscount(float percentDiscount) {
		this.pricePerSquareft *= (1.00 - (percentDiscount / 100));
		this.installationCharge *= (1.00 - (percentDiscount) / 100);
	}
}
