package com.findsport.DataObjects;

import java.sql.Date;

public class CourtAvailability {

	private long stadium_id;
	private int court_id;
	private Date start_time;
	private Date end_time;
	
	public long getStadium_id() {
		return stadium_id;
	}
	public void setStadium_id(long stadium_id) {
		this.stadium_id = stadium_id;
	}
	public int getCourt_id() {
		return court_id;
	}
	public void setCourt_id(int court_id) {
		this.court_id = court_id;
	}
	public Date getStart_time() {
		return start_time;
	}
	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	}
	public Date getEnd_time() {
		return end_time;
	}
	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}
	
}
