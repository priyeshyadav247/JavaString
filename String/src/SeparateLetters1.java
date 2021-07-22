
public class SeparateLetters1 {
 
	static void  splitString(String str) 
	{
		StringBuffer alpha= new StringBuffer(), num =new StringBuffer(), special = new StringBuffer();
		
		for (int i = 0; i < str.length(); i++) 
		{
			char ch= str.charAt(i);
			if (Character.isAlphabetic(ch))
				alpha.append(ch);
			else if(Character.isDigit(ch))
				num.append(ch);
			else
				special.append(ch);
		}
		System.out.println(alpha);
		System.out.println(num);
		System.out.println(special);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "123AM256CD@#87" ;
		splitString(str);
	}

}
