package tes;

import java.util.Scanner;

public class  College {

	public static void main(String[] args) {
		 Student s1 = new  Student ();
		
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter s2 id, name, age, and gpa: ");
		int ID2 = in.nextInt();
		String name2 = in.next();
		int age2 = in.nextInt();
		double gpa2 = in.nextDouble();
		String choice = "";
		 Student s2 = new  Student (ID2, name2, age2, gpa2);
		do {
			System.out.println("-----------------");
			System.out.println("Please choose from the following options:"); 
			System.out.println("1- Display s1 and s2 Information");
			System.out.println("2- Edit s1 Information");
			System.out.println("3- Compare s1 to s2");
			System.out.println("4- Compare s2 to s1");
			System.out.println("5- Exit");
			System.out.print("-----------------\n Enter your option:");
			choice = in.next();
			
			switch (choice) {
			
			case "1" :  
				s1.display();
				System.out.println("");
				s2.display();
				System.out.println("");
				break;
				
			case "2":
				System.out.print("Please enter s1 new id, name, age, and gpa:");
				int newId1 = in.nextInt();
				String newName1 = in.next();
				int newAge1 = in.nextInt();
				double newGpa1 = in.nextDouble();
				s1.setId(newId1);
				s1.setName(newName1);
				s1.setAge(newAge1);
				s1.setGpa(newGpa1);
				s1.display();
				System.out.println("");
				break;
			
			case "3":
				if (s1.getGpa() > s2.getGpa() ) 
					System.out.println("s1 GPA is greater than s2 gpa");
				else if (s1.getGpa() < s2.getGpa() )
					System.out.println("s1 GPA is less than s2 gpa");
				else if (s1.getGpa() == s2.getGpa())
					System.out.println("s1 GPA is equal s2 gpa");
				break;
				
			case "4":
				if (s2.getGpa() > s1.getGpa() ) 
					System.out.println("s2 GPA is greater than s1 gpa");
				else if (s2.getGpa() < s1.getGpa() )
					System.out.println("s2 GPA is less than s1 gpa");
				else if (s2.getGpa() == s1.getGpa())
					System.out.println("s2 GPA is equal s1 gpa");
				break;
			
			case "5":
				System.out.println("Thanks! Goodbye");
				break;
				
			default:
				System.out.println("Wrong input, try again!");
				
			}
		}while(!choice.equals("5") );
		
		
		
		
		
	}

}
