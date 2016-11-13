package ejb.sessions.commandeDAO;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import ejb.entities.commande.Commande;
import ejb.entities.commande.LotDvds;

/**
 * Session Bean implementation class LotDvdsDAO
 */
@Stateless
@LocalBean
public class LotDvdsDAO implements LotDvdsDAORemote, LotDvdsDAOLocal {

    /**
     * Default constructor. 
     */
    public LotDvdsDAO() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public LotDvds getLotDvdsId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LotDvds> getListLotDvds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LotDvds> getListLotDvdsCommande(Commande commandeAssociee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getSousTotalLotDvds(Long idLotDvds) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public LotDvds setLotDvdsId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LotDvds setLotDvdsCommande(Long id, Commande commande) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LotDvds addLotDvds(LotDvds commandeAssocie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeLotDvds(Long idLotDvds) {
		// TODO Auto-generated method stub
		
	}

}
