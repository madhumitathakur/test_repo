package Lambda_11_expression;

public class ArithmeticOperationTest {

	public static void main(String[] args) {
		
		ArithmeticInterface addition = (int x,int y)-> x+y;
		ArithmeticInterface subtraction = (int x,int y)-> x-y;
		ArithmeticInterface multiply = (int x,int y)-> x*y;
		ArithmeticInterface division = (int x,int y)-> x/y;
		
		System.out.println("Addition : " + addition.operation(5, 20));
		System.out.println("subtraction : " + subtraction.operation(30, 20));
		System.out.println("multiplication : " + multiply.operation(5, 20));
		System.out.println("division : " + division.operation(5, 20));


	}

}
