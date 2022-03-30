package Day14FunctionnalInterface;

public class Starter {
	public static void main(String[] args) {
		
		MyFunctionalInterface mf = new MyFunctionalInterface(){
			
			@Override
			public void show() {
				System.out.println("This is a way of creating ref to interface");
			}
		};				

	}

}
