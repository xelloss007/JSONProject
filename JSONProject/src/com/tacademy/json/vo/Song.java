package com.tacademy.json.vo;

import java.util.ArrayList;

public class Song {
	private int songld;
	private String sonName;
	private int albumId;
	private String albumName;
	private	int currentRank;
	private	int pastRank;
	private int playTime;
	private String issueDate;
	private boolean isTitleSong;
	private boolean isHitSong;
	private boolean isAdult;
	private boolean isFree;
	
	
	
	public int getPastRank() {
		return pastRank;
	}
	public void setPastRank(int pastRank) {
		this.pastRank = pastRank;
	}
	private ArrayList<Artist> artists =new ArrayList<Artist>();
	
	public ArrayList<Artist> getArtists() {
		return artists;
	}
	public void setArtists(ArrayList<Artist> artists) {
		this.artists = artists;
	}
	public int getSongld() {
		return songld;
	}
	public void setSongld(int songld) {
		this.songld = songld;
	}
	public String getSonName() {
		return sonName;
	}
	public void setSonName(String sonName) {
		this.sonName = sonName;
	}
	public int getAlbumId() {
		return albumId;
	}
	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}
	public String getAlbumName() {
		return albumName;
	}
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}
	public int getCurrentRank() {
		return currentRank;
	}
	public void setCurrentRank(int currentRank) {
		this.currentRank = currentRank;
	}
	public int getPlayTime() {
		return playTime;
	}
	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public boolean isTitleSong() {
		return isTitleSong;
	}
	public void setTitleSong(boolean isTitleSong) {
		this.isTitleSong = isTitleSong;
	}
	public boolean isHitSong() {
		return isHitSong;
	}
	public void setHitSong(boolean isHitSong) {
		this.isHitSong = isHitSong;
	}
	public boolean isAdult() {
		return isAdult;
	}
	public void setAdult(boolean isAdult) {
		this.isAdult = isAdult;
	}
	public boolean isFree() {
		return isFree;
	}
	public void setFree(boolean isFree) {
		this.isFree = isFree;
	}
	@Override
	public String toString() {
		return "Song [songld=" + songld + ", sonName=" + sonName + ", albumId=" + albumId + ", albumName=" + albumName
				+ ", currentRank=" + currentRank + ", pastRank=" + pastRank + ", playTime=" + playTime + ", issueDate="
				+ issueDate + ", isTitleSong=" + isTitleSong + ", isHitSong=" + isHitSong + ", isAdult=" + isAdult
				+ ", isFree=" + isFree + ", artists=" + artists + "]";
	}
	
	
	
	
}
