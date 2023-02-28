package com.walmart.test.converter;

import java.util.Map;
import java.util.Map.Entry;

public class Converter {

	public static String ToJson(Map<String, Integer> productoMax)
    {
        boolean ban = false;
        StringBuilder jsonSB = new StringBuilder();
        jsonSB.append("{");   
        for (Entry<String, Integer> entry : productoMax.entrySet()) {
        	ban = true;
        	jsonSB.append(
            		entry.getKey()+":'"+entry.getValue()  +"',"
                ); ;
			
		}       
        String json = jsonSB.toString();
        if (ban)
        {
            json = json.substring(0, json.length() - 1);
        }
        json += "}";        
        return json;
    }
}
