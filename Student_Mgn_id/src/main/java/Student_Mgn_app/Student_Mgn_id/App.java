package Student_Mgn_app.Student_Mgn_id;

public class App {
	
	// method insert 
	//method update
	// display (id)
	// delete (id)
	//modification (id)
	public static void main (String[] args) {
		Student std = new Student("Yassine","Essamadi","H");
		System.out.println("Nom :" + std.getNom());
		System.out.println("Prenom :" + std.getPrenom());
		System.out.println("Sexe :" + std.getSexe());
		
		
		
	}

}
