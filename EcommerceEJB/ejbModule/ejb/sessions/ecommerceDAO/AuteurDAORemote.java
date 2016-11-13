package ejb.sessions.ecommerceDAO;

import java.util.Collection;
import java.util.List;

import javax.ejb.Remote;

import ejb.entitites.ecommerce.Auteur;
import ejb.entitites.ecommerce.Dvd;

@Remote
public interface AuteurDAORemote {

	
	public Auteur getAuteurId(Long id);
	public List<Auteur> getListAuteur();
	public List<Auteur> getAuteurNom(String nomAuteur);
	public List<Auteur> getAuteurPrenom(String prenomAuteur);
	public List<Dvd> getListDvdByAuthor(Long id);
	
	public Auteur setAuteurId(Long id);
	public Auteur setAuteurNom(Long id, String nomAuteur);
	public Auteur setAuteurPrenom(Long id, String prenomAuteur);
	
	
	public Auteur addAuteur(Auteur auteur);
	public Auteur addDvdAuteur(Long id, Collection<Dvd> dvdByAuthor);
	
	public void removeAll();
	public void removeAuthor(Long id);
}
