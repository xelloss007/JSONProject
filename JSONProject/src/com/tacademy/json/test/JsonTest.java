package com.tacademy.json.test;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.tacademy.json.vo.Student;

public class JsonTest {

	public JsonTest() {
		// TODO Auto-generated constructor stub
		Student student = new Student();
		student.setName("홍길동");
		student.setHakbun("t001");
		student.setAge(30);
		student.setSex(true);
		student.setHobby(new String[]{"축구", "야구", "농구"});
	
		//student ==> json 문자열로 변경
		//JSON making
//		['축구','야구','농구']
		String[] hobby = student.getHobby();
		String hobbyStr = "[";
		for(String s : hobby){
			hobbyStr += "'" + s + "'" + ","; 
		}
		hobbyStr = hobbyStr.substring(0, hobbyStr.length() - 1);
		hobbyStr += "]";
//		substring(3,6); 3번째 자리 포함 부터 6번 제외한 5번까지
		
		
		String jsonStr = String.format("{name : '%s', age : %d, hakbun : %s, sex : %b, hobby : %s}", 
				student.getName(), student.getAge(), student.getHakbun(), student.isSex(), hobbyStr);
		
		System.out.println(jsonStr);

		
		
		JSONObject obj = new JSONObject();
		obj.put("name", student.getName());
		obj.put("hakbun", student.getHakbun());
		obj.put("age", student.getAge());
		obj.put("sex", student.isSex());
		JSONArray arr = new JSONArray();
		String[] hobbys = student.getHobby();
		for(String s : hobbys){
			arr.put(s);
		}
		obj.put("hobby", arr);		
		String jsonStr1 = obj.toString();
		System.out.println(jsonStr1);
		
		
		
//		JSON문자열 ==> 자바의 객체로 변환
//		JSON 파싱 과정
		
		Student student2 = new Student();
		
		JSONObject obj1 = null;
		
		try{	//제이슨은 트라이케치 필요함.
			obj1 = new JSONObject(jsonStr1);
			student2.setSex(obj1.getBoolean("sex"));
			student2.setName(obj1.getString("name"));  //제이슨 문자열에 네임1이 없으면 익셉셥으로 오류나가나서 학번도 가지고 오지 않는다.
			student2.setHakbun(obj1.getString("hakbun"));
			student2.setAge(obj1.getInt("age"));
			JSONArray jsonArr = obj1.getJSONArray("hobby");
			String[] hobbys1 = new String[jsonArr.length()];
			for(int i = 0; i < hobbys1.length; i++){
				hobbys1[i] = jsonArr.getString(i);
			}
			student2.setHobby(hobbys1);		
			//파싱 완료
		}catch(JSONException e){
			System.out.println("json 파싱 오류 : " + e);
		}

		System.out.println(student2);
//	홍길동
//	A홍길동
//	이름 : 홍길동,
//	{name : '홍길동'}
//	<!xml><name>홍길동</name><age>30</age>
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new  JsonTest();
	}

}
