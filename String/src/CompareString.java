
public class CompareString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "Priyesh"; //string literls stored in string constant pool
		String s2="Priyesh";
		String s3=new String("Priyesh"); // craeting new string it stored in heap memory
		String s6=new String("Priyesh");
		String s4="Yadav";
		String s5="PRIYESH";
		
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.equals(s3));// true
		System.out.println(s1.equals(s4));// false
		System.out.println(s1.equals(s5));//false
		System.out.println("---------------");
		System.out.println(s3.equals(s6));//true imp
		
		// Ignore case use
		System.out.println(s1.equalsIgnoreCase(s5));// true 
		
		// compare by == operator
		System.out.println(s1==s2);//true
		System.out.println(s1==s3);// false bcox of we create new object which is stored in heap memory
		System.out.println(s1==s3);//false
		System.out.println(s1==s4);// false
		System.out.println("--------------------");
		System.out.println(s3==s6);// false imp
		 
		/* compareTo() method
		s1==s2 :0
		s1>s2 :positive value
		s1<s2 :negative value
		*/
		System.out.println(s1.compareTo(s2)); //0
		System.out.println(s1.compareTo(s4)); //-9
		System.out.println(s4 .compareTo(s1)); //9
		System.out.println(s4.compareTo(s5)); //9
	}

}
