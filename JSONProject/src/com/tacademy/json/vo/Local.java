package com.tacademy.json.vo;

public class Local {

	private String stn_id;
	private String icon;
	private String desc;
	private String ta;
	private String rn_hr1;
	private String lName; ////	 속초</local> 이것도 정의해야돼!!! 변수로 만들어주자.
	
	public String getStn_id() {
		return stn_id;
	}
	public void setStn_id(String stn_id) {
		this.stn_id = stn_id;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getTa() {
		return ta;
	}
	public void setTa(String ta) {
		this.ta = ta;
	}
	public String getRn_hr1() {
		return rn_hr1;
	}
	public void setRn_hr1(String rn_hr1) {
		this.rn_hr1 = rn_hr1;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	@Override
	public String toString() {
		return "Local [stn_id=" + stn_id + ", icon=" + icon + ", desc=" + desc + ", ta=" + ta + ", rn_hr1=" + rn_hr1
				+ ", lName=" + lName + "]";
	}
	
	
	

}
