package co.docapost.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Utilitaire {

	
	public static PreparedStatement InitRequetePreparee(Connection connexion, String sql,boolean returnGeneratedKeys, Object... objets) throws SQLException{
		PreparedStatement preparedStatement = connexion.prepareStatement(sql, returnGeneratedKeys ? Statement.RETURN_GENERATED_KEYS : Statement.NO_GENERATED_KEYS);
		for(int i = 0; i<objets.length; i++) {
			preparedStatement.setObject(i+1, objets[i]);
		}
		return preparedStatement;		
		
	}
	
	public static void fermetureSilencieuse(ResultSet resultSet) {
		if(resultSet != null) {
			try {
				resultSet.close();
			}catch(SQLException e) {
				System.out.println("echec fermeture resultset " + e.getMessage());
			}
		}
	}
	
	public static void fermetureSilencieuse(Statement statement) {
		if(statement != null) {
			try {
				statement.close();
			}catch(SQLException e) {
				System.out.println("echec fermeture resultset " + e.getMessage());
			}
		}
	}
	
	public static void fermetureSilencieuse(Connection connexion) {
		if(connexion != null) {
			try {
				connexion.close();
			}catch(SQLException e) {
				System.out.println("echec fermeture connexion " + e.getMessage());
			}
		}
	}
	
	public static void fermetureSilencieuses(Connection connexion, Statement statement) {
		fermetureSilencieuse(statement);
		fermetureSilencieuse(connexion);
	}
	
	public static void fermetureSilencieuses(Connection connexion, Statement statement, ResultSet resultset) {
		fermetureSilencieuse(resultset);
		fermetureSilencieuse(statement);
		fermetureSilencieuse(connexion);
	}
}
