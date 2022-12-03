package Student_Mgn_app.Student_Mgn_id;

import java.util.*;

public class App {
	
	// method insert 
	//method update
	// display (id)
	// delete (id)
	//modification (id)

	public static void main (String[] args) {
		
		
		boolean logIn = true ; 
		
		while(logIn) {
			System.out.println("---------------Student Management System---------------");
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			System.out.println("Who Are You : ");
			System.out.println("1- Student : ");
			System.out.println("2- Adminstrator : ");
			System.out.println("3 - Exit ");
			int choice = scan.nextInt();
			
			switch(choice) {
				case 1 : 
					System.out.println("Student");
					break;
				case 2 : 
					System.out.println("Admin");
					break;
				case 3 : 
					System.out.println("Bye !");
					logIn =false;
					break;
			}

		}
		
		// case 1 Student
		/**
		 * 1- display information
		 
		 * 2 - Exit
		 * **/
		
		//case 2 Admin 
		/**
		 * 1- Add Record
		 * 2 - Update Record
		 * 3- display all Student / {id}
		 *  4- Delete Record {id}
		 *  5 - Logout
		 * **/

		
	}

}
