package fr.exia.tron.entity.motionless;

import fr.exia.tron.contract.IPermeability;
import fr.exia.tron.entity.Sprite;


public class light2 extends MotionlessEntity implements IPermeability {


    private static final Sprite SPRITE = new Sprite('Y',"light2.png");


    public light2() {
        super(SPRITE);
    }
        @Override
        public void permeability(){

    }
}
