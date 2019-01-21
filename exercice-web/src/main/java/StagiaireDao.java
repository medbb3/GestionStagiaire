import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StagiaireDao extends Dao {

	static public Stagiaire insert(Stagiaire stg) {

		try (Connection cnx = getConnection()) {
			String sql = "INSERT INTO stagiaire(login, mdp, age)";
			sql += "VALUES('" + stg.getLogin() + "','" + stg.getMdp() + "','" + stg.getAge() + "')";
			Statement stmt = cnx.createStatement();
			stmt.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
			ResultSet rsCles = stmt.getGeneratedKeys();
			if (rsCles.next()) {
				int cle = rsCles.getInt(1);
				stg.setId(cle);
				// update(stg);
			}
			String sql = "SELECT DISTINCT * FROM table t1 WHERE EXISTS ( SELECT *FROM table t2  WHERE t1.ID <> t2.ID AND   t1.champ1 = t2.champ1 AND   t1.champ2 = t2.champ2 AND   t1.champ3 = t2.champ3 )";
		} catch (SQLException ex) {
			System.err.println("Problème SQL");
			ex.printStackTrace();
		}
		return stg;

	}

	static public void delete(String l) {
		try (Connection cnx = getConnection()) {
			PreparedStatement myStatement = cnx.prepareStatement("DELETE FROM stagiaire WHERE login = ?");
			myStatement.setString(1, l);
			myStatement.executeUpdate();
		} catch (SQLException ex) {
			System.err.println("Echec de connexion");
			ex.printStackTrace();
		}

	}

	static public String get(String l) {
		String str = null;
		try (Connection cnx = getConnection()) {
			String sql = "SELECT * from stagiaire WHERE login = ?";
			PreparedStatement stmt = cnx.prepareStatement(sql);
			stmt.setString(1, l);
			try (ResultSet myResultSet = stmt.executeQuery()) {
				if (myResultSet.next()) {
					int id = myResultSet.getInt("id");
					String login = myResultSet.getString("login");
					String mdp = myResultSet.getString("mdp");
					int age = myResultSet.getInt("age");
					str = "" + id + " " + login + " " + mdp + " " + age + " ";
				}
			} catch (SQLException ex) {
				System.err.println("Echec de la requ�te");
				ex.printStackTrace();
			}
		} catch (SQLException ex) {
			System.err.println("Echec de connexion");
			ex.printStackTrace();
		}
		return str;
	}

	static public String read() {
		// ArrayList<String> requetes = new ArrayList<>();
		StringBuilder str = new StringBuilder();
		try (Connection cnx = getConnection()) {
			String sql = "SELECT * from stagiaire";
			PreparedStatement stmt = cnx.prepareStatement(sql);
			try (ResultSet myResultSet = stmt.executeQuery()) {
				while (myResultSet.next()) {
					int id = myResultSet.getInt("id");
					String login = myResultSet.getString("login");
					String mdp = myResultSet.getString("mdp");
					int age = myResultSet.getInt("age");

					str.append(id).append(" " + login).append(" " + mdp).append(" " + age).append("\n");

				}
			} catch (SQLException ex) {
				System.err.println("Echec de la requête");
				ex.printStackTrace();
			}
		} catch (SQLException ex) {
			System.err.println("Echec de connexion");
			ex.printStackTrace();
		}

		return str.toString();

	}
}
