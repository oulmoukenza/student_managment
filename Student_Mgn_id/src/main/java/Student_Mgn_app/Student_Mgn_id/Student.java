package Student_Mgn_app.Student_Mgn_id;

public class Student {

	private int id;
	private String nom;
	private String prenom;
	private String sexe;

	public Student(String nom,String prenom,String sexe) {
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setSexe(sexe);
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	

	

}