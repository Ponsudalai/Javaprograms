package com.edu;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Address_Table")
public class Address {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="Address_ID")
	private int addressid;
@Column(name="Street")
	private String addressStreet;
@Column(name="City")
	private String addreesCity;
	public Address() {
		super();
		
	}
	public Address( String addressStreet, String addreesCity) {
		super();
		
		this.addressStreet = addressStreet;
		this.addreesCity = addreesCity;
	}
	public int getAddressid() {
		return addressid;
	}
	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}
	public String getAddressStreet() {
		return addressStreet;
	}
	public void setAddressStreet(String addressStreet) {
		this.addressStreet = addressStreet;
	}
	public String getAddreesCity() {
		return addreesCity;
	}
	public void setAddreesCity(String addreesCity) {
		this.addreesCity = addreesCity;
	}
	@Override
	public String toString() {
		return "Address [addressid=" + addressid + ", addressStreet=" + addressStreet + ", addreesCity=" + addreesCity
				+ "]";
	}
	
	
}
