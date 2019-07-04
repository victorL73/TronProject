package fr.exia.tron.entity.mobile;
import fr.exia.tron.entity.Sprite;
/**lightCircle1 is the class for the hero1 on the map
 * @author  Victor Lerivray
 * @version 1.0
 */

public class lightCircle1 extends Alive {
//in our map we will replace the C by a image of character
    private static final Sprite SPRITE = new Sprite('C',"LightC1up.png");

    /** lightCircle1() is used for give the sprite and he is also the constructor
     *
     */
    public lightCircle1(){
        super(SPRITE);
    }
    /** this method is used when a entity has to be penetrable*/
    @Override
    public void permeability(){

    }
}
