package com.javacodegeeks.junit;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

public class jsondemo {
	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			User user = mapper.readValue(new File("/home/wgy/workspace/user.json"), User.class);
			System.out.println(user);
			user.setGender(User.Gender.FEMALE);
			mapper.writeValue(new File("user-modified.json"), user);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
