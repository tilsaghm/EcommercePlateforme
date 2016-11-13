package ejb.entitites.banque;

import java.io.Serializable;
import java.lang.Double;
import java.lang.Long;
import javax.persistence.*;

import ejb.entitites.ecommerce.Client;

/**
 * Entity implementation class for Entity: Compte_bancaire
 *
 */
@Entity

public class CompteBancaire implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id_compte_bancaire;
	@OneToOne(cascade = CascadeType.ALL)
	private Client client_associe;
	private Long numero_de_cb;
	private Double solde_compte;
	private static final long serialVersionUID = 1L;

	public CompteBancaire() {
		super();
	}

	public CompteBancaire(Client clientPlateforme, long carteBancaire, double soldeInitial) {
		super();
		this.client_associe=clientPlateforme;
		this.numero_de_cb=carteBancaire;
		this.solde_compte=soldeInitial;
	}
	public Long getId_compte_bancaire() {
		return this.id_compte_bancaire;
	}

	public void setId_compte_bancaire(Long id_compte_bancaire) {
		this.id_compte_bancaire = id_compte_bancaire;
	}   
	public Client getClient_associe() {
		return this.client_associe;
	}

	public void setClient_associe(Client client_associe) {
		this.client_associe = client_associe;
	}   
	public Long getNumero_de_cb() {
		return this.numero_de_cb;
	}

	public void setNumero_de_cb(Long numero_de_cb) {
		this.numero_de_cb = numero_de_cb;
	}   
	public Double getSolde_compte() {
		return this.solde_compte;
	}

	public void setSolde_compte(Double solde_compte) {
		this.solde_compte = solde_compte;
	}

	@Override
	public String toString() {
		return "CompteBancaire [id_compte_bancaire=" + id_compte_bancaire + ", client_associe=" + client_associe
				+ ", numero_de_cb=" + numero_de_cb + ", solde_compte=" + solde_compte + "]";
	}
	
	
   
}
