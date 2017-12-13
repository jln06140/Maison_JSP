package co.docapost.dao;

import co.docapost.beans.Client;

public interface ClientDao {
	
	void creer(Client client) throws DAOException;
	Client trouver(String email) throws DAOException;
}
