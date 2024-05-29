package com.tut.Projectwithmaven1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
private int roadno;
private String city;
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public Address(int roadno, String city) {
	super();
	this.roadno = roadno;
	this.city = city;
}
public int getRoadno() {
	return roadno;
}
public void setRoadno(int roadno) {
	this.roadno = roadno;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Address [roadno=" + roadno + ", city=" + city + "]";
}





}
