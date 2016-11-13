package ejb.sessions.ecommerceDAO;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ejb.entitites.ecommerce.Auteur;
import ejb.entitites.ecommerce.Dvd;
import ejb.entitites.ecommerce.Realisateur;

/**
 * Session Bean implementation class RealisateurDAO
 */
@Stateless(name="RealisateurDAO")
@LocalBean
public class RealisateurDAO implements RealisateurDAORemote, RealisateurDAOLocal {

	@PersistenceContext
	private EntityManager em;
	
    public RealisateurDAO() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Realisateur getRealisateurId(Long id) {
		Realisateur fetchedRealisator = em.find(Realisateur.class, id);
		if (fetchedRealisator==null) throw new RuntimeException("Realisateur introuvable");
		return fetchedRealisator;
	}

	@Override
	public List<Realisateur> getListRealisateur() {
		Query req=em.createQuery("select c from Realisateur c");
		return req.getResultList();
	}

	@Override
	public List<Realisateur> getRealisateurNom(String nomRealisateur) {
		Query req=em.createQuery("select c from Realisateur c where c.nom_realisateur="+nomRealisateur);
		return  req.getResultList();
	}

	@Override
	public List<Realisateur> getRealisateurPrenom(String prenomRealisateur) {
		Query req=em.createQuery("select c from Realisateur c where c.prenom_realisateur="+prenomRealisateur);
		return  req.getResultList();
	}

	@Override
	public List<Dvd> getListDvdByRealisator(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Realisateur setRealisateurId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Realisateur setRealisateurNom(Long id, String nomRealisateur) {
		Realisateur fetchedRealisateur=em.find(Realisateur.class, id);
		fetchedRealisateur.setNom_realisateur(nomRealisateur);
		em.persist(fetchedRealisateur);
		return fetchedRealisateur;
	}

	@Override
	public Realisateur setRealisateurPrenom(Long id, String prenomRealisateur) {
		Realisateur fetchedRealisateur=em.find(Realisateur.class, id);
		fetchedRealisateur.setPrenom_realisateur(prenomRealisateur);
		em.persist(fetchedRealisateur);
		return fetchedRealisateur;
	}

	@Override
	public Realisateur addRealisateur(Realisateur realisateur) {
		em.persist(realisateur);
		return realisateur;
	}

	@Override
	public Realisateur addDvdRealisateur(Long id, Collection<Dvd> dvdByRealisator) {
		Realisateur fetchedRealisateur=em.find(Realisateur.class, id);
		for (Iterator<Dvd> it = dvdByRealisator.iterator();it.hasNext();){
			Dvd a = it.next();
			fetchedRealisateur.addDvd(a);
		}
		em.persist(fetchedRealisateur);
		return fetchedRealisateur;
	}

	@Override
	public void removeAll() {
		for (Iterator<Realisateur> it= getListRealisateur().iterator(); it.hasNext();){
			Realisateur realisateurTable= it.next();
			em.remove(realisateurTable);
		}
	}

	@Override
	public void removeRealisator(Long id) {
		em.remove(getRealisateurId(id));
		
	}

}
