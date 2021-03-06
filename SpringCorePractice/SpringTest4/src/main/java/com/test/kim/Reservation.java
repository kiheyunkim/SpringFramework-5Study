package com.test.kim;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Reservation {
	private String courtName;
	private Date date;
	private int hour;
	private Player player;
	private SportType sportType;
	
	public Reservation(String courtName, LocalDate date, int hour, Player player, SportType sportType) {
		this.courtName = courtName;
		this.date = Date.from(date.atStartOfDay(ZoneId.systemDefault()).toInstant());
		this.hour = hour;
		this.player = player;
		this.sportType = sportType;
	}
	
	public void setCourtName(String courtName) {
		this.courtName = courtName;
	}
	
	public String getCourtName() {
		return courtName;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setHour(int hour) {
		this.hour = hour;
	}
	
	public int getHour() {
		return hour;
	}
	
	public void setPlayer(Player player) {
		this.player = player;
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public void setSportType(SportType sportType) {
		this.sportType = sportType;
	}
	
	public SportType getSportType() {
		return sportType;
	}
}
