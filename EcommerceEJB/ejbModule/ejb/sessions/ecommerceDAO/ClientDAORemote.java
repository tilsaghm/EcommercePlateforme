package ejb.sessions.ecommerceDAO;

import java.util.List;

import javax.ejb.Remote;

import ejb.entitites.banque.CompteBancaire;
import ejb.entitites.ecommerce.Client;

@Remote
public interface ClientDAORemote {

	public Client getClientId(Long id);
	public List<Client> getListClient();
	public List<Client> getClientNom(String nomClient);
	public List<Client> getClientPrenom(String prenomClient);
	public Client getClientEmail(String email);
	public Client getClientTel(String telephone);
	public CompteBancaire getCompteBancaireClient(Long idClient);
	
	
	//public Client setClientId(Long id);
	public Client setClientNom(Long id, String nomClient);
	public Client setClientPrenom(Long id, String prenomClient);
	public Client setClientEmail(Long id, String emailClient);
	public Client setClientTel(Long id, String telClient);
	//public Client setSoldBancaire(Long idClient, double montant);
	
	public Client addClient(Client client);

	
	public void removeAll();
	public void removeClient(Long idClient);
}
