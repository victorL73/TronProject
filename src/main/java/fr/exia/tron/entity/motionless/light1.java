package fr.exia.tron.entity.motionless;

import fr.exia.tron.contract.IPermeability;
import fr.exia.tron.entity.Sprite;


public class light1 extends MotionlessEntity implements IPermeability {


    private static final Sprite SPRITE = new Sprite('B',"light1.png");


    public light1() {
        super(SPRITE);
    }
        @Override
        public void permeability(){

    }
}
