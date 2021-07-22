
public class StringManipulation {

	public static void main(String[] args) {

		String str="hi priyesh your CTC is fourteen lakh in year 2021";
		String str1="hi priyesh your CTC is fourteen lakh in year 2021";
		
		System.out.println(str.length()); // 50 length
		System.out.println(str.indexOf('y')); // 1st occurrence at 7
		System.out.println(str.indexOf('y',str.indexOf('y')+1)); // 2nd occurrence 12
		System.out.println(str.charAt(6));// i
		System.out.println(str.charAt(1));// h
		System.out.println(str.indexOf("priyesh")); //4
		System.out.println(str.indexOf("yadav"));// -1 if word is not present
		System.out.println(str.indexOf('z')); // -1 if char is not present
		
		// string comparison
		//1.equals() 
		System.out.println(str.equals(str1)); // true
		//2.equalsignorecase
		System.out.println(str.equalsIgnoreCase(str1)); // true  
		
		// substring
		System.out.println(str.substring(0, 12));// hin priyesh y
		
		//trim
		System.out.println(str.trim()); // remove only front and last space not remove middle space
		
		System.out.println(str.replace(" ", "")); // remove all spaces from str
		
		//// split --- interview point of view 
		String s="hello_priyesh_yadav";
		String sval[]=s.split("_"); //return string array dont use normal array
		for (int i = 0; i < sval.length; i++) 
		{
			System.out.println(sval[i]);
			
		}// hello priyesh yadav
		// concat
		String s1="patil";
		System.out.println(s1.concat(s));// // hello priyesh yadav patil
		
		// intger and string
		String x="jack";
		String y="sparrow";
		int a=100;
		int b=200;
		
		System.out.println(x+y);// jacksparrow
		System.out.println(a+b);//300
		System.out.println(x+y+a+b);//jacksparrow300
		System.out.println(a+b+x+y);// 300jacksparrow
		System.out.println(x+y+(a+b));//jacksparrow300
		
	}

}
