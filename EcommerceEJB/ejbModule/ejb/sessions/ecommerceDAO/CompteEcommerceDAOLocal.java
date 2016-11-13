package ejb.sessions.ecommerceDAO;

import java.util.Collection;
import java.util.List;

import javax.ejb.Local;

import ejb.entities.commande.Commande;
import ejb.entitites.banque.CompteBancaire;
import ejb.entitites.ecommerce.CompteEcommerce;

@Local
public interface CompteEcommerceDAOLocal {

	public CompteEcommerce getCompteEcommerceId(Long id);
	public List<CompteEcommerce> getListCompteEcommerce();
	public CompteEcommerce getCompteEcommercePseudo(String pseudoCompteEcommerce);
	public CompteEcommerce getCompteEcommerceClient(Long idClient);
	public Collection<Commande> getCommandeCompteEcommerce(Long idCompteEcommerce);
	public CompteEcommerce getAdminAccount();
	
	
	public CompteEcommerce setCompteEcommerceId(Long id);
	public CompteEcommerce setCompteEcommercePseudo(Long id, String pseudoCompteEcommerce);
	public CompteEcommerce setCompteEcommercePassword(Long id, String mdpCompteEcommerce);
	
	//public CompteEcommerce setSoldBancaire(Long idCompteEcommerce, double montant);
	
	public CompteEcommerce addCompteEcommerce(CompteEcommerce compteEcommerce);
	public CompteEcommerce addCommande(Long idCompteEcommerce, Commande commande);
	
	public void removeAll();
	public void removeCompteEcommerce(Long idCompteEcommerce);
	
}
