package arraylist;

public class MainInside {

	public static void main(String[] args) {

		gradingRequirements();
		
		StudentFirstNames a2 = new StudentFirstNames();
		a2.showSize();
		a2.showContents();
		a2.showEach();
		a2.searchFor();
		a2.addName();
		a2.showContents();
		a2.deleteName();
		a2.showContents();
		a2.replaceName();
		a2.showContents();

	}

	private static void gradingRequirements() {
	
		System.out.println(
			"GRADING REQUIREMENTS:\n"+
			"1. All JOP and jar'd\n"+
			"2. First isma menu asking for desired option -- looped\n"+
			"3. Menu: Show Names, Add Name, Remove Name, Replace Name, Exit\n\n"
		);
		
	}

}

/*
 * 1. Add this functionality -- Ask for a name, add that name to ArrayList
 * 1a. test -- after each name, show size and contents 
 */
