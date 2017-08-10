package js.json.parser;

import org.json.JSONArray;
import org.json.JSONObject;

import js.json.vo.Board;
import js.json.vo.BoardResult;

public class BoardParser {

	public BoardResult doBoardParser(String jsonString){
		BoardResult boardResult = null;
		JSONObject obj = null;
		
		try{
		obj = new JSONObject(jsonString);
		boardResult = new BoardResult();
		
		boardResult.setState(obj.getString("state"));
		boardResult.setSize(obj.getInt("size"));
		boardResult.setImgBaseURL(obj.getString("imgbaseurl"));
		
		JSONArray boardArr = obj.getJSONArray("boardList");
			
		Board board = null;
		JSONObject tempBoard = null;
		for(int i = 0; i < boardArr.length(); i++){
			tempBoard = boardArr.getJSONObject(i);
			board = new Board();
			board.setNum(tempBoard.getInt("num"));
			board.setWriter(tempBoard.getString("writer"));
			board.setTitle(tempBoard.getString("title"));
			board.setContent(tempBoard.getString("content"));
			board.setIp(tempBoard.getString("ip"));
			board.setIdate(tempBoard.getString("idate"));
			board.setImg(tempBoard.getString("img"));
			
			boardResult.getBoardList().add(board);
		}
		
//		boardResult.getBoardList().add(board);
		
		
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return boardResult;
	}
}