package Student_Mgn_app.Student_Mgn_id;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Connexion {
	
	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/management?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, "root","root");
			System.out.println("connected");
		} catch (Exception e) {
			e.printStackTrace();	
		}
	}

}