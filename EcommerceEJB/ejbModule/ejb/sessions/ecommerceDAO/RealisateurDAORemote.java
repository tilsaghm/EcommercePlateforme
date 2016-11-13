package ejb.sessions.ecommerceDAO;

import java.util.Collection;
import java.util.List;

import javax.ejb.Remote;

import ejb.entitites.ecommerce.Dvd;
import ejb.entitites.ecommerce.Realisateur;

@Remote
public interface RealisateurDAORemote {

	public Realisateur getRealisateurId(Long id);
	public List<Realisateur> getListRealisateur();
	public List<Realisateur> getRealisateurNom(String nomRealisateur);
	public List<Realisateur> getRealisateurPrenom(String prenomRealisateur);
	public List<Dvd> getListDvdByRealisator(Long id);
	
	public Realisateur setRealisateurId(Long id);
	public Realisateur setRealisateurNom(Long id, String nomRealisateur);
	public Realisateur setRealisateurPrenom(Long id, String prenomRealisateur);
	
	
	public Realisateur addRealisateur(Realisateur auteur);
	public Realisateur addDvdRealisateur(Long id, Collection<Dvd> dvdByAuthor);
	
	public void removeAll();
	public void removeRealisator(Long id);
}
