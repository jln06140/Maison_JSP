package co.docapost.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sun.corba.se.spi.protocol.InitialServerRequestDispatcher;

import co.docapost.beans.Client;

public class ClientDaoImpl implements ClientDao {
	private DAOFactory daoFactory;
	private static final String SQL_SELECT_PAR_EMAIL = "SELECT idclient, email, nom,prenom, telephone, departement, date_inscription FROM client WHERE email = ?";
	private static final String SQL_INSERT = "INSERT INTO Utilisateur (nom, prenom, telephone, email, departement , date_inscription) VALUES (?, ?, ?, ?, ?,NOW())";
	
	public ClientDaoImpl(DAOFactory daofactory) {
		this.daoFactory = daofactory;
	}

	@Override
	public void creer(Client client) throws DAOException,IllegalArgumentException {
		Connection connexion = null;
		PreparedStatement preparedStatement = null;
		ResultSet valeursAutoGenerees = null;
		
		try {
			connexion = daoFactory.getConnexion();
			preparedStatement = Utilitaire.InitRequetePreparee(connexion, SQL_INSERT, true, client.getNom(),client.getPrenom(), client.getTelephone(), client.getEmail(),client.getDepartement());
			int status = preparedStatement.executeUpdate();
			
			if(status == 0) {
				throw new DAOException("Echec creation client");
			}
			
			valeursAutoGenerees = preparedStatement.getGeneratedKeys();
			if(valeursAutoGenerees.next()) {
				client.setId(valeursAutoGenerees.getLong(1));
			}else {
				throw new DAOException("echec creation client en base, aucun id auto-genere");
			}
		}catch(SQLException e) {
			throw new DAOException(e);
		}finally {
			Utilitaire.fermetureSilencieuses(connexion, preparedStatement, valeursAutoGenerees);
		}
		
	}

	@Override
	public Client trouver(String email) throws DAOException {
		Connection connexion = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		Client client = null;
		
		
		try {
			connexion = daoFactory.getConnexion();
			preparedStatement = Utilitaire.InitRequetePreparee(connexion, SQL_SELECT_PAR_EMAIL, false, email);
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				client = map(resultSet);
			}
		}catch(SQLException e) {
			throw new DAOException(e);
		}finally {
			Utilitaire.fermetureSilencieuses(connexion, preparedStatement,resultSet);
		}
		return client;

	}
	
	public static Client map(ResultSet resultSet) throws SQLException{
		Client client = new Client();
		client.setId(resultSet.getLong("idclient"));
		client.setNom(resultSet.getString("nom"));
		client.setPrenom(resultSet.getString("prenom"));
		client.setEmail(resultSet.getString("email"));
		client.setMotDePasse(resultSet.getString("mot_de_passe"));
		client.setDepartement(resultSet.getString("departement"));
		
		return client;
		
	}

}
