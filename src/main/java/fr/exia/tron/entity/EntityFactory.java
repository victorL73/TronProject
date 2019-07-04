package fr.exia.tron.entity;

import fr.exia.tron.entity.mobile.lightCircle1;
import fr.exia.tron.entity.mobile.lightCircle2;
import fr.exia.tron.entity.mobile.grille;
import fr.exia.tron.entity.motionless.light1;
import fr.exia.tron.entity.motionless.UnbreakableWall;
/**the class entityFactory is used for create a bord of entity
 * @author  Victor Lerivray
 * @version 1.0
 */
public abstract class EntityFactory {

    /** we instantiate a new object of the entity*/
    private static grille grille = new grille();
    /** we instantiate a new object of the entity*/
    private static light1 BROKEN_GRASS = new light1();
    /** we instantiate a new object of the entity*/
    private static UnbreakableWall UNBREAKABLE_WALL = new UnbreakableWall();
    /** we instantiate a new object of the entity*/
    private static lightCircle1 lightCircle1 = new lightCircle1();
    /** we instantiate a new object of the entity*/
    private static lightCircle2 lightCircle2 = new lightCircle2();

/** we create a board of entity*/
    private static Entity[] Entities = {
        grille,
            BROKEN_GRASS,
            UNBREAKABLE_WALL,
        lightCircle1,
        lightCircle2,
    };


    /** getFromFileSymbol transform the letter of a entity into a sprite
     * she also instantiates an entity
     * @param fileSymbol
     * @return Entity
     */
    public static Entity getFromFileSymbol(final char fileSymbol){
        for(final Entity Entity : Entities){
            if(Entity.getSprite().getConsoleImage() == fileSymbol){
                return Entity;
            }
        }
        return BROKEN_GRASS;
    }




}