package com.tacademy.json.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.tacademy.json.parser.ListParser;
import com.tacademy.json.vo.Lists;



public class ListTest {

   public ListTest() {
      // TODO Auto-generated constructor stub
   
   String listURL = "http://192.168.205.160/JSProject/list.txt";
   URL url = null;
   HttpURLConnection conn;
   BufferedReader reader = null;
   try {
      url= new URL(listURL);
      conn = (HttpURLConnection) url.openConnection();
      reader=new BufferedReader(new InputStreamReader(conn.getInputStream()));
      String readData ="";
      StringBuilder sb =new StringBuilder();
      
      while((readData=reader.readLine())!=null) {
         sb.append(readData).append("\n");
         
         
         System.out.println(readData);
      }//json문자열을 읽어옴 
      
      String jsonStr = sb.toString();
      
      ListParser parser = new ListParser();
      
      Lists lists = parser.doListParser(jsonStr);
      
      
      System.out.println(lists.toString());
      
      
      
      
   }catch(IOException e ) {
      System.out.println("파싱에러"+e);
   }finally {
      if(reader != null) {
         
         try {
            reader.close();
         } catch (IOException e) {
            e.printStackTrace();
         }
      }
   }
   
   }



public static void main(String[] args) {
	// TODO Auto-generated method stub
	new ListTest();
}

}