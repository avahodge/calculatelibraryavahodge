//this class contains the methods to do various math-related tasks
//@author Ava Hodge
//@version 9-6-18
public class calculate {
//returns the square of an integer
	public static int square(int number) {
		return number * number;
	}
	public static int cube(int number) {
		return number * number * number;
	}
	public static double average(double a, double b) {
		return (a * b) / 2;
	}
	public static double toDegrees(double a) {
		return (a * 180) / 3.14159;
	}
	public static double toRadians(double a) {
		return (a * 3.14159) / 180;
	}
	public static double discriminant (double a, double b, double c) {
		return (a * a) - (4 * (a * c));
	}
	public static String toImproperFrac (int a, int b, int c) {
		int number = ((a * c) + b);
		String str1 = String.valueOf(number);
		String str2 = String.valueOf(c);
		return str1 + "/" + str2;
	}
}
