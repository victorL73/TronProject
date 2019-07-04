package fr.exia.tron.entity.mobile;

import fr.exia.tron.contract.IPermeability;
import fr.exia.tron.entity.Sprite;

/**Alive is a class for Alive entity
 * @author  Victor Lerivray
 * @version 1.0
 */
public abstract class Alive extends MobileEntity implements IPermeability {

    /** Method for check if something is alive
     *
     * @param sprite
     */
    Alive(Sprite sprite){
        super((sprite));
    }
}
