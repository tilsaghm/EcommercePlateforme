package ejb.sessions.commandeDAO;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class SousCommandeDAO
 */
@Stateless
@LocalBean
public class SousCommandeDAO implements SousCommandeDAORemote, SousCommandeDAOLocal {

    /**
     * Default constructor. 
     */
    public SousCommandeDAO() {
        // TODO Auto-generated constructor stub
    }

}
