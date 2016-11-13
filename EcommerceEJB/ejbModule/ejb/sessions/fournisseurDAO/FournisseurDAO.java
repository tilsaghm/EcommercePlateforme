package ejb.sessions.fournisseurDAO;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class FournisseurDAO
 */
@Stateless
@LocalBean
public class FournisseurDAO implements FournisseurDAORemote, FournisseurDAOLocal {

    /**
     * Default constructor. 
     */
    public FournisseurDAO() {
        // TODO Auto-generated constructor stub
    }

}
