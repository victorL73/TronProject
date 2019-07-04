package fr.exia.tron.entity;


import fr.exia.tron.contract.IEntity;

import java.awt.*;
/**the class entity is for get and set the sprite of entities
 * @author Victor Lerivray
 * @version 1.0
 */
public abstract class Entity implements IEntity {
/** the sprite */
    private Sprite sprite;

    /**the constructor take the sprite of a entity
     *
     * @param sprite
     */
    public Entity(final Sprite sprite){
        this.setSprite(sprite);
    }

    /** we get the sprite
     *
     * @return the sprite
     */
     public final Sprite getSprite(){
        return this.sprite;
     }

    /** we set the sprite
     *
     * @param sprite
     */
     protected final void  setSprite(final Sprite sprite){
        this.sprite = sprite;
    }

    /** we get the image
     *
     * @return return the image
     */
      public final Image getImage(){
        return this.getSprite().getImage();
    }


}




