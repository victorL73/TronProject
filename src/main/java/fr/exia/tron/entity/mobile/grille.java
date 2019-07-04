package fr.exia.tron.entity.mobile;

import fr.exia.tron.contract.IPermeability;
import fr.exia.tron.entity.Sprite;

/**grille is the class for the grass block on the map
 * @author  Victor Lerivray
 * @version 1.0
 */


public class grille extends AliveORDead implements IPermeability {



    //in our map we will replace all the G by a image of grass
    private static final Sprite SPRITE = new Sprite('G',"background.png");
    /** grille() is used for give the sprite and he is also the constructor
     *
     */
    public grille() {
        super(SPRITE);
    }


    /** this method is used when a entity has to be penetrable*/

    public void permeability() {

    }
}
