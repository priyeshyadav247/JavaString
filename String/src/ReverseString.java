

public class ReverseString {

	public static void main(String[] args) {
		
		String s= "priyesh";
		int len= s.length(); // length is 7
		
		String rev ="";
		
		for(int i=len-1;i>=0;i--) // here lenghts is comes as 7 then 7-1 =6 so value is h 
		{
		rev=rev+	s.charAt(i); // append because rev is zero when we get i value it goes to rev and print reverse .
		
		}
		 System.out.println(rev);

	}

}
