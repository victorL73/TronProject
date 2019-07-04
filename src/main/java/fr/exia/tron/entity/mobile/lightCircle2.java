package fr.exia.tron.entity.mobile;
import fr.exia.tron.entity.Sprite;

/**lightCircle1 is the class for the hero2 on the map
 * @author  Victor Lerivray
 * @version 1.0
 */

public class lightCircle2 extends Alive {
//in our map we will replace the C by a image of character
    private static final Sprite SPRITE = new Sprite('L',"LightC2up.png");

    /** lightCircle1() is used for give the sprite and he is also the constructor
     *
     */
    public lightCircle2(){
        super(SPRITE);
    }
    /** this method is used when a entity has to be penetrable*/
    @Override
    public void permeability(){

    }
}
