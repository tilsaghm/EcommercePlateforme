package ejb.entities.commande;

import java.io.Serializable;
import java.lang.Long;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Iterator;

import javax.persistence.*;
import ejb.entities.commande.*;
import ejb.entitites.ecommerce.CompteEcommerce;

/**
 * Entity implementation class for Entity: Commande
 *
 */
@Entity

public class Commande implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id_commande;
	private Timestamp dateCommande;
	
	@OneToOne(cascade=CascadeType.ALL)
	private CompteEcommerce compteAssocieCommande;
	@OneToMany(cascade=CascadeType.ALL)
	private Collection<LotDvds> lotDvdCommande;
	
	private double totalCommande;
	
	private static final long serialVersionUID = 1L;

	public Commande() {
		super();
	}   
	public Long getId_commande() {
		return this.id_commande;
	}

	public void setId_commande(Long id_commande) {
		this.id_commande = id_commande;
	}
   
	public Timestamp getDateCommande() {
		return dateCommande;
	}
	public void setDateCommande(Timestamp dateCommande) {
		this.dateCommande = dateCommande;
	}
	public CompteEcommerce getCompteAssocieCommande() {
		return compteAssocieCommande;
	}
	public void setCompteAssocieCommande(CompteEcommerce compteAssocieCommande) {
		this.compteAssocieCommande = compteAssocieCommande;
	}
	public Collection<LotDvds> getLotDvdCommande() {
		return lotDvdCommande;
	}
	public void setLotDvdCommande(Collection<LotDvds> lotDvdCommande) {
		this.lotDvdCommande = lotDvdCommande;
	}

	public double getTotalCommande() {
		return totalCommande;
	}
	public void setTotalCommande(double totalCommande) {
		this.totalCommande = totalCommande;
	}

	public double totalCommande(){
		Iterator<LotDvds> it = this.lotDvdCommande.iterator();
		double totalCommande=0;
		while(it.hasNext()){
			LotDvds a= it.next();
			totalCommande+=a.calculSousTotal();
		}
		
		return totalCommande;
	}

	
	@Override
	public String toString() {
		return "Commande [id_commande=" + id_commande + ", dateCommande=" + dateCommande + ", compteAssocieCommande="
				+ compteAssocieCommande + ", lotDvdCommande=" + lotDvdCommande + "]";
	}
	
	
}
