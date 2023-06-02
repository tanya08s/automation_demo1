package Utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonManager extends CoreTestIntegration{
	
	public static JSONObject jsonObject;
	public static FileReader fileReader;
	
	public static JSONArray readData(String filePath) {
		Object obj =null;
		JSONParser jsonParser = new JSONParser();
	      try {
	    	  fileReader = new FileReader(filePath);
	    	  
	      }
	      catch (FileNotFoundException e) {
	            e.printStackTrace();
	      } 
	      try{
			 obj = jsonParser.parse(fileReader);
	      }
	      catch (IOException e) {
	         e.printStackTrace();
	      }catch (org.json.simple.parser.ParseException e) {
			e.printStackTrace();
		}
	      JSONArray jsonArrayList= (JSONArray) obj;   
		  return jsonArrayList;
	}
	
	public static JSONObject fetch(String filePath,String data) {
		JSONArray list = readData(prop.getProperty(filePath));
		 for(int i=0;i<list.size();i++) {
			 jsonObject = (JSONObject) list.get(i);
			 if(jsonObject.keySet().contains(data)) {
				 jsonObject = (JSONObject) jsonObject.get(data);
				 break;
			 }
		 }
		 return jsonObject;
	}

}
