package ejb.entitites.ecommerce;

import ejb.entities.commande.Commande;
import ejb.entitites.banque.CompteBancaire;
import ejb.entitites.ecommerce.Client;
import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.Collection;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Compte_ecommerce
 *
 */
@Entity

public class CompteEcommerce implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id_client_ecommerce;
	@OneToOne(cascade = CascadeType.ALL)
	private Client client_ecommerce;
	private String pseudo_client;
	private String mot_de_passe_client;
	private boolean admin;
	@OneToMany(cascade=CascadeType.ALL)
	private Collection<Commande> commandesClient;
	
	private static final long serialVersionUID = 1L;


	public CompteEcommerce() {
		super();
	}   

	public CompteEcommerce(Client clientEcommerce,CompteBancaire compteBancaireClient, String pseudoClient, String mdp, boolean isAdmin){
		super();
		this.client_ecommerce=clientEcommerce;
		this.pseudo_client=pseudoClient;
		this.mot_de_passe_client=mdp;
		this.admin=isAdmin;
		
	}
	
	public Long getId_client_ecommerce() {
		return this.id_client_ecommerce;
	}

	public void setId_client_ecommerce(Long id_client_ecommerce) {
		this.id_client_ecommerce = id_client_ecommerce;
	}   
	public Client getClient_ecommerce() {
		return this.client_ecommerce;
	}

	public void setClient_ecommerce(Client client_ecommerce) {
		this.client_ecommerce = client_ecommerce;
	}   
  
	public String getPseudo_client() {
		return this.pseudo_client;
	}

	public void setPseudo_client(String pseudo_client) {
		this.pseudo_client = pseudo_client;
	}   
	public String getMot_de_passe_client() {
		return this.mot_de_passe_client;
	}

	public void setMot_de_passe_client(String mot_de_passe_client) {
		this.mot_de_passe_client = mot_de_passe_client;
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public Collection<Commande> getCommandesClient() {
		return commandesClient;
	}

	public void setCommandesClient(Collection<Commande> commandesClient) {
		this.commandesClient = commandesClient;
	}

	
	@Override
	public String toString() {
		return "CompteEcommerce [id_client_ecommerce=" + id_client_ecommerce + ", client_ecommerce=" + client_ecommerce
				+ ", pseudo_client=" + pseudo_client + ", mot_de_passe_client=" + mot_de_passe_client + ", admin="
				+ admin + ", commandesClient=" + commandesClient + "]";
	}

	
   
	
}
