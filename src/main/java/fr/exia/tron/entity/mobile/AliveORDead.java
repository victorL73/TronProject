package fr.exia.tron.entity.mobile;

import fr.exia.tron.entity.Sprite;
/**AliveORDead is used to separate living entity and dead entity
 * @author  Victor Lerivray
 * @version 1.0
 */

public abstract class AliveORDead extends MobileEntity {
    /**this constructor gives the sprite to entity
     *
     * @param sprite
     */
    AliveORDead(Sprite sprite){
        super(sprite);
    }
}
