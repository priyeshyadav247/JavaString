import java.util.HashMap;
import java.util.Map.Entry;

public class FindDuplicateString {

	public static void main(String[] args) {
		
		String str ="Priyesh Rajendra Yadav Priyesh";
		HashMap<Character, Integer> hp= new HashMap<Character,Integer>();
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			char key=str.charAt(i);
			if (hp.containsKey(key))
			{
				count=hp.get(key);
				count++;
				hp.put(key, count);
			}
			else {
				hp.put(key, 1);
			}
			
		}
		for (Entry<Character, Integer> val : hp.entrySet()) {
			System.out.println(val.getKey()+"  occurs"+val.getValue());
			
		}
		
		
	}

}
