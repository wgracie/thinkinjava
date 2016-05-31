package net.mindview.util;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class TextFile extends ArrayList<String>{
	/**
	 * 
	 * @param args
	 */
	
	// Read a file as a single string
	public static String read(String fileName) {
		StringBuilder sb = new StringBuilder();
		try {
			BufferedReader in = new BufferedReader(new FileReader(new File(fileName).getAbsolutePath()));
			try {
				String s;
				while ( (s=in.readLine()) != null) {
					sb.append(s);
					sb.append("\n");
				}
			}finally {
					in.close();
				}
			}catch (IOException e) {
				e.printStackTrace();
		}
		return sb.toString();
	}
	
	// write some text to a file
	public void write(String filename, String text) {
		try {
			PrintWriter out = new PrintWriter(new File(filename).getAbsolutePath());
			try {
				out.print(text);
			} finally {
				out.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// Read a file, separated by any regular expression
	public TextFile(String filename, String regex) {
		super(Arrays.asList(read(filename).split(regex)));
		if (get(0).equals("")) {
			remove(0);
		}
	}
	
	// Normally read a file
	public TextFile(String filename) {
		this(filename, "\n");
	}
	
	// Output a file
	public void write(String filename) {
		try {
			PrintWriter out = new PrintWriter(new File(filename).getAbsolutePath());
			try {
			for(String s: this) {
				out.println(s);
			} }finally {
				out.close();
			}
		} catch (IOException e) {
			throw new RuntimeException();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
