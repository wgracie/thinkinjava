package hashmap;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class DnaCodon {
	private HashMap<String, Integer> codonCount;
	
	public DnaCodon() {
		codonCount = new HashMap<String, Integer>();
	}
	
	public void buildCodonMap(int start, String dna) {
		codonCount = new HashMap<String, Integer>();
		for(int k = start; k <= dna.length() - 3; k = k + 3) {
			String key = dna.substring(k, k+3);
			if(codonCount.containsKey(key)) {
				codonCount.put(key, codonCount.get(key) + 1);
			}
			else {
				codonCount.put(key, 1);
			}
		}
	}
	
	public String getMostCommonCodon() {
		String mostCommonCodon = null;
		int count = 0;
		for(String key : codonCount.keySet()) {
			if(codonCount.get(key) > count) {
				mostCommonCodon = key;
				count = codonCount.get(key);
			}				
		}
		return mostCommonCodon;
	}
	
	public void printCodonCounts(int start, int end) {
		for(String key : codonCount.keySet()) {
			if(codonCount.get(key) >= start && codonCount.get(key)  <= end) {
				System.out.println(key + "\t" + codonCount.get(key));
			}
		}		
	}
	
	public void test(String fileName) throws IOException {
		File file = new File(fileName);
		InputStreamReader read = new InputStreamReader(new FileInputStream(file));// 考虑到编码格式
        BufferedReader bufferedReader = new BufferedReader(read);
        String dnas = bufferedReader.readLine().toUpperCase().trim();
        bufferedReader.close();
        for(int i = 0; i <= 2; i++) {
        	buildCodonMap(i, dnas);
        	System.out.println("Reading frame starting with " + i + " in " + codonCount.size() + " unique codons");
        	System.out.println("and most common condon is " + getMostCommonCodon() + " with count " + codonCount.get(getMostCommonCodon()));
        	System.out.println("Counts of codons between 1 and 5 inclusive are: ");
        	printCodonCounts(1, 5);        	
        }
		
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入文件名:");
		String fileName = sc.nextLine();
		DnaCodon dnaCodon = new DnaCodon();
		dnaCodon.test(fileName);

	}

}
