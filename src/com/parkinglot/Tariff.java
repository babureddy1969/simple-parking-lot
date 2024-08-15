package com.parkinglot;

import java.util.HashMap;
import java.util.Map;

public class Tariff {

	@SuppressWarnings({ "serial" })
	public final static Map<VehicleType, Integer> TARIFF = new HashMap<VehicleType, Integer>(){{
	    put(VehicleType.FOUR_WHEELER, 10); // 10 rs per hour
	    put(VehicleType.TWO_WHEELER, 5); // 5 rs per hour
	}};
}
