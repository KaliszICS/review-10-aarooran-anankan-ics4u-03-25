public class PracticeProblem {

	public static void main(String args[]) {

		System.out.print(pyramid(5));
	
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
}
