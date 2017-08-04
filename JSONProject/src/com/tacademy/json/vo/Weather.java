package com.tacademy.json.vo;

import java.util.ArrayList;

public class Weather {

	//무조건 스트링이다!!!
	private String year;
	private String month;
	private String day;
	private String hour;
	private ArrayList<Local> locals = new ArrayList<Local>();
	
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getHour() {
		return hour;
	}
	public void setHour(String hour) {
		this.hour = hour;
	}
	public ArrayList<Local> getLocals() {
		return locals;
	}
	public void setLocals(ArrayList<Local> locals) {
		this.locals = locals;
	}
	@Override
	public String toString() {
		return "Weather [year=" + year + ", month=" + month + ", day=" + day + ", hour=" + hour + ", locals=" + locals
				+ "]";
	}
	
	
//	<weather year="2017" month="08" day="04" hour="15">
//	  <local stn_id="90" icon="" desc="-" ta="28.2">속초</local> 
//	  <local stn_id="93" icon="02" desc="구름조금" ta="33.6">북춘천</local> 
//	  <local stn_id="95" icon="" desc="-" ta="31.9">철원</local> 
//	  <local stn_id="98" icon="" desc="-" ta="32.8">동두천</local> 
//	  <local stn_id="99" icon="" desc="-" ta="31.3">파주</local> 
//	  <local stn_id="100" icon="" desc="-" ta="26.2">대관령</local> 

	
	
	
}
