package co.docapost.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.eclipse.jdt.internal.compiler.lookup.PolymorphicMethodBinding;

public class DAOFactory {
	
	private static final String FICHIER_PROPERTIES	="/WEB-INF/dao.properties";
	private static final String PROPERTY_URL		="url";
	private static final String PROPERTY_DRIVER		="driver";
	private static final String PROPERTY_NOM_USER	="nomutilisateur";
	private static final String PROPERTY_MDP		="motdepasse";	
	
	private String 	url;
	private String	username;
	private String	password;
	
	
	public DAOFactory(String url, String user, String pass) {
		this.url = url;
		this.username = user;
		this.password = pass;		
	}
	
	public static DAOFactory getInstance() throws DAOConfigurationException{
		Properties properties = new Properties();
		String url;
		String driver;
		String nomUtilisateur;
		String motDePasse;
		
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		InputStream fichierProperties = classloader.getResourceAsStream(FICHIER_PROPERTIES);
		
		if(fichierProperties == null) {
			throw new DAOConfigurationException("Fichier properties " + FICHIER_PROPERTIES + " introuvable");
		}
		
		try {
			properties.load(fichierProperties);
			url = properties.getProperty(PROPERTY_URL);
			driver = properties.getProperty(PROPERTY_DRIVER);
			nomUtilisateur = properties.getProperty(PROPERTY_NOM_USER);
			motDePasse = properties.getProperty(PROPERTY_MDP);
		}catch(IOException e) {
			throw new DAOConfigurationException("impossible de charger fichier properties",e);
		}
		
		
		try {
			Class.forName(driver);
		}catch(ClassNotFoundException e) {
			throw new DAOConfigurationException("driver introuvable dans classpath",e);
		}
		
		
		DAOFactory instance = new DAOFactory(url,nomUtilisateur,motDePasse);
		return instance;

	}
	
	
	public Connection getConnexion() throws SQLException{
		return DriverManager.getConnection(url, username, password);
	}
	
	public ClientDao getUtilisateurDao() {
		return new ClientDaoImpl(this);
	}
}
