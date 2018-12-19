
public class Quadratic {
	public static String quardrDescriber(double a, double b, double c) {
		String equation = "y = " + a + " x^2 " + " + " + b + " x " + " + " + c;
		return equation;
	}
	public static String opensWhichWay(double a) {
	if(a < 0) {
		return "Down";
	}
	else if(a > 0) {
		return "Up";
	}
	else {
		return "Not a parabola";
		}
	}
	public static String axisOfSymmetry(double a, double b) {
		double d = (b * -1) / (a * 2);
		if(d == -0.0) {
			return "0.0";
		}
		else {
		return String.valueOf(d);
		}
	}
	public static String vertex(double a, double b, double c) {
		double d = (b * -1) / (a * 2);
	double e = (a * (d * d)) + (b * d) + c;
	if(d == -0.0) {
		return "(0.0, " + e + ")";
	}
	return "(" + d + ", " + e + ")";
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
	public static double round2(double a) {
		double b = a * 100;
		double c = b + 0.5;
		int cTwo = (int)c;
		return (double)cTwo / 100;
		}	
	public static String xInts(double a, double b, double c) {
			double d = (b * b) - (4 * (a * c));
			if(d < 0) {
				return "no x-intercepts";
			}
			else {
			double f = ((-1 * b) + (sqrt(d))) / (2 * a);
			double g = ((-1 * b) - (sqrt(d))) / (2 * a);
			if(d > 0) {
				return String.valueOf(round2(f)) + " and " + String.valueOf(round2(g));
			}
			else {
				return String.valueOf(round2(f));
			}
		}
	}
}
