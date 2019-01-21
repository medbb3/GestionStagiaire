import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {
	static protected Connection cnx;
	static final private String username = "root";
	static final private String password = "";
	static final private String url = "jdbc:mysql://localhost/jdbcmaven?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException ex) {
			System.err.println("Impossible de charger le driver");
			ex.printStackTrace();
		}
	}

	static protected Connection getConnection() throws SQLException {
		cnx = DriverManager.getConnection(url, username, password);
		return cnx;
	}

}