//this class contains the methods to do various math-related tasks
//@author Ava Hodge
//@version 9-6-18
public class Calculate {
//returns the square of an integer
	public static int square(int a) {
		return a * a;
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
	public static boolean isDivisibleBy(int a, int b) {
		if (a % b <= 0) {
			return true; 
		}
		else {
			return false;
		}
	}
	public static double absValue(double a) {
		if (a < 0) {
			return a - (a * 2); 
		}
		else {
			return a;
		}
	}
	public static double max(double a, double b) {
		if (a > b) {
			return a;
		}
		else {
			return b;
		}
	}
	
	public static double max(double a, double b, double c) {
		if (a > b) {
			if (a > c) {
				return a;
			}
		}
		else if (b > a) {
			if (b > c) {
				return b;
			}
		}
		else if (c > a) {
			if (c > b) {
				return c;
			}
		}
		return a;
	}
	
	public static int min(int a, int b) {
		if (a < b) {
			return a;
		}
		else {
			return b;
		}
	}
	public static double round2(double a) {
		double b = a * 100;
		double c = b + 0.5;
		int cTwo = (int)c;
		return (double)cTwo / 100;
		
		}	

	public static double exponent(double a, int b) {
		if(b < 0) {
			throw new IllegalArgumentException("Cannot find the solution to " + a + " to the power of " + b);
		}
		double c = 1;
		double d = a;
		for(int i = 1; i < b; i++) {
			c = a * d;
			a = c;
		}
		return c;
	}
	
	public static int factorial(int a) {
		if(a < 0) {
			throw new IllegalArgumentException("Cannot find the factorial of a negative number");
		}
		int b = 1;
		int c = 1;
		for(int i = 1; i <= a; i++) {
			c = b * i;
			b = c;
		}
		return c;
	}

	public static boolean isPrime(int a) {
		boolean primeOrNot = false;
		int i = a;
		while(primeOrNot = false && i > 0) {
			if(isDivisibleBy(a, i) == true) {
				i--;
			}
			else {
				primeOrNot = true;
			}
		}
		return primeOrNot;
	}
	
	public static int gcf(int a, int b) {
		int c = 0;
		for(int i = 1; i < max(a, b); i++) {
			if(a % i == 0 && b % i == 0) {
				c = i;
				}
			}
		return c;
		}
	public static double sqrt(double a) {
		if(a < 0) {
			throw new IllegalArgumentException("Cannot find the square root of a negative number");
		}
		double b = 0;
		for(double i = 0; i * i <= a; i += .005) {
			b = i;
		}
		double c = ( (0.5) * ((a / b) + b));
		return round2(c);
	}
	public static String quadForm(int a, int b, int c) {
		double d = discriminant(a, b, c);
		if(d < 0) {
			return "no real roots";
		}
		else {
		double e = ((-1 * b) + (sqrt(d))) / (2 * a);
		double f = ((-1 * b) - (sqrt(d))) / (2 * a);
		if(d > 0) {
			return String.valueOf(round2(e)) + " and " + String.valueOf(round2(f));
		}
		else {
			return String.valueOf(round2(e));
		}
	}
	}
}