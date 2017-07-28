package com.tacademy.json.parser;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.tacademy.json.vo.Board;
import com.tacademy.json.vo.Lists;

public class ListParser {

	public  Lists doListParser(String jsonString){
		Lists lists = null;
		JSONObject obj1 = null;
		JSONObject json = null;
  
		try {
			obj1 = new JSONObject(jsonString);
			lists = new Lists();
			
			lists.setStatus(obj1.getString("status"));
			lists.setCount(obj1.getInt("count"));
			JSONArray boardArr = obj1.getJSONArray("list");
			
			Board board = null;
			JSONObject tempBoard = null;
			for(int i = 0; i < boardArr.length(); i++){
				tempBoard = boardArr.getJSONObject(i);
				board = new Board();
				board.setNum(tempBoard.getInt("num"));
				board.setTitle(tempBoard.getString("writer"));
				board.setContent(tempBoard.getString("content"));
				board.setCnt(tempBoard.getInt("cnt"));
				board.setState(tempBoard.getBoolean("state"));
			
				lists.getList().add(board);
			}
			
			lists.getList().add(board);
			
			
		} catch (JSONException e) {
			System.out.println("json 파싱 오류 : " + e);
		}
		
		
		
		
		
		
		return lists;
	}
	
}
