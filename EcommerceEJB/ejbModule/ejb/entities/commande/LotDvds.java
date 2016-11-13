package ejb.entities.commande;

import java.io.Serializable;
import java.lang.Long;
import javax.persistence.*;

import ejb.entitites.ecommerce.Dvd;

/**
 * Entity implementation class for Entity: LotDvds
 *
 */
@Entity

public class LotDvds implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id_lotDvds;
	@OneToOne(cascade=CascadeType.ALL)
	private Commande commandeAssociee;
	@OneToOne(cascade=CascadeType.ALL)
	private Dvd dvdLot;
	private int quantiteDvdLot;
	private double sousTotalLot;
	
	private static final long serialVersionUID = 1L;

	public LotDvds() {
		super();
	}   
	public Long getId_lotDvds() {
		return this.id_lotDvds;
	}

	public void setId_lotDvds(Long id_lotDvds) {
		this.id_lotDvds = id_lotDvds;
	}
	
	public Commande getCommandeAssociee() {
		return commandeAssociee;
	}
	public void setCommandeAssociee(Commande commandeAssociee) {
		this.commandeAssociee = commandeAssociee;
	}
	public Dvd getDvdLot() {
		return dvdLot;
	}
	public void setDvdLot(Dvd dvdLot) {
		this.dvdLot = dvdLot;
	}
	
	@Override
	public String toString() {
		return "LotDvds [id_lotDvds=" + id_lotDvds + ", commandeAssociee=" + commandeAssociee + ", dvdLot=" + dvdLot
				+ "]";
	}
	public int getQuantiteDvdLot() {
		return quantiteDvdLot;
	}
	public void setQuantiteDvdLot(int quantiteDvdLot) {
		this.quantiteDvdLot = quantiteDvdLot;
	}
	public double getSousTotalLot() {
		return sousTotalLot;
	}
	public void setSousTotalLot(double sousTotalLot) {
		this.sousTotalLot = sousTotalLot;
	}
	
	public double calculSousTotal(){
		
		return dvdLot.getPrixDvd()*quantiteDvdLot;
	}
	
}
