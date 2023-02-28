package com.walmart.test.service.impl;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

import com.walmart.test.converter.Converter;
import com.walmart.test.propities.ErrorMessageProperties;
import com.walmart.test.service.TestService;

@Service
@EnableConfigurationProperties(ErrorMessageProperties.class)
public class TestServiceImpl implements TestService {

	@Autowired
	private com.walmart.test.propities.ErrorMessageProperties errorMsg;
	
	@Override
	public Map<String, Integer> listResponse(String[] array1, String[] array2) {
		if (array1 == null || array1.length == 0) {
			
	        throw new IllegalArgumentException();
	    }
	    if (array2 == null || array2.length == 0) {
	    	throw new IllegalArgumentException();
	    }	       		
		Map<String, Integer> productoMax=new HashMap<String, Integer>();
		for (int i = 0; i < array1.length; i++) {
			boolean ban=false;
			for (int j = 0; j < array2.length; j++) {
				if(array1[i].equals(array2[j])&& !ban ) {
					ban=true;
					if(productoMax.containsKey(array1[i])) {
						var contValue=productoMax.get(array1[i]);
						productoMax.replace(array1[i],++contValue);
					}else {
						productoMax.put(array1[i], 1);
					}
				}
			}
		}		
		return productoMax;
	}

	

	
}
