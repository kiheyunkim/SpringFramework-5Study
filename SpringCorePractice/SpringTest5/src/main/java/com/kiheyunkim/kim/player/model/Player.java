package com.kiheyunkim.kim.player.model;

public class Player {
	private String name;
	private String phone;
	
	public Player(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getPhone() {
		return phone;
	}
}
