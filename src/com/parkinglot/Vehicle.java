package com.parkinglot;

import java.util.Date;

public class Vehicle {
	
	
	public Vehicle(VehicleType vType, String regNo) {
		super();
		this.vType = vType;
		this.regNo = regNo;
		this.inTime = new Date();
	}
	@Override
	public String toString() {
		return "Vehicle [vType=" + vType + ", regNo=" + regNo + ", inTime=" + inTime + ", outTime=" + outTime
				+ ", cost=" + cost + "]";
	}
	private VehicleType vType = VehicleType.FOUR_WHEELER;
	private String regNo = null;	
	private Date inTime ;
	private Date outTime ;
	private double cost ;
	public double getCost() {return cost;}
	public void setCost(double d) {this.cost = d;}
	public VehicleType getVtype() {return vType;}
	public  void setVtype(VehicleType vType) {this.vType = vType;}
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public Date getInTime() {
		return inTime;
	}
	public void setInTime(Date inTime) {
		this.inTime = inTime;
	}
	public Date getOutTime() {
		return outTime;
	}
	public void setOutTime(Date outTime) {
		this.outTime = outTime;
	}
}
