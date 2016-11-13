package ejb.sessions.ecommerceDAO;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import ejb.entitites.ecommerce.Auteur;
import ejb.entitites.ecommerce.Dvd;
import ejb.entitites.ecommerce.Realisateur;

/**
 * Session Bean implementation class DvdDAO
 */
@Stateless
@LocalBean
public class DvdDAO implements DvdDAORemote, DvdDAOLocal {

    /**
     * Default constructor. 
     */
    public DvdDAO() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Dvd getDvdId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Dvd> getListDvd() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Dvd> getDvdNom(String nomDvd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Dvd> getDvdsByAuthor(Long idAuteurDvd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Dvd> getDvdsByRealisator(Long idRealisateurDvd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dvd setDvdId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dvd setDvdTitre(Long idDvd, String titreDvd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dvd setAuteur(Long idDvd, Auteur auteur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dvd setRealisateur(Long idDvd, Realisateur realisateur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dvd addDvd(Dvd dvd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeDvd(Long id) {
		// TODO Auto-generated method stub
		
	}

}
