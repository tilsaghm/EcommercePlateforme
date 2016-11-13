package ejb.sessions.commandeDAO;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.List;

import javax.ejb.Local;

import ejb.entities.commande.Commande;
import ejb.entities.commande.LotDvds;
import ejb.entities.commande.LotDvds;
import ejb.entitites.ecommerce.CompteEcommerce;

@Local
public interface LotDvdsDAOLocal {

	public LotDvds getLotDvdsId(Long id);
	public List<LotDvds> getListLotDvds();
	public List<LotDvds> getListLotDvdsCommande(Commande commandeAssociee);
	public double getSousTotalLotDvds(Long idLotDvds);
	
	public LotDvds setLotDvdsId(Long id);
	public LotDvds setLotDvdsCommande(Long id, Commande commande);
	
	public LotDvds addLotDvds(LotDvds commandeAssocie);
	
	public void removeAll();
	public void removeLotDvds(Long idLotDvds);
}
