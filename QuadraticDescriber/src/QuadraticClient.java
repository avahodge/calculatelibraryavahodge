import java.util.*;
public class QuadraticClient {
	public static void main(String[] args) {
		
	Scanner quadraticStuff = new Scanner(System.in);
	System.out.println("Please type in a value for coefficient a.");
	double a = quadraticStuff.nextDouble();
	System.out.println("Next, we need a value for b.");
	double b = quadraticStuff.nextDouble();
	System.out.println("And finally, we need a value for c.");
	double c = quadraticStuff.nextDouble();
	
	System.out.println("Description of the graph of:");
	System.out.println(Quadratic.quardrDescriber(a, b, c));
	System.out.println("Opens: " + Quadratic.opensWhichWay(a));
	System.out.println("Axis of Symmetry: " + Quadratic.axisOfSymmetry(a, b));
	System.out.println("Vertex: " + Quadratic.vertex(a, b, c));
	System.out.println("x-intercept(s): " + Quadratic.xInts(a, b, c));
	System.out.println("y-intercept: " + c);
	
	System.out.println("Would you like to try another function? Type \"quit\" to end.");
	while(!quadraticStuff.nextLine().equals("quit")) {
		System.out.println("Please type in a value for coefficient a.");
		double a2 = quadraticStuff.nextDouble();
		System.out.println("Next, we need a value for b.");
		double b2 = quadraticStuff.nextDouble();
		System.out.println("And finally, we need a value for c.");
		double c2 = quadraticStuff.nextDouble();
		System.out.println("Would you like to try another function? Type \"quit\" to end.");
	}
	}
}
