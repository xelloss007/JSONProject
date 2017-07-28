package com.tacademy.json.vo;

import java.util.ArrayList;

public class Melon {
	private int menuld;
	private int count;
	private int page;
	private int totalPages;
	private String rankDay;
	private String rankHour;
	private ArrayList<Song> songs = new ArrayList<Song>();
	public int getMenuld() {
		return menuld;
	}
	public void setMenuld(int menuld) {
		this.menuld = menuld;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public String getRankDay() {
		return rankDay;
	}
	public void setRankDay(String rankDay) {
		this.rankDay = rankDay;
	}
	public String getRankHour() {
		return rankHour;
	}
	public void setRankHour(String rankHour) {
		this.rankHour = rankHour;
	}
	public ArrayList<Song> getSongs() {
		return songs;
	}
	public void setSongs(ArrayList<Song> songs) {
		this.songs = songs;
	}
	@Override
	public String toString() {
		return "Melon [menuld=" + menuld + ", count=" + count + ", page=" + page + ", totalPages=" + totalPages
				+ ", rankDay=" + rankDay + ", rankHour=" + rankHour + ", songs=" + songs + "]";
	}
	
	
}
