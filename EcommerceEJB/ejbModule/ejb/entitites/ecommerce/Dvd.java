package ejb.entitites.ecommerce;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Dvd
 *
 */
@Entity

public class Dvd implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id_dvd;
	private String titre_dvd;
	@ManyToOne(cascade = CascadeType.ALL)
	private Auteur auteur_dvd;
	@ManyToOne(cascade = CascadeType.ALL)
	private Realisateur realisateur_dvd;
	
	private double prixDvd;
	
	/*
	 * @OneToOne
	 * private Editeur editeurDvd;
	 * */
	
	private static final long serialVersionUID = 1L;

	public Dvd() {
		super();
	}   
	
	public Dvd(String titreDvd){
		super();
		this.titre_dvd=titreDvd;
	
	}
	
	public Dvd(String titreDvd, Auteur auteurFilm, Realisateur realisateurFilm){
		super();
		this.titre_dvd=titreDvd;
		this.auteur_dvd=auteurFilm;
		this.realisateur_dvd=realisateurFilm;
	}
	
	public Long getId_dvd() {
		return this.id_dvd;
	}

	public void setId_dvd(Long id_dvd) {
		this.id_dvd = id_dvd;
	}   
	public String getTitre_dvd() {
		return this.titre_dvd;
	}

	public void setTitre_dvd(String titre_dvd) {
		this.titre_dvd = titre_dvd;
	}

	
	public Auteur getAuteur_dvd() {
		return auteur_dvd;
	}
	public void setAuteur_dvd(Auteur auteur_dvd) {
		this.auteur_dvd = auteur_dvd;
	}
	public Realisateur getRealisateur_dvd() {
		return realisateur_dvd;
	}
	public void setRealisateur_dvd(Realisateur realisateur_dvd) {
		this.realisateur_dvd = realisateur_dvd;
	}

	public void addAuteur(Auteur auteurAjoute){
		this.auteur_dvd=auteurAjoute;
		
	}
	
	public void addRealisateur(Realisateur realisateurAjoute){
		this.realisateur_dvd=realisateurAjoute;
		
	}
	


	public double getPrixDvd() {
		return prixDvd;
	}

	public void setPrixDvd(double prixDvd) {
		this.prixDvd = prixDvd;
	}
   
	
	@Override
	public String toString() {
		return "Dvd [id_dvd=" + id_dvd + ", titre_dvd=" + titre_dvd + ", auteur_dvd=" + auteur_dvd
				+ ", realisateur_dvd=" + realisateur_dvd + "]";
	}
	
}
