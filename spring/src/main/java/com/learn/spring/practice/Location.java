package com.learn.spring.practice;

public class Location {

	private int  location_id;
	private String sports_location;
	
	public int getLocation_id() {
		return location_id;
	}
	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}
	public String getSports_location() {
		return sports_location;
	}
	public void setSports_location(String sports_location) {
		this.sports_location = sports_location;
	}
	public Location(int location_id, String sports_location) {
		super();
		this.location_id = location_id;
		this.sports_location = sports_location;
	}
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Location [location_id=" + location_id + ", sports_location=" + sports_location + "]";
	}
	
	
}
