package ejb.sessions.ecommerceDAO;

import java.util.Iterator;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ejb.entitites.banque.CompteBancaire;
import ejb.entitites.ecommerce.Client;

/**
 * Session Bean implementation class ClientDAO
 */
@Stateless(name="ClientDAO")
@LocalBean
public class ClientDAO implements ClientDAORemote, ClientDAOLocal {

	
	@PersistenceContext
	private EntityManager em;
	
    public ClientDAO() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Client getClientId(Long id) {
		Client fetchedClient = em.find(Client.class, id);
		if (fetchedClient==null) throw new RuntimeException("Client introuvable");
		return fetchedClient;
		
	}

	@Override
	public List<Client> getListClient() {
		Query req=em.createQuery("select c from Client c");
		return req.getResultList();
	}

	@Override
	public List<Client> getClientNom(String nomClient) {
		Query req=em.createQuery("select c from Client c where c.nom_client="+nomClient);
		return req.getResultList();
	}

	@Override
	public List<Client> getClientPrenom(String prenomClient) {
		Query req=em.createQuery("select c from Client c where c.prenom_client="+prenomClient);
		return req.getResultList();
	}

	@Override
	public Client getClientEmail(String email) {
		Query req=em.createQuery("select c from Client c where c.email_client="+email);
		return (Client) req.getSingleResult();
	}

	@Override
	public Client getClientTel(String telephone) {
		Query req=em.createQuery("select c from Client c where c.tel_client="+telephone);
		return (Client) req.getSingleResult();
	}

	@Override
	public CompteBancaire getCompteBancaireClient(Long idClient) {
		// TODO 
		return null;
	}

	/*
	@Override
	public Client setClientId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	 */
	
	@Override
	public Client setClientNom(Long id, String nomClient) {
		Client fetchedClient=em.find(Client.class, id);
		fetchedClient.setNom_client(nomClient);
		em.persist(fetchedClient);
		return fetchedClient;
	}

	@Override
	public Client setClientPrenom(Long id, String prenomClient) {
		Client fetchedClient=em.find(Client.class, id);
		fetchedClient.setPrenom_client(prenomClient);
		em.persist(fetchedClient);
		return fetchedClient;
	}

	@Override
	public Client setClientEmail(Long id, String emailClient) {
		Client fetchedClient=em.find(Client.class, id);
		fetchedClient.setEmail_client(emailClient);
		em.persist(fetchedClient);
		return fetchedClient;
	}

	@Override
	public Client setClientTel(Long id, String telClient) {
		Client fetchedClient=em.find(Client.class, id);
		fetchedClient.setTel_client(telClient);
		em.persist(fetchedClient);
		return fetchedClient;
	}

	@Override
	public Client addClient(Client client) {
		em.persist(client);
		return client;
	}

	@Override
	public void removeAll() {
		for (Iterator<Client> it= getListClient().iterator(); it.hasNext();){
			Client client= it.next();
			em.remove(client);
		}
	}

	@Override
	public void removeClient(Long idClient) {
		em.remove(getClientId(idClient));
	}

}
