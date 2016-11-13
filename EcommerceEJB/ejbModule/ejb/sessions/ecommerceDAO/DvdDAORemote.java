package ejb.sessions.ecommerceDAO;

import java.util.List;

import javax.ejb.Remote;

import ejb.entitites.ecommerce.Auteur;
import ejb.entitites.ecommerce.Dvd;
import ejb.entitites.ecommerce.Realisateur;

@Remote
public interface DvdDAORemote {

	public Dvd getDvdId(Long id);
	public List<Dvd> getListDvd();
	public List<Dvd> getDvdNom(String nomDvd);
	public List<Dvd> getDvdsByAuthor(Long idAuteurDvd);
	public List<Dvd> getDvdsByRealisator(Long idRealisateurDvd);
	
	
	public Dvd setDvdId(Long id);
	public Dvd setDvdTitre(Long idDvd, String titreDvd);
	public Dvd setAuteur(Long idDvd, Auteur auteur);
	public Dvd setRealisateur(Long idDvd, Realisateur realisateur);
	
	
	public Dvd addDvd(Dvd dvd);
	
	
	public void removeAll();
	public void removeDvd(Long id);
}
