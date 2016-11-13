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
import ejb.entitites.ecommerce.Client;
import ejb.entitites.ecommerce.Dvd;

/**
 * Session Bean implementation class AuteurDAO
 */
@Stateless(name="AuteurDAO")
@LocalBean
public class AuteurDAO implements AuteurDAORemote, AuteurDAOLocal {
	
	
	@PersistenceContext
	private EntityManager em;
	
    public AuteurDAO() {
        // TODO Auto-generated constructor stub
    }

    
	@Override
	public Auteur getAuteurId(Long id) {
		Auteur fetchedAuthor = em.find(Auteur.class, id);
		if (fetchedAuthor==null) throw new RuntimeException("Auteur introuvable");
		return fetchedAuthor;
	}

	@Override
	public List<Auteur> getListAuteur() {
		Query req=em.createQuery("select c from Auteur c");
		return req.getResultList();
	}

	@Override
	public List<Auteur> getAuteurNom(String nomAuteur) {
		Query req=em.createQuery("select c from Auteur c where c.nom_auteur="+nomAuteur);
		return  req.getResultList();
	}

	@Override
	public List<Auteur> getAuteurPrenom(String prenomAuteur) {
		Query req=em.createQuery("select c from Auteur c where c.prenom_auteur="+prenomAuteur);
		return  req.getResultList();
	}

	@Override
	public List<Dvd> getListDvdByAuthor(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Auteur setAuteurId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Auteur setAuteurNom(Long id, String nomAuteur) {
		Auteur fetchedAuteur=em.find(Auteur.class, id);
		fetchedAuteur.setNom_auteur(nomAuteur);
		em.persist(fetchedAuteur);
		return fetchedAuteur;
	}

	@Override
	public Auteur setAuteurPrenom(Long id, String prenomAuteur) {
		Auteur fetchedAuteur=em.find(Auteur.class, id);
		fetchedAuteur.setPrenom_auteur(prenomAuteur);
		em.persist(fetchedAuteur);
		return fetchedAuteur;
	}

	@Override
	public Auteur addAuteur(Auteur auteur) {
		em.persist(auteur);
		return auteur;
	}

	@Override
	public Auteur addDvdAuteur(Long id, Collection<Dvd> dvdByAuthor) {
		Auteur fetchedAuteur=em.find(Auteur.class, id);
		for (Iterator<Dvd> it = dvdByAuthor.iterator();it.hasNext();){
			Dvd a = it.next();
			fetchedAuteur.addDvd(a);
		}
		em.persist(fetchedAuteur);
		return fetchedAuteur;
	}

	@Override
	public void removeAll() {
		for (Iterator<Auteur> it= getListAuteur().iterator(); it.hasNext();){
			Auteur auteurTable= it.next();
			em.remove(auteurTable);
		}
		
	}

	@Override
	public void removeAuthor(Long id) {
		em.remove(getAuteurId(id));
		
	}

}
