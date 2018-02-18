package co.simplon.hote.DAO.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import co.simplon.hote.DAO.ClientDao;
import co.simplon.hote.model.Client;


@Repository
public class ClientDAOImpl implements ClientDao{

	
	private DataSource datasource;
	
	
	@Autowired
	public ClientDAOImpl(JdbcTemplate jdbcTemplate) {
		datasource = jdbcTemplate.getDataSource();
	}
	
	@Override
	public List<Client> getAllClients() throws Exception {
		Client client = new Client();
		PreparedStatement pstmt = null;
		ResultSet rs;
		String sql = "SELECT * FROM client";
		ArrayList<Client>listeClients = new ArrayList<>();
		
		try {
			pstmt = this.datasource.getConnection().prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				client.setNom(rs.getString("nom"));
				client.setPrenom(rs.getString("prenom"));
				client.setTelephone(rs.getString("telephone"));
//				client.setAdresse(rs.getString("adresse"));
				client.setDepartement(rs.getString("departement"));
				client.setEmail(rs.getString("email"));
				listeClients.add(client);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			pstmt.close();
		}
		
		return listeClients;
	}

	@Override
	public Client getClient(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client insertClient(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client updateClient(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteClient(int id) {
		// TODO Auto-generated method stub
		
	}
	

}
