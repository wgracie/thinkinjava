package net.mindview.util;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

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
	public static void write(String filename, String text) {
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
	
	// Normally read by lines
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
	
	// Read a file, split by any regular expression
	public TextFile(String fileName, String splitter) {
		super(Arrays.asList(read(fileName).split(splitter)));
		// Regular expression split() often leaves an empty String at first position
		if(get(0).equals("")) remove(0);
	}

	public static void main(String[] args) {
		String path = "src/net/mindview/util/TextFile.java";
		String file = read(path);
		write("test.txt", file);
		TextFile text = new TextFile("test.txt");
		text.write("test2.txt");
		// Break into unique sorted list of words
		TreeSet<String> words = new TreeSet<String>(new TextFile(path, "\\W+"));
		// Display the capitalized words;
		System.out.println(words.headSet("a"));


	}

}
