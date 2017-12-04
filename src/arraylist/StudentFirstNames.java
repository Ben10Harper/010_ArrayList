package arraylist;

import java.util.ArrayList;

import java.util.Scanner;

public class StudentFirstNames {
	
	static Scanner kbd = new Scanner(System.in);

	private ArrayList<String> a2Students = new ArrayList<String>();

	public StudentFirstNames() {
		
		a2Students.add("Zachary");
		a2Students.add("Kyle");
		a2Students.add("Michael");
		a2Students.add("Mitchell");
		
	}
	
	public void addName() {
		
		System.out.println("Please enter a name to add to the list:");
		String name = kbd.nextLine();
		if (a2Students.indexOf(name) < 0) {
			a2Students.add(name);
		} else {
			System.out.println("That name's already in the list!");
		}
		
	}
	
	public void deleteName() {
		
		System.out.println("Please enter a name to remove from the list:");
		String name = kbd.nextLine();
		if (a2Students.indexOf(name) < 0) {
			System.out.println("That name's not on the list!");
		} else {
			a2Students.remove(name);
		}
		
	}
	
	public void replaceName() {
		
		System.out.println("Please enter a name in the list to replace");
		String replaced = kbd.nextLine();
		System.out.println("Please enter a name to replace it with");
		String replacer = kbd.nextLine();
		if (a2Students.indexOf(replaced) < 0) {
			System.out.println("That name's not on the list!");
		} else if (a2Students.indexOf(replacer)>= 0) {
			System.out.println("That name's already on the list!");
		} else {
			a2Students.set(a2Students.indexOf(replaced), replacer);
		}
		
	}
	
	public void showContents() {
		
		System.out.println("Contains: " + a2Students);
		
	}
	
	public void showSize() {
		
		System.out.println("Number of student names is " + a2Students.size());
		
	}
	
	public void showEach() {
		
		for (int i=0; i<a2Students.size(); i++) {
			System.out.println(a2Students.get(i));
		}
		
	}
	
	public void searchFor() {
		
		System.out.println("What name do you want to search for?");
		String n = kbd.nextLine();
		if (a2Students.indexOf(n) < 0) {
			System.out.println("Sorry, that name's not on the list.");
		} else {
			System.out.println("That name is at position "+a2Students.indexOf(n));
		}
		
	}

	public ArrayList<String> getA2Students() {
		return a2Students;
	}

	public void setA2Students(ArrayList<String> a2Students) {
		this.a2Students = a2Students;
	}
	
}
