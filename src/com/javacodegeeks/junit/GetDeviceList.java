package com.javacodegeeks.junit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

//import com.k2data.dataservice.utils.ExpectResultGen;

public class GetDeviceList {
	private static String ignore = "${json-unit.ignore}";
	
    public static Map<String, Object> getDeviceList(String[]... strings){
    	Map<String, Object> all = new LinkedHashMap();
    	all.put("count", ignore);
    	all.put("total", ignore);
    	all.put("page", ignore);
    	all.put("size", ignore);
    	List<Object> list = new ArrayList();
    	for (String[] object : strings) {
			Map<String, Object> map = new LinkedHashMap();
			map.put("id", object[0]);
			Map<String, String> deviceType = new HashMap();
			deviceType.put("id", object[1]);
			deviceType.put("url", "my url");	
			map.put("deviceType", deviceType);
			list.add(map);
		}
    	all.put("data", list);
    	return all;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] d1 = {"device1", "dt1"};
		Map<String, Object> all = new LinkedHashMap();
		all = new GetDeviceList().getDeviceList(new String[]{"device1", "dt1"});
		System.out.println(all);

	}

}
