import java.util.*;

public class Split {

 

 public static void main(String[] args) {

// Your task Part 0

//String.split();

//It's a method that acts on a string, <StringName>.split(<String sp>);

//Where sp is the string where the string splits

//And it returns an array

// Example: "I like apples!".split(" ");

//String arr0 = "I like apples!".split(" ");

	 String arr0 = "I like apples!";
	 System.out.println(Arrays.toString(arr0.split(" ")));

// it will split at spaces and return an array of ["I","like","apples!"]

// Example 2: "I really like really red apples"split("really")

	 String arr1 = "I really like really red apples!";
	 System.out.println(Arrays.toString(arr1.split("really")));
	 
// it will split at the word "really" and return an array of ["I "," like ","red apples!"]

//play around with String.split!

//What happens if you "I reallyreally likeapples".split("really") ?

	 String arr2 = "I reallyreally likeapples";
	 System.out.println(Arrays.toString(arr2.split("really")));
//Your task Part 1:

/*Write a method that take in a string like

* "applespineapplesbreadlettustomatobaconmayohambreadcheese"

* describing a sandwich.

* Use String.split to split up the sandwich by the word "bread" and return what's in the middle of

* the sandwich and ignores what's on the outside

* What if it's a fancy sandwich with multiple pieces of bread?

*/
	 
	/*Scanner scanner = new Scanner(System.in);
		System.out.println("What's in your sandwich?");
		String coolString = scanner.nextLine();
		System.out.println(Arrays.toString(coolString.split("bread")));

//Your task pt 2:

/*Write a method that take in a string like

* "apples pineapples bread lettus tomato bacon mayo ham bread cheese"

* describing a sandwich

* use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of

* the sandwich and ignores what's on the outside.

* Again, what if it's a fancy sandwich with multiple pieces of bread?

*/

		Scanner scanner2 = new Scanner(System.in);
			System.out.println("What's in your sandwich?");
			String anotherString = scanner2.nextLine();
			String[] aSandwich = anotherString.split(" ");
			//come back to put that foreach in boiiiiiiiiii
 		}
 
}


