
public class RemoveJunk {

	public static void main(String[] args) {

			String s= "@pr%i!yes*&h";
			
			// by using regular expression [^a-zA-Z0-9] 
			s=s.replaceAll("[^a-zA-Z0-9]", ""); //^a-zA-Z0-9 in this ^ is not replace if we dont write it o/p  is all symbols 
			System.out.println(s);
	}

}
