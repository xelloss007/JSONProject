package js.json.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


import js.json.parser.BoardParser;
import js.json.vo.BoardResult;

public class BoardTest {

	public BoardTest() {
		// TODO Auto-generated constructor stub
	
		String boardURL = "http://192.168.205.185/board/list";
		URL url = null;
		HttpURLConnection conn = null;
		BufferedReader reader = null;
		try {
			url = new URL(boardURL);
			conn = (HttpURLConnection)url.openConnection();
			reader =new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String readData = "";
			StringBuilder sb = new StringBuilder();
			while((readData = reader.readLine()) != null){
				sb.append(readData).append("\n");
			}
			String jsonStr = sb.toString();
			
			BoardParser parser = new BoardParser();
			BoardResult board = parser.doBoardParser(jsonStr);
			
			System.out.println(board);
//			System.out.println(jsonStr);
		} catch (Exception e) {
			System.out.println("melon 오류 : " + e);
		}finally{
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BoardTest();
	}

}
