package co.simplon.hote.DAO;

import java.util.List;

import co.simplon.hote.model.Client;

public interface ClientDao {

	public List<Client> getAllClients() throws Exception;
	public Client getClient(int id);
	public Client insertClient(Client client);
	public Client updateClient(Client client);
	public void deleteClient(int id);
	
}
