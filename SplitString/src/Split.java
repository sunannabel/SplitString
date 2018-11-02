/* splits up sandwiches and spits out the insides
 * @author Annabel Sun
 * @version November 2 2018
 */

import java.util.Arrays;

public class Split {

	public static void main(String[] args) {
		
	System.out.println(Arrays.toString(partOne("applesbreadpineapplesbreadlettucetomatobaconmayohambreadcheesebread")));
	System.out.println(Arrays.toString(partTwo("apples pineapples bread lettuce bread tomato bacon bread mayo bread ham bread cheese")));
	}
 
	
	public static String[] partOne(String sandwich) {
		String[] splitSand = sandwich.split("bread"); //generate the array
		return(Arrays.copyOfRange(splitSand, 1, splitSand.length)); //return the parts between first and last bread
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