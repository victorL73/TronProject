package fr.exia.tron.contract;


/**
 * The Interface ITronController.
 *
 * @author Victor Lerivray
 * @version 1.0
 * @see IOrderPerformer
 */
public interface ITronController {


    /**
     * Gets the order peformer.
     *
     * @return the order peformer
     *
*/
    void orderPerform(UserOrder keyCodeToUseOrder);

}
