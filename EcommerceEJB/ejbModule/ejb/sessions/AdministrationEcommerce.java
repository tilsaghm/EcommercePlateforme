package ejb.sessions;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ejb.entitites.banque.CompteBancaire;
import ejb.entitites.ecommerce.Auteur;
import ejb.entitites.ecommerce.Client;
import ejb.entitites.ecommerce.CompteEcommerce;
import ejb.entitites.ecommerce.Dvd;
import ejb.entitites.ecommerce.Realisateur;


/**
 * Session Bean implementation class Administration_ecommerce
 */
@Stateless(name="ADMINISTRATION")
public class AdministrationEcommerce implements AdministrationEcommerceRemote, AdministrationEcommerceLocal {
	
	
	@PersistenceContext
	private EntityManager em;
	

	@Override
	public Auteur get_auteur(Long id) {
		Auteur fetchedAuthor = em.find(Auteur.class, id);
		if (fetchedAuthor==null) throw new RuntimeException("Auteur introuvable");
		return fetchedAuthor;
		
	}

	@Override
	public Client get_client(Long id) {
		Client fetchedClient = em.find(Client.class, id);
		if (fetchedClient==null) throw new RuntimeException("Client introuvable");
		return fetchedClient;
	}

	@Override
	public CompteEcommerce get_compte_ecommerce(Long id) {
		CompteEcommerce fetchedEcommerceAccount = em.find(CompteEcommerce.class, id);
		if (fetchedEcommerceAccount==null) throw new RuntimeException("Compte Ecommerce introuvable");
		return fetchedEcommerceAccount;
	}

	@Override
	public Dvd get_dvd(Long id) {
		Dvd fetchedDvd = em.find(Dvd.class, id);
		if (fetchedDvd==null) throw new RuntimeException("Dvd introuvable");
		return fetchedDvd;
	}

	@Override
	public Realisateur get_realisateur(Long id) {
		Realisateur fetchedRealisator = em.find(Realisateur.class, id);
		if (fetchedRealisator==null) throw new RuntimeException("Realisateur introuvable");
		return fetchedRealisator;
	}

	@Override
	public CompteBancaire get_compte_bancaire(Long id) {
		CompteBancaire fetchedBankAccount = em.find(CompteBancaire.class, id);
		if (fetchedBankAccount==null) throw new RuntimeException("Compte bancaire introuvable");
		return fetchedBankAccount;
	}

	@Override
	public Auteur add_auteur(Auteur auteur) {
		em.persist(auteur);
		return auteur;
		
	}

	@Override
	public Client add_client(Client client) {
		em.persist(client);
		return client;
	
	}

	@Override
	public CompteEcommerce add_compte_ecommerce(CompteEcommerce compte_ecommerce) {
		em.persist(compte_ecommerce);
		return compte_ecommerce;
		
	}

	@Override
	public Dvd add_dvd(Dvd dvd) {
		em.persist(dvd);
		return dvd;
		
	}

	@Override
	public Realisateur add_realisateur(Realisateur realisateur) {
		em.persist(realisateur);
		return realisateur;
		
	}

	@Override
	public CompteBancaire add_compte_bancaire(CompteBancaire compte_bancaire) {
		em.persist(compte_bancaire);
		return compte_bancaire;
		
	}

	@Override
	public List<Auteur> list_auteur() {
		Query req=em.createQuery("select c from Auteur c");
		return req.getResultList();
	}

	@Override
	public List<Client> list_client() {
		Query req=em.createQuery("select c from Client c");
		return req.getResultList();
	}

	@Override
	public List<CompteEcommerce> list_compte_ecommerce() {
		Query req=em.createQuery("select c from Compte_ecommerce c");
		return req.getResultList();
	}

	@Override
	public List<Dvd> list_dvd() {
		Query req=em.createQuery("select c from Dvd c");
		return req.getResultList();
	}

	@Override
	public List<Realisateur> list_realisateur() {
		Query req=em.createQuery("select c from Realisateur c");
		return req.getResultList();
	}

	@Override
	public List<CompteBancaire> list_compte_bancaire() {
		Query req=em.createQuery("select c from Compte_bancaire c");
		return req.getResultList();
	}

	@Override
	public Auteur editer_nom_auteur(Long id, String nouveauNom) {
		int count = em.createQuery("UPDATE Auteur SET nom_auteur = '"+nouveauNom+"' where id_auteur = "+id).executeUpdate();
		Auteur fetchedAuteur = em.find(Auteur.class, id);
		
		if (fetchedAuteur==null) throw new RuntimeException("Auteur introuvable");
		return fetchedAuteur;
	}

	@Override
	public Auteur editer_prenom_auteur(Long id, String nouveauPrenom) {
		int count = em.createQuery("UPDATE Auteur SET prenom_auteur = '"+nouveauPrenom+"' where id_auteur = "+id).executeUpdate();
		Auteur fetchedAuteur = em.find(Auteur.class, id);
		
		if (fetchedAuteur==null) throw new RuntimeException("Auteur introuvable");
		return fetchedAuteur;
	}

	@Override
	public Realisateur editer_nom_realisateur(Long id, String nouveauNom) {
		int count = em.createQuery("UPDATE Auteur SET nom_realisateur = '"+nouveauNom+"' where id_auteur = "+id).executeUpdate();
		Realisateur fetchedRealisator = em.find(Realisateur.class, id);
		
		if (fetchedRealisator==null) throw new RuntimeException("Realisateur introuvable");
		return fetchedRealisator;
	}

	@Override
	public Realisateur editer_prenom_reallisateur(Long id, String nouveauPrenom) {
		int count = em.createQuery("UPDATE Auteur SET prenom_realisateur = '"+nouveauPrenom+"' where id_auteur = "+id).executeUpdate();
		Realisateur fetchedRealisator = em.find(Realisateur.class, id);
		
		if (fetchedRealisator==null) throw new RuntimeException("Realisateur introuvable");
		return fetchedRealisator;
	}

	@Override
	public void appendAuthorToDvd(Long idDvd, Long idAuteur) {
		//int count = em.createQuery("UPDATE Dvd SET auteur_dvd_id_auteur = '"+idAuteur+"' where id_dvd = "+idDvd).executeUpdate();
		Dvd d=em.find(Dvd.class, idDvd);
		d.setAuteur_dvd(em.find(Auteur.class, idAuteur));
		em.persist(d);
	
	}

	@Override
	public void appendRealisatorToDvd(Long idDvd, Long idRealisateur) {
		//int count = em.createQuery("UPDATE Dvd SET realisateur_dvd_id_realisateur = '"+idRealisateur+"' where id_dvd = "+idDvd).executeUpdate();
		Dvd d=em.find(Dvd.class, idDvd);
		d.setRealisateur_dvd(em.find(Realisateur.class, idRealisateur));
		em.persist(d);
	}

	@Override
	public void appendDvdToAuthor(Long idAuteur, Long idDvd) {
		Auteur a=em.find(Auteur.class, idAuteur);
		a.addDvd(em.find(Dvd.class, idDvd));
		em.persist(a);
		
	}

	@Override
	public void appendDvdtoRealisator(Long idRealisator, Long idDvd) {
		Realisateur a=em.find(Realisateur.class, idRealisator);
		a.addDvd(em.find(Dvd.class, idDvd));
		em.persist(a);
		
	}


	
	
}
