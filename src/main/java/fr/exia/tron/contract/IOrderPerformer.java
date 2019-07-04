package fr.exia.tron.contract;

import java.io.IOException;


/**
 * The Interface IOrderPerformed
 *
 * @author Victor Lerivray
 * @version 1.0
 */
public interface IOrderPerformer {

    /**
     * Order perform.
     *
     * @param userOrder
     *            the user order
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    void orderPerform(UserOrder userOrder) throws IOException;

}
