package strings;

public class CaesarCipher {
	private String alphabet;
	private String shiftedAlphabet;
	public CaesarCipher(int key) {
		setAlphabet("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		shiftedAlphabet = getAlphabet().substring(key) + getAlphabet().substring(0, key);
		
	}
	public String encrypt(String input) {
		StringBuilder encrypted = new StringBuilder(input);		
		for(int i  = 0; i < encrypted.length(); i++) {
			char currChar = encrypted.charAt(i);
			int idx = getAlphabet().indexOf(currChar);
			if(idx != -1) {
				char newChar = shiftedAlphabet.charAt(idx);
				encrypted.setCharAt(i, newChar);
			}
		}
		return encrypted.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(new CaesarCipher(5).getAlphabet());
	}
	public String getAlphabet() {
		return alphabet;
	}
	public void setAlphabet(String alphabet) {
		this.alphabet = alphabet;
	}

}
