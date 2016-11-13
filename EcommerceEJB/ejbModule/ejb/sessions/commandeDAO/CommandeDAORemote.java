package ejb.sessions.commandeDAO;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.List;

import javax.ejb.Remote;

import ejb.entities.commande.Commande;
import ejb.entities.commande.LotDvds;
import ejb.entitites.ecommerce.CompteEcommerce;

@Remote
public interface CommandeDAORemote {

	
	public Commande getCommandeId(Long id);
	public List<Commande> getListCommande();
	public Commande getCommandeTimeStamp(Timestamp dateDeCreation);
	public Commande getCommandeCompteEcommerce(Long idCompteEcommerce);
	public Commande getCommandeClient(Long idclient);
	public Collection<LotDvds> getLotsDvdCommande(Long idCommande);
	public double getTotalCommande(Long idCommande);
	
	public Commande setCommandeId(Long id);
	public Commande setCommandeCompteEcommerce(Long id, CompteEcommerce compteEcommerce);
	
	
	public Commande addCommande(Commande commandeAssocie);
	public Commande addCommandeLotDvd(Long idCommande, LotDvds lotDvdAjoute);
	
	public void removeAll();
	public void removeCommande(Long idCommande);
	
}
