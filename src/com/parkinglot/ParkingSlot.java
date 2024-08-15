package com.parkinglot;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ParkingSlot {

	private Map<String, Vehicle> slots = new HashMap<String, Vehicle>();

	public ParkingSlot() {
		for (int i=0; i<10; i++) {
			slots.put(generateSlot(VehicleType.FOUR_WHEELER, i), null);
		}	
		for (int i=0; i<10; i++) {
			slots.put(generateSlot(VehicleType.TWO_WHEELER, i), null);
		}	
	}
	
	private String generateSlot(VehicleType vType, int i) {
		return "Slot-" + vType + "-" + (i+1);
	};
	
	private String isAvailable(Vehicle v) {
		
		for (String k : slots.keySet()) {
			if (k.split("-")[1].equals(v.getVtype().toString()) && slots.get(k) == null) {
				return k;
			}
		}
		
		return null;
	}
	
	public boolean parkVehicle(Vehicle v) {
		String slot = isAvailable(v);
		if (null != slot) {
			slots.put(slot, v);
			v.setInTime(new Date());
			System.out.println("Slot " + slot + " " + v.toString());
			return true;
		} 
		System.out.println("NO SLOTS " + slot + " " + v.toString());
		return false;
	}

	private String getSlot(Vehicle v) {
		for (String k : slots.keySet()) {
			if (slots.get(k).equals(v)) {
				return k;
			}
		}
		return null;
	}
	
	public boolean removeVehicle(Vehicle v) {
		if (getSlot(v) == null) {
			System.out.println("Vehicle " + v.getRegNo() + " not found in slot " + getSlot(v));
			return false;
		}

		v = slots.get(getSlot(v));
		v.setOutTime(new Date());
		v.setCost(((v.getOutTime().getTime() - v.getInTime().getTime()))/1000/60000/(60*60*1000) * Tariff.TARIFF.get(v.getVtype()).intValue());			
		System.out.println(v.toString());
		return false;
	}	
}
