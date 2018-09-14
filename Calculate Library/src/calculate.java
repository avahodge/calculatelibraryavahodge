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
	public static double average(double numberone, double numbertwo) {
		return (numberone + numbertwo) / 2;
	}
	public static double average(double numberone, double numbertwo, double numberthree) {
		return (numberone + numbertwo + numberthree) / 3;	
		}
	public static double toDegrees(double numberone) {
		return (numberone / 3.14159) * 180;
	}
	public static double discriminant(double a, double b, double c) {
		return (b * b) - (4 * (a * c));
	}
	public static int toImproperFrac (int number1, int number2, int number3) {
		return (number1 * number3) + number2;
		return "/" + number3;
	}
	public static int toMixedNum(int number1, int number2) {
		return number1 / number2;
		return " " + (number1 % number2);
		return "/" + number2;
	}
	
}
