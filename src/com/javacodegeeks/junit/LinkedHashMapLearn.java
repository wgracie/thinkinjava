package com.javacodegeeks.junit;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;



public class LinkedHashMapLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Object, Object> map = new LinkedHashMap<>();
        map.put("TestQueryDevice", "Case Sensitive attribute value");
        map.put("中文属性", "中文属性值");
        map.put("boolean_attr", false);
        map.put("int_attr", 333);
        
        System.out.println(map.keySet().iterator().next());
        

	}

}
