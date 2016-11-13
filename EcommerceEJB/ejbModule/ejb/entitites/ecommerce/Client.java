package ejb.entitites.ecommerce;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.*;

import ejb.entitites.banque.CompteBancaire;

/**
 * Entity implementation class for Entity: Client
 *
 */
@Entity

public class Client implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id_client;
	private String nom_client;
	private String prenom_client;
	private String email_client;
	private String tel_client;   

	@OneToOne(cascade = CascadeType.ALL)
	private CompteBancaire compteBancaireClient;
	
	private static final long serialVersionUID = 1L;
	
	
	
	public Client(){
		super();
	}

	
	public Client(String nomClient,String prenomClient, String emailClient, String telClient ){
		super();
		this.nom_client=nomClient;
		this.prenom_client=prenomClient;
		this.email_client=emailClient;
		this.tel_client=telClient;
	}
	public Client(String nomClient,String prenomClient, String emailClient, String telClient, CompteBancaire compteBancaireClient ){
		super();
		this.nom_client=nomClient;
		this.prenom_client=prenomClient;
		this.email_client=emailClient;
		this.tel_client=telClient;
		this.compteBancaireClient=compteBancaireClient;
	}
	
	
	public String getNom_client() {
		return this.nom_client;
	}

	public void setNom_client(String nom_client) {
		this.nom_client = nom_client;
	}   
	public String getPrenom_client() {
		return this.prenom_client;
	}

	public void setPrenom_client(String prenom_client) {
		this.prenom_client = prenom_client;
	}   
	public String getEmail_client() {
		return this.email_client;
	}

	public void setEmail_client(String email_client) {
		this.email_client = email_client;
	}   
	public String getTel_client() {
		return this.tel_client;
	}

	public void setTel_client(String tel_client) {
		this.tel_client = tel_client;
	}   
	public Long getId_client() {
		return this.id_client;
	}

	public void setId_client(Long id_client) {
		this.id_client = id_client;
	}


	public void setCompteBancaireClient(CompteBancaire compteBancaireClient2) {
		this.compteBancaireClient=compteBancaireClient2;
	}
	
	public CompteBancaire getCompteBancaireClient() {
		return compteBancaireClient;
	}
	
	@Override
	public String toString() {
		return "Client [id_client=" + id_client + ", nom_client=" + nom_client + ", prenom_client=" + prenom_client
				+ ", email_client=" + email_client + ", tel_client=" + tel_client + ", compteBancaireClient="
				+ compteBancaireClient + "]";
	}
}
