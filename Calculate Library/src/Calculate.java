//this class contains the methods to do various math-related tasks
//@author Ava Hodge
//@version 9-6-18
public class Calculate {
//returns the square of an integer
	public static int square(int number) {
		return number * number;
	}
	public static int cube(int number) {
		return number * number * number;
	}
	
	public static double average(double a, double b) {
		return (a + b) / 2;
	}
	
	public static double average(double a, double b, double c) {
		return (a + b + c) / 3;
	}
	
	public static double toDegrees(double a) {
		return (a * 180) / 3.14159;
	}
	
	public static double toRadians(double a) {
		return (a * 3.14159) / 180;
	}
	
	public static double discriminant (double a, double b, double c) {
		return (b * b) - (4 * (a * c));
	}
	
	public static String toImproperFrac (int a, int b, int c) {
		int number = ((a * c) + b);
		String str1 = String.valueOf(number);
		String str2 = String.valueOf(c);
		return str1 + "/" + str2;
	}
	
	public static String toMixedNum(int a, int b) {
		int number = (a / b);
		int number2 = (a % b);
		String str1 = String.valueOf(number);
		String str2 = String.valueOf(number2);
		return str1 + "_" + str2 + "/" + b;
	}
	public static String foil(int a, int b, int c, int d, String e) {
		int number = a * c;
		int number2 = b * c;
		int number3 = d * b;
		int number4 = d * a;
		int number5 = number2 + number4;
		String str1 = String.valueOf(number);
		String str2 = String.valueOf(number5);
		String str3 = String.valueOf(number3);
		return str1 + e + "^" + 2 + " + " + str2 + e + " + " + str3;
	}
}