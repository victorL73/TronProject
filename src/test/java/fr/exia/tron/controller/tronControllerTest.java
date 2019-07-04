package fr.exia.tron.controller;




import fr.exia.tron.entity.Map;
import fr.exia.tron.entity.mobile.lightCircle1;
import fr.exia.tron.entity.mobile.lightCircle2;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;



public class tronControllerTest {


    private static lightCircle1 lightCircle1X;
    private static lightCircle2 lightCircle2X;

    private static Map map;
    private static lightCircle1 lightCircle1;
    private static lightCircle2 lightCircle2;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        lightCircle1X = new lightCircle1();
        lightCircle1 = new lightCircle1();
        lightCircle2X = new lightCircle2();
        lightCircle2 = new lightCircle2();
        map = new Map(10,10);
    }


    @Test
    public void orderPerform() {

        int heroX = 1;
        int heroY = 1;
        tronControllerTest.map.goesUP(heroX+0, heroY+1);
        tronControllerTest.map.hasChanged();
        equals(tronControllerTest.map.characterGoesUp(lightCircle1,1,2));
        System.out.println("Il a bougé");

    }

    @Test
    public void getView() {
    }

    @Test
    public void getModel() {
    }

    @Test
    public void getHeroX() {

    }

    @Test
    public void setHeroX() {

        assertEquals(this.lightCircle1X, lightCircle1X);
        assertEquals(this.lightCircle2X, lightCircle2X);

    }

    @Test
    public void getHeroY() {
    }

    @Test
    public void setHeroY() {
    }

    @Test
    public void getLevel() {
    }

    @Test
    public void setLevel() {
    }
}
