
public class StringclassMethod {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		// toUpperCase() and toLowerCase
		String s="  Priyesh  ";
		String s1="Yadav";
		System.out.println(s.toUpperCase()); //  PRIYESH
		System.out.println(s.toLowerCase()); //  priyesh
		
		// trim() method - eliminates white spaces beforn after string
		System.out.println(s.trim());//Priyesh
		
		
		// startsWith() and endsWith()
		System.out.println(s1.startsWith("Y"));// true - bcoz of white space they show S is false 
		System.out.println(s1.endsWith("v"));// true 
		System.out.println(s1.startsWith("Y", 0));//true
		
		//substring()
		System.out.println(s1.substring(0));//yadav
		System.out.println(s1.substring(2, 4));//da
		System.out.println(s1.substring(1));//adav if we get 10 indx show error stringoutofbound
		
		
		//cahrAt()
		System.out.println(s1.charAt(0)); //Y
		System.out.println(s1.charAt(2)); //d
		
		//length()
		System.out.println(s1.length());//5
		System.out.println(s.length()); // 11 --because of white space
		
		//replace() method
		String s2="i am bad boy. yes i am bad boy . iam very bad bad boy";
		System.out.println(s2.replace("bad", "good")); //replace bad to good 
		
		
		//relaceAll() and tepalce whitespaces
		System.out.println(s2.replaceAll("am", "have"));
		System.out.println(s2.replaceAll("\\s",""));
		
		//contains()
		String s3="we are create new world";
		System.out.println(s3.contains("we are")); // true
		System.out.println(s3.contains("create new world")); //true 
		System.out.println(s3.contains("Priyesh")); //false --because of s3 cant conatain priyesh
		
		//using if stmt contains()
		if(s3.contains("create"))
		{
			System.out.println("this contain statment is coorect");
		}else
		{System.out.println("this is wrong they dont contain such a string element");}
	}

}
