package carpetCaclulator;

import java.util.ArrayList;

public class CarpetCalculator implements calculatable {
	double pricePerSquareFoot;
	double installationCharge;
	public CarpetCalculator(double pricePerSquareFoot, double installatonCharge) {
		super();
		this.pricePerSquareFoot = pricePerSquareFoot;
		this.installationCharge = installatonCharge;
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
		//totalSquareFoot=0;
		//float totalSqFt =0;
		 //for(Room room : rooms)
		 // totalSqFt = room;
	
		//Room room = null;
		//return "$" + (costOfCarpet);//* room.getArea();
		return "$" + installationCharge +  ((Room) rooms).getArea();
	}
		

	
	@Override
	public String toString() {
		return "CarpetCalculator [pricePerSquareFoot=" + pricePerSquareFoot + ", installatonCharge=" + installationCharge
				+ ", rooms=" + rooms + "]";
	}
	@Override
	public void addPercentdDiscount(float percentDiscount) {
	
		pricePerSquareFoot = pricePerSquareFoot - ((percentDiscount/100)
				* pricePerSquareFoot);
	}
	
	
	
}
