package com.tacademy.json.handler;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.tacademy.json.vo.Local;
import com.tacademy.json.vo.Weather;

public class WeatherHandler extends DefaultHandler {
	private Weather weather;
	private Local local = null;
	String tName = ""; //없으니깐 만들고!!!
	
	public Weather getWeather(){
		return weather;
	}

	
	//<>속초<>  속초같은거 읽을때 호출 , 문자는 캘릭터스~
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String str = new String(ch, start, length);
		switch(tName){
		case "local" : 
			local.setlName(str);
			break;
		}
	}

	//꼭필요로 하지 않는다.
//	@Override
//	public void endDocument() throws SAXException {
//		
//	}
	
	//</local> 때 호출
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		switch(qName){
		case "local" :
			weather.getLocals().add(local);
			break;
		}
		tName = ""; //마지막 속초부분 나오기 위해서 이 한줄이 꼭 들어가야함
	}

	//꼭필요로 하지 않는다.
//	@Override
//	public void startDocument() throws SAXException {
//
//	}
	
	//<local> 때 호출
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
//		System.out.println("localName" + localName);
		switch(qName){
		case "weather" :
			weather = new Weather(); // wheather 를 하나 만들어냄.
			//attributes = 프로퍼티     <== 이쪽으로 들어옴
			weather.setYear(attributes.getValue("year"));
			weather.setMonth(attributes.getValue("month"));
			weather.setDay(attributes.getValue("day"));
			weather.setHour(attributes.getValue("hour"));
			break;
		case "local" :
			local = new Local();
			local.setStn_id(attributes.getValue("stn_id"));
			local.setIcon(attributes.getValue("icon"));
			local.setDesc(attributes.getValue("desc"));
			local.setTa(attributes.getValue("ta"));
			local.setRn_hr1(attributes.getValue("rn_hr1"));
			
			break;
		}
		tName = qName; //무조건 넣어줌 .안쓰면 지역변수이기때문에 밖같에 안나감.
	}
	
}
