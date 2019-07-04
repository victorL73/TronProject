package fr.exia.tron.entity.mobile;

import fr.exia.tron.entity.Entity;
import fr.exia.tron.entity.Sprite;
/**the classe Mobile Entity is used for the mobile entity
 * @author  Victor Lerivray
 * @version 1.0
 */
public abstract class MobileEntity extends Entity {


    /** this constructor gives the sprite
     *
     * @param sprite
     */
    public MobileEntity (Sprite sprite){
        super(sprite);
    }
}
