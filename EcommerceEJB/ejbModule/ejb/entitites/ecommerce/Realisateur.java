package ejb.entitites.ecommerce;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Realisateur
 *
 */
@Entity

public class Realisateur implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id_realisateur;
	private String nom_realisateur;
	private String prenom_realisateur;
	@OneToMany(cascade = CascadeType.ALL)
	private Collection<Dvd> dvds;
	
	private static final long serialVersionUID = 1L;

	public Realisateur() {
		super();
	}  
	
	public Realisateur(String nomRealisateur, String prenomRealisateur){
		super();
		this.nom_realisateur=nomRealisateur;
		this.prenom_realisateur=prenomRealisateur;

		
	}
	
	public Realisateur(String nomRealisateur, String prenomRealisateur, Collection<Dvd> collectionDvd){
		super();
		this.nom_realisateur=nomRealisateur;
		this.prenom_realisateur=prenomRealisateur;
		this.dvds=collectionDvd;
	}
	
	public Long getId_realisateur() {
		return this.id_realisateur;
	}

	public void setId_realisateur(Long id_realisateur) {
		this.id_realisateur = id_realisateur;
	}   
	public String getNom_realisateur() {
		return this.nom_realisateur;
	}

	public void setNom_realisateur(String nom_realisateur) {
		this.nom_realisateur = nom_realisateur;
	}   
	public String getPrenom_realisateur() {
		return this.prenom_realisateur;
	}

	public void setPrenom_realisateur(String prenom_realisateur) {
		this.prenom_realisateur = prenom_realisateur;
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
		return "Realisateur [id_realisateur=" + id_realisateur + ", nom_realisateur=" + nom_realisateur
				+ ", prenom_realisateur=" + prenom_realisateur + "]";
	}

}
