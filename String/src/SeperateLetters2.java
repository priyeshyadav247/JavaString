
public class SeperateLetters2 {

	public static void main(String[] args) {
		
		String s = new String("pri12yes7@h#");
		String letters="";
		String numbers="";
		String specials="";
		for (int i = 0; i < s.length(); i++) {
			char ch= s.charAt(i);
			if (Character.isDigit(ch)) {
				numbers= numbers+ch;
				
			}
			else if (Character.isAlphabetic(ch)){
				letters=letters+ch;
			}
			else {
				specials=specials+ch;
			}
		}
		System.out.println(numbers);
		System.out.println(letters);
		System.out.println(specials);
	}

}
