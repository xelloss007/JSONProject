package com.tacademy.json.test;

import java.net.HttpURLConnection;
import java.net.URL;


import com.tacademy.json.parser.WeatherParser;
import com.tacademy.json.vo.Weather;


public class WeatherTest {

	public WeatherTest() {
		// TODO Auto-generated constructor stub

		String weatherURL = "http://www.kma.go.kr/XML/weather/sfc_web_map.xml";

		URL url = null;
		HttpURLConnection conn = null;
//		BufferedReader reader = null;
		try {
			url = new URL(weatherURL);
			conn = (HttpURLConnection)url.openConnection();
			//			SAX 파싱(이벤트 파싱)
			int  code = conn.getResponseCode();
			switch(code){
			case HttpURLConnection.HTTP_OK :   //200상수와 같음!!
//				reader =new BufferedReader(new InputStreamReader(conn.getInputStream()));
				WeatherParser parser = new WeatherParser();
				Weather weather = parser.parse(conn.getInputStream());
				System.out.println(weather);
				break;
			default : 
				System.out.println("에러~");
				break;
			
			
			}
			
			
			
			
			//SAX파싱으 자기가 알아서 읽어와서 주석쪽 작업이 필요 없다.
			//			String readData = "";
			//			StringBuilder sb = new StringBuilder();
			//			while((readData = reader.readLine()) != null){
			//				sb.append(readData).append("\n");
			//			}
			//			String jsonStr = sb.toString();



			//파싱XML 파싱 = DOM 파싱, SAX 파싱(이벤트파싱) : 2가지가 있는데 SAX파싱쪽을 많이함.

//			System.out.println(jsonSㅁtr);
		} catch (Exception e) {
			System.out.println("weather 오류 : " + e);
		}finally{

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new WeatherTest();
	}

}
