package js.json.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.tacademy.json.parser.MelonParser;
import com.tacademy.json.vo.Melon;


public class MelonTest {

	public MelonTest() {
		// TODO Auto-generated constructor stub
		
		String melonURL = "http://apis.skplanetx.com/melon/charts/realtime?count=10&page=1&version=1";
		
		URL url = null;
		HttpURLConnection conn = null;
		BufferedReader reader = null;
		try {
			url = new URL(melonURL);
			conn = (HttpURLConnection)url.openConnection();
			//제이슨으로 불러올 수 있다.
			conn.setRequestProperty("appKey", "31c1e579-b9c2-3697-95d3-ed1ba8a82815");
			conn.setRequestProperty("format", "json");
			reader =new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String readData = "";
			StringBuilder sb = new StringBuilder();
			while((readData = reader.readLine()) != null){
				sb.append(readData).append("\n");
			}
			String jsonStr = sb.toString();
			
			MelonParser parser = new MelonParser();
			Melon melon = parser.doMelonParser(jsonStr);
			
			System.out.println(jsonStr);
		} catch (Exception e) {
			System.out.println("melon 오류 : " + e);
		}finally{
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MelonTest();
	}

}
