package com.tacademy.json.parser;

import java.io.InputStream;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;


import com.tacademy.json.handler.WeatherHandler;
import com.tacademy.json.vo.Weather;

public class WeatherParser {
	public Weather parse(InputStream is){
		Weather weather = null;
		//디자인 패턴 MVC, Factory 패턴, Singletone
		SAXParserFactory sFactory =null; //1.공장에서 파서를 만들어서
		SAXParser parser = null; //2.파싱을 만든다
		
		
		

		sFactory = SAXParserFactory.newInstance();
		WeatherHandler dh = new WeatherHandler(); //애가 파싱
		try {
			parser = sFactory.newSAXParser(); //공장에서 파서를 얻어옴
			parser.parse(is, dh); //리턴되는게 없어
			weather = dh.getWeather();
		} catch (Exception e) {
			System.out.println("파싱오류 : " + e);
		}
		return weather;
	}
}
