package ejb.sessions.ecommerceDAO;

import java.util.Collection;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import ejb.entities.commande.Commande;
import ejb.entitites.ecommerce.CompteEcommerce;

/**
 * Session Bean implementation class CompteEcommerceDAO
 */
@Stateless
@LocalBean
public class CompteEcommerceDAO implements CompteEcommerceDAORemote, CompteEcommerceDAOLocal {

    /**
     * Default constructor. 
     */
    public CompteEcommerceDAO() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public CompteEcommerce getCompteEcommerceId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CompteEcommerce> getListCompteEcommerce() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CompteEcommerce getCompteEcommercePseudo(String pseudoCompteEcommerce) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CompteEcommerce getCompteEcommerceClient(Long idClient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Commande> getCommandeCompteEcommerce(Long idCompteEcommerce) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CompteEcommerce getAdminAccount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CompteEcommerce setCompteEcommerceId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CompteEcommerce setCompteEcommercePseudo(Long id, String pseudoCompteEcommerce) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CompteEcommerce setCompteEcommercePassword(Long id, String mdpCompteEcommerce) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CompteEcommerce addCompteEcommerce(CompteEcommerce compteEcommerce) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CompteEcommerce addCommande(Long idCompteEcommerce, Commande commande) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeCompteEcommerce(Long idCompteEcommerce) {
		// TODO Auto-generated method stub
		
	}

}
