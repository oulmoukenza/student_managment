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
					MenuEtudiant();
					break;
				case 2 : 
					System.out.println("Admin");
					MenuAdmin();
					break;
				case 3 : 
					System.out.println("Bye !");
					logIn =false;
					break;
			}

		}
		
		

		
	}

	private static void MenuAdmin() {
		// TODO Auto-generated method stub
		System.out.println("Welcome To Admin Dashboard");
		Scanner scan_2 = new Scanner(System.in);
		System.out.println("1- List All students : ");
		System.out.println("2- Add New student : ");
		System.out.println("3- Update student informations: ");
		System.out.println("4- Delete students : ");
		System.out.println("5 - Menu Principal ");
		int ChoixMenuAdmin = scan_2.nextInt();
		switch(ChoixMenuAdmin) {
		case 1 : 
			System.out.println("All Students Informations");
			MenuAdmin();
			break;
		case 2 :
			System.out.println("Add New Student");
			MenuAdmin();
			break;
		case 3 : 
			System.out.println("Update Student Information");
			MenuAdmin();
			break;
		case 4 : 
			System.out.println("Delete Student");
			MenuAdmin();
			break;
		case 5 : 
			System.out.println("Delete Student");
			break;
		default:
	        System.out.println("Choix incorrect");
	        MenuAdmin();
	        break;
		}
	}
	private static void MenuEtudiant() {
		// TODO Auto-generated method stub
		System.out.println("Welcome To Student Dashboard");
		Scanner scan_1 = new Scanner(System.in);
		System.out.println("1- Display Information : ");
		System.out.println("2- Exit : ");
		int ChoixMenuEtudiant = scan_1.nextInt();
		switch(ChoixMenuEtudiant) {
		case 1 : 
			System.out.println("Informations");
			MenuEtudiant();
			break;
		case 2 :
			System.out.println("Redirect Menu Principal ");
			break;
		default:
	        System.out.println("Choix incorrect");
	        MenuEtudiant();
	        break;
		}
		
		
	}

}
