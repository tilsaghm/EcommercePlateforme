package ejb.entitites.ecommerce;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Auteur
 *
 */
@Entity

public class Auteur implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id_auteur;
	private String prenom_auteur;
	private String nom_auteur;
	@OneToMany(cascade = CascadeType.ALL)
	private Collection<Dvd> dvds;
	
	private static final long serialVersionUID = 1L;

	public Auteur() {
		super();
	}   
	
	public Auteur(String prenomAuteur, String nomAuteur){
		super();
		this.prenom_auteur=prenomAuteur;
		this.nom_auteur=nomAuteur;
		this.dvds=new ArrayList<Dvd>();
		
		
	}
	
	public Auteur(String prenomAuteur, String nomAuteur, Collection<Dvd> collectionDvd){
		super();
		this.prenom_auteur=prenomAuteur;
		this.nom_auteur=nomAuteur;
		this.dvds=collectionDvd;
		
	}
	
	public Long getId_auteur() {
		return this.id_auteur;
	}

	public void setId_auteur(Long id_auteur) {
		this.id_auteur = id_auteur;
	}   
	public String getPrenom_auteur() {
		return this.prenom_auteur;
	}

	public void setPrenom_auteur(String prenom_auteur) {
		this.prenom_auteur = prenom_auteur;
	}   
	public String getNom_auteur() {
		return this.nom_auteur;
	}

	public void setNom_auteur(String nom_auteur) {
		this.nom_auteur = nom_auteur;
	}


	public Collection<Dvd> getDvds() {
		return dvds;
	}

	public void setDvds(Collection<Dvd> dvds) {
		this.dvds = dvds;
	}

	
	public void addDvd(Dvd dvdAjoute){
		this.dvds.add(dvdAjoute);
	}
	

	@Override
	public String toString() {
		return "Auteur [id_auteur=" + id_auteur + ", prenom_auteur=" + prenom_auteur + ", nom_auteur=" + nom_auteur
				+ "]";
	}

	
 
	
}
