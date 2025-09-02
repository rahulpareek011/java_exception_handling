package excep_hand;

public class Excep_class_1 {

	public static void main(String[] args) {
		int a =10,b=0;
		System.out.println("hello"); //source
		try {
		    int c = a/b;
		    System.out.println(c);
		} catch(ArithmeticException e) {
		    System.out.println(e);
		}
		System.out.println("Java"); //destination
	}

}
