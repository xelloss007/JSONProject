package com.tacademy.json.vo;

import java.util.Arrays;

public class Student {
	//이름, 학번,  나이, 성별, 취미
	
	private String name;
	private String hakbun;
	private int age;
	private boolean sex;
	private String[] hobby;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHakbun() {
		return hakbun;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public String[] getHobby() {
		return hobby;
	}
	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", hakbun=" + hakbun + ", age=" + age + ", sex=" + sex + ", hobby="
				+ Arrays.toString(hobby) + "]";
	}
	
	
	
	
	
	
}
