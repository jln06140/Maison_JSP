package co.simplon.hote.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.hote.DAO.ClientDao;
import co.simplon.hote.model.Client;
import co.simplon.hote.service.ServiceClient;


@Service
public class ServiceClientImpl implements ServiceClient{

	@Autowired
	private ClientDao clientDao;

	@Override
	public List<Client> getAllClients() throws Exception{
		return this.clientDao.getAllClients();
	}
	
	
	
	
}
