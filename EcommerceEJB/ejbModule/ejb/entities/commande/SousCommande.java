package ejb.entities.commande;

import java.io.Serializable;
import java.lang.Long;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: SousCommande
 *
 */
@Entity

public class SousCommande implements Serializable {

	   
	@Id
	private Long id_sousCommande;
	
	@OneToOne(cascade=CascadeType.ALL)
	private LotDvds LotAssocie;
	
	private static final long serialVersionUID = 1L;

	public SousCommande() {
		super();
	}   
	public Long getId_sousCommande() {
		return this.id_sousCommande;
	}

	public void setId_sousCommande(Long id_sousCommande) {
		this.id_sousCommande = id_sousCommande;
	}
   
}
