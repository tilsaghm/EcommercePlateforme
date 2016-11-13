package ejb.entities.fournisseur;

import java.io.Serializable;
import java.lang.Long;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Editeur
 *
 */
@Entity

public class Editeur implements Serializable {

	   
	@Id
	private Long id_editeur;
	private static final long serialVersionUID = 1L;

	public Editeur() {
		super();
	}   
	public Long getId_editeur() {
		return this.id_editeur;
	}

	public void setId_editeur(Long id_editeur) {
		this.id_editeur = id_editeur;
	}
   
}
