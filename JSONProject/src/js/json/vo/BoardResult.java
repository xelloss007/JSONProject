package js.json.vo;

import java.util.ArrayList;


public class BoardResult {
	private String state;
	private int size;
	private String imgBaseURL;
	private ArrayList<Board> boardList = new ArrayList<Board>();
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getImgBaseURL() {
		return imgBaseURL;
	}
	public void setImgBaseURL(String imgBaseURL) {
		this.imgBaseURL = imgBaseURL;
	}
	public ArrayList<Board> getBoardList() {
		return boardList;
	}
	public void setBoardList(ArrayList<Board> boardList) {
		this.boardList = boardList;
	}
	@Override
	public String toString() {
		return "BoardResult [state=" + state + ", size=" + size + ", imgBaseURL=" + imgBaseURL + ", boardList="
				+ boardList + "]";
	}

	
}
