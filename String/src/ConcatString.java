
public class ConcatString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// concat string by +operator
		String s="Priyesh"+"Yadav";
		System.out.println(s); //PriyeshYadav
		
		String s1=10+20+"Priyesh"+60+10;
		System.out.println(s1);

	
		// concatnation by concat() method
		
		String s2="Priyesh";
		String s3="Yadav";
		String s4=s2.concat(s3);// creating new string for store concat method
		System.out.println(s4);//PriyeshYadav
	
	
	
	
	}


}
