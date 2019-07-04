package fr.exia.tron.entity.motionless;

import fr.exia.tron.entity.Sprite;


public class UnbreakableWall extends MotionlessEntity {


    private static final Sprite SPRITE = new Sprite('U',"bordures.png");


    public UnbreakableWall() {
        super(SPRITE);
    }
}
