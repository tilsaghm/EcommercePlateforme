package ejb.sessions;

import java.util.List;

import javax.ejb.Remote;

import ejb.entitites.banque.CompteBancaire;
import ejb.entitites.ecommerce.Auteur;
import ejb.entitites.ecommerce.Client;
import ejb.entitites.ecommerce.CompteEcommerce;
import ejb.entitites.ecommerce.Dvd;
import ejb.entitites.ecommerce.Realisateur;

@Remote
public interface AdministrationEcommerceRemote {
	// get des beans en fonction de l'id
	public Auteur get_auteur(Long id);
	public Client get_client(Long id);
	public CompteEcommerce get_compte_ecommerce(Long id);
	public Dvd get_dvd(Long id);
	public Realisateur get_realisateur(Long id);
	public CompteBancaire get_compte_bancaire(Long id);
	
	
	// rajout d'un bean à la base de données
	public Auteur add_auteur(Auteur auteur);
	public Client add_client(Client client);
	public CompteEcommerce add_compte_ecommerce(CompteEcommerce compte_ecommerce);
	public Dvd add_dvd(Dvd dvd);
	public Realisateur add_realisateur(Realisateur realisateur);
	public CompteBancaire add_compte_bancaire(CompteBancaire compte_bancaire);
	
	//rajouter auteur ou realisateur a un dvd
	public void appendAuthorToDvd(Long idDvd, Long idAuteur);
	public void appendRealisatorToDvd(Long idDvd, Long iRealisateur);
	
	//rajouter dvd a un auteur
		public void appendDvdToAuthor(Long idAuteur, Long idDvd);
		public void appendDvdtoRealisator(Long idRealisator, Long idDvd);
		
	
	// get l'integralite des beans
	public List<Auteur> list_auteur();
	public List<Client> list_client();
	public List<CompteEcommerce> list_compte_ecommerce();
	public List<Dvd> list_dvd();
	public List<Realisateur> list_realisateur();
	public List<CompteBancaire> list_compte_bancaire();
	
	
	//methode de modification d'un champs
	public Auteur editer_nom_auteur(Long id,String nouveauNom);
	public Auteur editer_prenom_auteur(Long id,String nouveauPrenom);
	public Realisateur editer_nom_realisateur(Long id,String nouveauNom);
	public Realisateur editer_prenom_reallisateur(Long id,String nouveauPrenom);
}
