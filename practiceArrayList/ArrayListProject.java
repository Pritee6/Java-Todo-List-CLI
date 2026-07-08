package practiceArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListProject {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> tasks = new ArrayList<String>();
		
		boolean isTrue = true;
		
		while(isTrue) {
			System.out.println("------Menu------");
			System.out.println("1) Add Task");
			System.out.println("2) View Task");
			System.out.println("3) Remove Task");
			System.out.println("4) Exit");
			
			System.out.print("Select option: ");
			
			if (!sc.hasNextInt()) {
		        System.out.println("Please enter a valid choice.");
		        sc.nextLine(); // Clear the invalid input from the buffer
		        continue;      // Skip the rest of the loop and show the menu again
		    }
			
			int choice =  sc.nextInt();
			sc.nextLine();//if you don't add this it will not let you enter the tasks. It'll consume the newline character.
						
			switch(choice) {
				
			case 1:
				System.out.println("Enter Task: ");
				String task = sc.nextLine();
				tasks.add(task);
				System.out.println("Task successfully added");
				break;
				
			case 2:
				if(tasks.size()==0) {
					System.out.println("Your list is empty");
				}else {
					System.out.println("***Your Tasks***");
					for(int i=0;i<tasks.size();i++) {
						System.out.println(tasks.get(i));
					}	
				}
				break;
				
			case 3:
				System.out.println("Which task you want to delete?");
				int index = sc.nextInt();
				index = index-1;
				if(index<0 || index>tasks.size()) {
					System.out.println("Invalid input. Please enter correct choice");
				}else {				
					tasks.remove(index);
					System.out.println("Task is deleted");
					
				}
				break;
				
			case 4:
				isTrue = false;
				System.out.println("Good Bye!");
				break;
				
			default:
				System.out.println("Invalid input");
			}
		}
	}

}
