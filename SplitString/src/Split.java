/* splits up sandwiches and spits out the insides
 * @author Annabel Sun
 * @version November 2 2018
 */

import java.util.*;

public class Split {

	public static void main(String[] args) {
		boolean done = false;
		
		while (!done) {
			Scanner userInput = new Scanner(System.in);	
			userInput.useDelimiter("\\n");
			
			System.out.print("Are you splitting sandwiches by bread (part 1) or spaces (part 2)? Or, type 'done' when done. ");		
			String input = userInput.next();
			String splitBy = input.toLowerCase();
			
			if (splitBy.equals("done")) {
				done = true;
			} else {
				System.out.print("Insert the sandwich you would like to split. ");			
				String sandwich = userInput.next();
				
				if (splitBy.equals("bread")) {
					System.out.println(Arrays.toString(partOne(sandwich)));
					
				} else if (splitBy.equals("spaces")) {
					System.out.println(Arrays.toString(partTwo(sandwich)));
				
				} else {
					System.out.println("\nPlease type exactly 'bread', 'spaces', or 'done'. ");
				}
				
			}
		}
	}
	
	public static String[] partOne(String sandwich) {
		String[] splitSand = sandwich.split("bread"); //generate the array
		return(Arrays.copyOfRange(splitSand, 1, (splitSand.length-1))); //return the parts between first and last bread
	}
	
	public static String[] partTwo(String sandwich) {
		String[] splitSand = sandwich.split(" "); //splits by space
		int firstBread = 999999999;
		int lastBread = 0;
		for (int i = 0; i < splitSand.length; i++) {
			if (splitSand[i].equals("bread")) {
				if (i < firstBread) {
					firstBread = i;
				} else if (i > lastBread) {
					lastBread = i;
				}
			}
		}
		return(Arrays.copyOfRange(splitSand,  firstBread+1, lastBread));
	}
	
	
}