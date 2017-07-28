package com.tacademy.json.vo;

import java.util.ArrayList;

public class Lists {
	private String status;
	private int count;
	private ArrayList<Board> boards = new ArrayList<Board>();
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public ArrayList<Board> getList() {
		return boards;
	}
	public void setList(ArrayList<Board> list) {
		this.boards = list;
	}
	@Override
	public String toString() {
		return "Lists [status=" + status + ", count=" + count + ", boards=" + boards + "]";
	}


}
