package ejb.entities.fournisseur;

import java.io.Serializable;
import java.lang.Long;
import java.util.Collection;

import javax.persistence.*;

import ejb.entities.stock.StockUnitaire;

/**
 * Entity implementation class for Entity: Fournisseur
 *
 */
@Entity

public class Fournisseur implements Serializable {

	   
	@Id
	private Long id_fournisseur;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Editeur editeur;
	
	@OneToMany(cascade=CascadeType.ALL)
	private Collection<StockUnitaire> stockDesDvdEditeur;
	
	
	private static final long serialVersionUID = 1L;

	public Fournisseur() {
		super();
	}   
	public Long getId_fournisseur() {
		return this.id_fournisseur;
	}

	public void setId_fournisseur(Long id_fournisseur) {
		this.id_fournisseur = id_fournisseur;
	}
   
}
