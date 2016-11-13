package ejb.sessions.commandeDAO;

import java.util.List;

import javax.ejb.Remote;

import ejb.entities.commande.Commande;
import ejb.entities.commande.LotDvds;

@Remote
public interface LotDvdsDAORemote {

	
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
