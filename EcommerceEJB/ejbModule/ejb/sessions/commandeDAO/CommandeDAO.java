package ejb.sessions.commandeDAO;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import ejb.entities.commande.LotDvds;
import ejb.entitites.ecommerce.CompteEcommerce;

/**
 * Session Bean implementation class Commande
 */
@Stateless
@LocalBean
public class CommandeDAO implements CommandeDAORemote, CommandeDAOLocal {

    /**
     * Default constructor. 
     */
    public CommandeDAO() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public ejb.entities.commande.Commande getCommandeId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ejb.entities.commande.Commande> getListCommande() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ejb.entities.commande.Commande getCommandeTimeStamp(Timestamp dateDeCreation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ejb.entities.commande.Commande getCommandeCompteEcommerce(Long idCompteEcommerce) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ejb.entities.commande.Commande getCommandeClient(Long idclient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<LotDvds> getLotsDvdCommande(Long idCommande) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ejb.entities.commande.Commande setCommandeId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ejb.entities.commande.Commande setCommandeCompteEcommerce(Long id, CompteEcommerce compteEcommerce) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ejb.entities.commande.Commande addCommande(ejb.entities.commande.Commande commandeAssocie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ejb.entities.commande.Commande addCommandeLotDvd(Long idCommande, LotDvds lotDvdAjoute) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeCommande(Long idCommande) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getTotalCommande(Long idCommande) {
		// TODO Auto-generated method stub
		return 0;
	}

}
