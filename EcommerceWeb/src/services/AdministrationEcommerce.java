package services;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import ejb.entitites.ecommerce.Auteur;
import ejb.entitites.ecommerce.Realisateur;
import ejb.entitites.ecommerce.Dvd;
import ejb.sessions.AdministrationEcommerceLocal;
 

@WebService
public class AdministrationEcommerce {

	@EJB
	private AdministrationEcommerceLocal interfaceAdministration;
	
	@WebMethod
	public void addAuteur(
			@WebParam(name="prenom")String prenom, 
			@WebParam(name="nom")String nom){
		interfaceAdministration.add_auteur(new Auteur(prenom,nom));
	}
	
	
	@WebMethod
	public void addRealisateur(
			@WebParam(name="prenom")String prenom, 
			@WebParam(name="nom")String nom){
		interfaceAdministration.add_realisateur(new Realisateur(nom,prenom));
	}
	
	@WebMethod
	public void addDvd(
			@WebParam(name="auteurDvd")Auteur auteurDvd, 
			@WebParam(name="realisateurDvd")Realisateur realisateurDvd,
			@WebParam(name="titreDvd")String titreDvd){
		interfaceAdministration.add_dvd(new Dvd(titreDvd));
	}
	
	
	
	
}
