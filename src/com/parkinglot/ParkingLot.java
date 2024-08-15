package com.parkinglot;

public class ParkingLot {

	private ParkingSlot parkingSlot = new ParkingSlot();
	
	public boolean parkVehicle(Vehicle v) {
		return parkingSlot.parkVehicle(v);
	}

	public boolean removeVehicle(Vehicle v) {
		return parkingSlot.removeVehicle(v);
	}

	public static void main(String[] args) {
		ParkingLot parkingLot = new ParkingLot();

		
		Vehicle v = new Vehicle(VehicleType.FOUR_WHEELER,"KA51Z6783");
		parkingLot.parkVehicle(v);

		Vehicle v1 = new Vehicle(VehicleType.TWO_WHEELER,"KA01EE7490");
		parkingLot.parkVehicle(v1);

		// for testing purposes only
//		try {
//			Thread.sleep(10000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		parkingLot.removeVehicle(v);
	
		parkingLot.removeVehicle(v1);
	}
}
