package com.icss.vdms.junit;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;


public class VdmsBaseJunit {

	@Test
	public void test(){
		
		//MappingJacksonHttpMessageConverter
		
		
		Map<String, Integer> myMap = new HashMap<String, Integer>();
		
		myMap.put("1", 1);
		
		System.out.println(myMap.get("1"));
		
		
		if((myMap.get("1")^1) > 0){
			System.out.println("000");
		}else {
			
		}
		
	}
	
	@Test
	public void testEncode(){
		
		String str = URLEncoder.encode("898089");
		
//		String str = URLDecoder.decode("3_<l:0Fg[");
		System.out.println(str);
	}
	
}
