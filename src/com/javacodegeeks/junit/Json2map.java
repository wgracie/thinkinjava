package com.javacodegeeks.junit;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
 
public class Json2map
{
 
    public static void main(String[] args)
    {
        // write your code here
        ObjectMapper mapper = new ObjectMapper(); // can reuse, share globally
        try
        {
            // 读取JSON数据
            Map<String,Object> userData = mapper.readValue(new File("user.json"), Map.class);
            System.out.println(userData);
            // 写入JSON数据
            userData = new HashMap<String,Object>();
            Map<String,String> nameStruct = new HashMap<String,String>();
            nameStruct.put("first", "Joe");
            nameStruct.put("last", "Hankcs");
            userData.put("name", nameStruct);
            userData.put("gender", "MALE");
            userData.put("verified", Boolean.FALSE);
            userData.put("userImage", "Rm9vYmFyIQ==");
            mapper.writeValue(new File("user-modified-map.json"), userData);
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
