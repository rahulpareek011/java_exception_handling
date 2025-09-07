package excep_hand;

public class RuntimeDemo {

	public static void main(String[] args) {
		//ArithmeticException
		try {
			int a = 10/0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		
		//NullPointerException
		try {
			String a = null;
			a.length();
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		
		//ArrayIndexOutOfBoundsException
		try {
			int[] arr = {1,2,3};
			System.out.println(arr[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		//StringIndexOutOfBoundsException
		try {
			String s = "java";
			System.out.println(s.charAt(10));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		//NumberFormatException
		try {
			Integer.parseInt("abc");
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		
		//ClassCastException
		try {
			Object o = new Integer(5);
			String s = (String) o;
		} catch (ClassCastException e) {
			System.out.println(e);
		}
		

	}

}
