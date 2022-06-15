package carpetCaclulator;

import java.util.ArrayList;

public class CarpetCalculator implements calculatable {
	double pricePerSquareFoot;
	double installatonCharge;
	public CarpetCalculator(double pricePerSquareFoot, double installatonCharge) {
		super();
		this.pricePerSquareFoot = pricePerSquareFoot;
		this.installatonCharge = installatonCharge;
	}
	public CarpetCalculator(double pricePerSquareFoot) {
		super();
		this.pricePerSquareFoot = pricePerSquareFoot;
	}
	
	ArrayList<Room> rooms= new ArrayList<>();
	@Override
	public void addRoom(Room room) {
		
		
	}
	@Override
	public String getTotalCost() {
		
		return null;
	}
	@Override
	public void addPercentdDiscount(float percentDiscount) {
	
		
	}
	
	
	
}
