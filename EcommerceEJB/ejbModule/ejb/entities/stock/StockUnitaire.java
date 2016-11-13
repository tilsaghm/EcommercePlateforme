package ejb.entities.stock;

import java.io.Serializable;
import javax.persistence.*;

import ejb.entities.fournisseur.Fournisseur;
import ejb.entitites.ecommerce.Dvd;

/**
 * Entity implementation class for Entity: StockUnitaire
 *
 */
@Entity

public class StockUnitaire implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id_stockUnitaire;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Fournisseur fournisseurStockDvd;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Dvd DvdStock;
	
	private int quantiteDisponible;
	
	
	private static final long serialVersionUID = 1L;

	public StockUnitaire() {
		super();
	}
	public Long getId_stockUnitaire() {
		return id_stockUnitaire;
	}

	public void setId_stockUnitaire(Long id_stockUnitaire) {
		this.id_stockUnitaire = id_stockUnitaire;
	}
	
	public Dvd getDvdStock() {
		return DvdStock;
	}
	public void setDvdStock(Dvd dvdStock) {
		DvdStock = dvdStock;
	}


	public int getQuantiteDisponible() {
		return quantiteDisponible;
	}
	public void setQuantiteDisponible(int quantiteDisponible) {
		this.quantiteDisponible = quantiteDisponible;
	}
	
	
}
