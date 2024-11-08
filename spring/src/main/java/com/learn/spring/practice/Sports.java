package com.learn.spring.practice;

public class Sports {

	private int id;
	private String Sports_name;
	private String Sports_type;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSports_name() {
		return Sports_name;
	}
	public void setSports_name(String sports_name) {
		Sports_name = sports_name;
	}
	public String getSports_type() {
		return Sports_type;
	}
	public void setSports_type(String sports_type) {
		Sports_type = sports_type;
	}
	public Sports(int id, String sports_name, String sports_type) {
		super();
		this.id = id;
		Sports_name = sports_name;
		Sports_type = sports_type;
	}
	public Sports() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Sports [id=" + id + ", Sports_name=" + Sports_name + ", Sports_type=" + Sports_type + "]";
	}
	
	
	
}
