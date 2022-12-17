package com.edu;

public class Bus {

	 private int bno;
	private boolean ac;
	private int capcity;
	public Bus(int bno, boolean ac, int cap) {
		super();
		this.bno = bno;
		this.ac = ac;
		this.capcity = cap;
	}
	public int setBus() {
		return bno;
		
	}
	
	public boolean isAc() {
		return ac;
		
	}
	public int setCapcity() {
		return capcity;
		
	}
	public void setBusNo(int b) {
		bno=b;
	}
	
	public void setAc(boolean val) {
		ac=val;
	}
	public void getCapcity(int cap) {
		capcity=cap;
	}
	
	public void displayBusInfo(){
		
		System.out.println("BusNo: " +bno+ "/ Ac Type: " +ac+  "/ Total Capcity: " +capcity);
		
	}
}
