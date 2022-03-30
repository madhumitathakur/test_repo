package Day14FunctionnalInterface;

@FunctionalInterface
public interface MyFunctionalInterface {
	
	public void show();
	
	static void display() {
		System.out.println("This is static method");
	}
	
	default void print() {
		System.out.println("this is a default method");
	}

}
