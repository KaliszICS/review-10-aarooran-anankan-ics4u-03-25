public class PracticeProblem {

	public static void main(String args[]) {

		System.out.println(pyramid(3));
		System.out.println(square(3));
		System.out.println(hasLowercase("Hi"));
	
	}

	public static String pyramid(int pmidtotal) { //1
		
		String pyra = "";
		int aster = 1; //the amount of astericks per pyramid level
		int pyralevel = 1; //the pyramid level
		int space = 1; //the amount of spaces before the first asterick
		
		for (int pmid = 1; pmid <= pmidtotal; pmid++) {

			space = pmidtotal - pyralevel; //the amount of spaces = num - pyramid level
			aster = pyralevel; //there are as many astericks as the pyramid level

			while (space > 0) { //spaces per level
				pyra = pyra + " ";
				space = space - 1;
			}

			while (aster > 0) { //astericks per level
				
				if (aster == 1) { //to get rid of space for final asterick

					pyra = pyra + "*";
					aster = aster - 1;
					
				}
				
				else {

				pyra = pyra + "* ";
				aster = aster - 1;

				}
			}

			pyralevel++; //increase pyramid level

			if (pmid < pmidtotal) {

				pyra = pyra + "\n"; //new line for next level

			}

		}

		return pyra;

	}

	public static String square(int num) { //2

		String squ = "";

		if (num == 1) {
			squ = "*";
		}
		else if (num > 1) {

			for (int i = num; i > 0; i = i - 1) { //top line
				squ = squ + "*";
			}
	
			squ = squ + "\n";
	
			for (int i = num - 2; i > 0; i = i - 1) { //spaces for within square
				squ = squ + "*";
				int space = num - 2;
	
				while (space > 0) {
					squ = squ + " ";
					space = space - 1;
				}
	
				squ = squ + "*";
				squ = squ + "\n";
			}
	
			for (int i = num; i > 0; i = i - 1) { //bottom line
				squ = squ + "*";
			}

		}
		else {
			squ = "";
		}

		return squ;

	}

	public static boolean hasLowercase(String word) {

		boolean lower = false;
		int index = 0;

		for (int i = (word.length() - 1); i >= 0; i = i - 1) {

			if (Character.isLowerCase(word.charAt(index)) == true) {

				lower = true;

			}

			index++;

		}

		return lower;

	}

}
