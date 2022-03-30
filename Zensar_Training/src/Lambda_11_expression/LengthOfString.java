package Lambda_11_expression;

@FunctionalInterface
interface StringInterface {
	
	public int length(String s);
	
}


public class LengthOfString {

	public static void main(String[] args) {

		StringInterface str = (String s) -> {return s.length();};
		
		System.out.println("Length: " + str.length("Hello"));

	}

}
