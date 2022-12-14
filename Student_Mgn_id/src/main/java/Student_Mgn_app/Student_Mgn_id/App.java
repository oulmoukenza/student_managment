package Student_Mgn_app.Student_Mgn_id;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import java.util.concurrent.TimeUnit;


public class App {
		
		// method insert 
		//method update
		// display (id)
		// delete (id)
		//modification (id)
		
		
		public static void main (String[] args) {
			String url = "jdbc:mysql://localhost:3306/management?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
			String admin = "root";
			String passwd = "root";
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
				System.out.println("\n");
				
				System.out.println("All Students Informations");
				
				System.out.println("\n");
				displayListStudents();
				MenuAdmin();
				break;
			case 2 :			
				System.out.println("Add New Student");
				InsertInformationStudent();
				MenuAdmin();
				break;
			case 3 : 
				System.out.println("\n");
				
				System.out.println("Update Student Information");
				ModifInformationStudent();
				break;
			case 4 : 
				System.out.println("\n");
				
				System.out.println("Delete Student");
				deleteStudents();
				break;
			case 5 : 
				System.out.println("\n");
				
				System.out.println("Redirect Menu Principal");
				break;
			default:
				System.out.println("\n");
				
		        System.out.println("Choix incorrect");
		        MenuAdmin();
		        break;
			}
		}
		
		
		
		
		
		private static void displayListStudents() {
			String url = "jdbc:mysql://localhost:3306/management?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				@SuppressWarnings("unused")
				Connection connection = DriverManager.getConnection(url, "root","root");
				// ResultSet
				Statement sql = connection.createStatement();
				ResultSet result = sql.executeQuery("Select * from Etudiant");
				
				while (result.next()) {
					System.out.println("Student ID : " + result.getInt("Student_ID") + " Nom Etudiant : " + result.getString("nom_etudiant")
					+ "Prenom Etudiant  : " + result.getString("prenom_etudiant") + " Niveau d'??tudes  : " + result.getString("niveau_etude_Etudiant")+
					" Email Etudiant : " + result.getString("email_etudiant")
							);
				}
				
				// TimeUnit.SECONDS.sleep(10);
				System.out.println("\n");
				
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
		
		
		
		
		
		
		
		@SuppressWarnings("unused")
		private static void InsertInformationStudent() {
			// TODO Auto-generated method stub
			 Scanner scan = new Scanner(System.in);
			 	System.out.println("new student");
			    System.out.println("id:");
			    String id = scan.next();
			    System.out.println("nom:");
			    String nom = scan.next();
			    System.out.println("prenom:");
			    String prenom = scan.next();
			    System.out.println("email:");
			    String email = scan.next();
			    System.out.println("level (b1/b2/b3/m1/m2):");
			    String level = scan.next();
			    String url = "jdbc:mysql://localhost:3306/management?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				@SuppressWarnings("unused")
				Connection connection = DriverManager.getConnection(url, "root","root");
				// ResultSet
				Statement sql = connection.createStatement();
				int result = sql.executeUpdate("INSERT INTO `Etudiant`(`Student_ID`, `nom_etudiant`, `prenom_etudiant`, `niveau_etude_Etudiant`, `email_etudiant`) VALUES('"+id+"','"+nom+"','"+prenom+"','"+level+"','"+email+"')");
				
				
				// TimeUnit.SECONDS.sleep(10);
				System.out.println("\n");
				
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
		
		@SuppressWarnings("unused")
		private static void ModifInformationStudent() {
			// TODO Auto-generated method stub
			
			
				Scanner scan = new Scanner(System.in);
				System.out.println("ID de l'etudiant a modifier:");
				String idModif = scan.next();
			    
			 Scanner scan_1 = new Scanner(System.in);
			 	System.out.println("new information");
			    System.out.println("id:");
			    String id = scan.next();
			    System.out.println("nom:");
			    String nom = scan.next();
			    System.out.println("prenom:");
			    String prenom = scan.next();
			    System.out.println("email:");
			    String email = scan.next();
			    System.out.println("level (b1/b2/b3/m1/m2):");
			    String level = scan.next();
			    String url = "jdbc:mysql://localhost:3306/management?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				@SuppressWarnings("unused")
				Connection connection = DriverManager.getConnection(url, "root","root");
				// ResultSet
				Statement sql = connection.createStatement();
				int result = sql.executeUpdate("UPDATE `Etudiant` SET `Student_ID`='"+id+"',`nom_etudiant`='"+nom+"',`prenom_etudiant`='"+prenom+"',`niveau_etude_Etudiant`='"+level+"',`email_etudiant`='"+email+"' WHERE Student_ID=" +idModif);
				
				// TimeUnit.SECONDS.sleep(10);
				System.out.println("\n");
				
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
		
		
		
		private static void deleteStudents() {
			// TODO Auto-generated method stub
			
			Scanner scan = new Scanner(System.in);
			System.out.println("ID de l'etudiant:");
			 String id = scan.next();
			    
			 System.out.println("Valider?");
				Scanner scan_1 = new Scanner(System.in);
				System.out.println("1- Yes: ");
				System.out.println("2- No : ");
				int choix = scan_1.nextInt();
				switch(choix) {
				case 1 : 
					
					 String url = "jdbc:mysql://localhost:3306/management?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
						
						try {
							Class.forName("com.mysql.cj.jdbc.Driver");
							@SuppressWarnings("unused")
							Connection connection = DriverManager.getConnection(url, "root","root");
							// ResultSet
							Statement sql = connection.createStatement();
							int result = sql.executeUpdate("DELETE FROM `Etudiant` WHERE Student_ID=" +id);
							
							
							// TimeUnit.SECONDS.sleep(10);
							System.out.println("\n");
							
						} catch (Exception e) {
							System.out.println(e);
						}
						System.out.println("eleve supprim??");
						MenuAdmin();
					
					break;
				case 2 :
					MenuAdmin();
					System.out.println("opperation stop ");
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
				displayStudents();
				System.out.println();
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




		private static void displayStudents() {
			// TODO Auto-generated method stub
			
			Scanner scan = new Scanner(System.in);
			System.out.println("mon ID:");
			    String id = scan.next();
			System.out.println();
			System.out.println("Students Informations");
			String url = "jdbc:mysql://localhost:3306/management?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				@SuppressWarnings("unused")
				Connection connection = DriverManager.getConnection(url, "root","root");
				// ResultSet
				Statement sql = connection.createStatement();
				ResultSet result = sql.executeQuery("Select * from Etudiant WHERE Student_ID="+id);
				
				while (result.next()) {
					System.out.println("Student ID : " + result.getInt("Student_ID") + " Nom Etudiant : " + result.getString("nom_etudiant")
					+ "Prenom Etudiant  : " + result.getString("prenom_etudiant") + " Niveau d'??tudes  : " + result.getString("niveau_etude_Etudiant")+
					" Email Etudiant : " + result.getString("email_etudiant")
							);
				}
				
				// TimeUnit.SECONDS.sleep(10);
				System.out.println("\n");
				
			} catch (Exception e) {
				System.out.println(e);
			}
			
			
		}

	}

