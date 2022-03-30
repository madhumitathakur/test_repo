package Day14FunctionnalInterface;

public class ArithmaticOpeation {
	public static void main(String[] args) {
		String a="hello";
		System.out.println(System.identityHashCode(a));

		String b="world";
		a=a+b;
		System.out.println(System.identityHashCode(a));
		String x = new String("hello");
		String c="world";
		
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(c));
		System.out.println(System.identityHashCode(b));
		
	}
}
