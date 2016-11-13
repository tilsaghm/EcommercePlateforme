package ejb.sessions.stockDAO;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class StockUnitaireDAO
 */
@Stateless
@LocalBean
public class StockUnitaireDAO implements StockUnitaireDAORemote, StockUnitaireDAOLocal {

    /**
     * Default constructor. 
     */
    public StockUnitaireDAO() {
        // TODO Auto-generated constructor stub
    }

}
