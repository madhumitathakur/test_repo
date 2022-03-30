package week_1_practicalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class StringCount {
	
	
}



public class StringCharacterCountTest {

	public static void main(String[] args) {
		System.out.println("Enter String: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		str = str.toLowerCase();
		sc.close();
		Map<String, Integer> map = new LinkedHashMap<>();
		for(int i=0; i<str.length(); i++) {
			String myChar = "" + str.charAt(i);
			if(map.containsKey(myChar)) {
				map.put(myChar, map.get(myChar)+1);
			}
			else {
				map.put(myChar, 1);
			}
		}
		
		for(String s: map.keySet()) {
			System.out.println(s + "-"+map.get(s));
		}
		
	}

}
