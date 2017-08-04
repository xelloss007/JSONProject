package com.tacademy.json.vo;

public class Current {
	private String xmlns;
	private Weather weather;
	
	public String getXmlns() {
		return xmlns;
	}
	public void setXmlns(String xmlns) {
		this.xmlns = xmlns;
	}
	public Weather getWeather() {
		return weather;
	}
	public void setWeather(Weather weather) {
		this.weather = weather;
	}
	@Override
	public String toString() {
		return "Current [xmlns=" + xmlns + ", weather=" + weather + "]";
	}
	
	
}
