package fr.exia.tron.entity;

import fr.exia.tron.contract.IMap;
import fr.exia.tron.contract.IEntity;
import fr.exia.tron.contract.IPermeability;
import fr.exia.tron.entity.motionless.light1;
import fr.exia.tron.entity.motionless.light2;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Observable;
import java.util.Timer;
import java.util.TimerTask;

/**the class MAP has all the method for the movement of entity, the generation of the map and all the thing on the map like rock/monster
 * @author  Victor Lerivray
 * @version 1.0
 */
public class Map extends Observable implements IMap {
    /**
     * The width.
     */
    private int width;

    /**
     * The height.
     */
    private int height;

    /**
     * The on the map.
     */
    private IEntity[][] onTheMap;
    /**
     * the time
     */
    private int time = 120;



    /**
     * The latest direction the first monster took.
     */
    private int latestWhereToMove1 = 1;

    /**
     * The latest direction the second monster took.
     */
    private int latestWhereToMove2 = 1;

    /**
     * The latest direction the third monster took.
     */
    private int latestWhereToMove3 = 1;

    /**
     * The number the method updateMap was used.
     */
    private int numberOfUpdates = 0;

    /**
     * the level
     */
    private int level = 2;

    /**
     * the number of lives the hero has
     */
    private int numberOfLives = 3;

    /**
     * A random number between 0 and 1, used to make random decision
     */
    private double random;

    /**
     * To prevent the blocks to keep the is Falling operator to true even when they're not falling
     */
    private int debug = 0;

    Timer timer;

    //timer
    TimerTask task = new TimerTask() {
        public void run() {
            updateMap();
        }
    };

    /**
     * Method to get the level
     *
     * @return
     */
    public int getLevel() {
        return level;
    }

    /**
     * Method to set the level
     *
     * @return
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * get the map
     *
     * @return the map
     */
    public IEntity[][] getOnTheMap() {
        return onTheMap;// returns the map
    }

    /**
     * we create new object of time and of map
     */
    public Map() {
        timer = new Timer();
        onTheMap = new IEntity[1][1];
    }

    /**
     * we set the dimension of the map
     *
     * @param width
     * @param height
     */
    public Map(int width, int height) {
        timer = new Timer();
        timer.schedule(task, 200, 200);
        this.setWidth(width);
        this.setHeight(height);
        onTheMap = new Entity[width][height];
    }

    /**
     * Method to get the width of the map
     *
     * @return the width
     */

    public final int getWidth() {
        return this.width;//return the width
    }

    /**
     * Sets the width.
     *
     * @param width the new width
     */
    public void setWidth(final int width) {
        this.width = width;//sets the width
    }

    /**
     * Method to get the height of the map
     *
     * @return the height
     */

    public final int getHeight() {
        return this.height;//return the height
    }

    /**
     * Sets the height.
     *
     * @param height the new height
     */
    public void setHeight(final int height) {
        this.height = height;//sets the height
    }

    /**
     * We get the map on x and y
     *
     * @param x the x
     * @param y the y
     * @return
     */
    public final IEntity getOnTheMapXY(final int x, final int y) {
        if (x <= width - 1 && y <= height - 1) {//if the coordinates are on the map
            return this.onTheMap[x][y];//returns the entity
        }
        return null;
    }

    public final IEntity getOnTheMapX2Y2(final int x2, final int y2) {
        if (x2 <= width - 1 && y2 <= height - 1) {//if the coordinates are on the map
            return this.onTheMap[x2][y2];//returns the entity
        }
        return null;
    }

    /**
     * Sets the on the map XY.
     *
     * @param entity the element
     * @param x      the x
     * @param y      the y
     */
    public void setOnTheMapXY(final IEntity entity, final int x, final int y) {
        this.onTheMap[x][y] = entity; // sets the entity
    }

    public void setOnTheMapX2Y2(final IEntity entity, final int x2, final int y2) {
        this.onTheMap[x2][y2] = entity; // sets the entity
    }

    /**
     * Method to kill the player
     *
     * @param x
     * @param y
     */
    private void killPlayer(int x, int y) {
        try {

            Robot r;
            r = new Robot();
            //    level--;
            Thread.sleep(1000);
            r.keyPress(KeyEvent.VK_1);//System.out.println("Robot press");	debug
            Thread.sleep(100);
        } catch (AWTException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }



    /**
     * generic function for moving left
     *
     * @param x
     * @param y
     */
    public void goesLeft(int x, int y) {
        this.onTheMap[x - 1][y] = this.onTheMap[x][y];//the entity moves
        this.onTheMap[x][y] = new light1();//when an entity leaves a space, it creates a new empty entity on the space
        //		System.out.println("Went left");		//debug
    }

    public void goesLeft2(int x2, int y2) {
        this.onTheMap[x2 - 1][y2] = this.onTheMap[x2][y2];//the entity moves
        this.onTheMap[x2][y2] = new light2();//when an entity leaves a space, it creates a new empty entity on the space
        //		System.out.println("Went left");		//debug
    }

    /**
     * generic function for moving right
     *
     * @param x
     * @param y
     */
    public void goesRight(int x, int y) {
        this.onTheMap[x + 1][y] = this.onTheMap[x][y];//the entity moves
        this.onTheMap[x][y] = new light1();//when an entity leaves a space, it creates a new empty entity on the space
        //		System.out.println("Went right");		//debug
    }

    public void goesRight2(int x2, int y2) {
        this.onTheMap[x2 + 1][y2] = this.onTheMap[x2][y2];//the entity moves
        this.onTheMap[x2][y2] = new light2();//when an entity leaves a space, it creates a new empty entity on the space
        //		System.out.println("Went right");		//debug
    }

    /**
     * generic function for moving up
     *
     * @param x
     * @param y
     */
    public void goesUP(int x, int y) {
        this.onTheMap[x][y - 1] = this.onTheMap[x][y];//the entity moves
        this.onTheMap[x][y] = new light1();//when an entity leaves a space, it creates a new empty entity on the space
        //		System.out.println("Went up");		//debug
    }

    public void goesUP2(int x2, int y2) {
        this.onTheMap[x2][y2 - 1] = this.onTheMap[x2][y2];//the entity moves
        this.onTheMap[x2][y2] = new light2();//when an entity leaves a space, it creates a new empty entity on the space
        //		System.out.println("Went up");		//debug
    }

    /**
     * generic function for moving down
     *
     * @param x
     * @param y
     */
    public void goesDown(int x, int y) {
        this.onTheMap[x][y + 1] = this.onTheMap[x][y];//the entity moves
        this.onTheMap[x][y] = new light1();//when an entity leaves a space, it creates a new empty entity on the space
        //		System.out.println("Went down");		//debug
    }

    public void goesDown2(int x2, int y2) {
        this.onTheMap[x2][y2 + 1] = this.onTheMap[x2][y2];//the entity moves
        this.onTheMap[x2][y2] = new light2();//when an entity leaves a space, it creates a new empty entity on the space
        //		System.out.println("Went down");		//debug
    }
    /**
     * Method to get the time
     *
     * @return
     */
    public int getTimeSecond() {
        return time;
    }


    /**
     * specific function for the character to move up
     *
     * @param character
     * @param x
     * @param y
     * @return the has moved
     */
    public boolean characterGoesUp(IEntity character, int x, int y) {

        IEntity topEntity = this.getOnTheMapXY(x, y - 1);//checks whant's the entity where the character wanted to move
        if (topEntity instanceof IPermeability) {//if the entity is penetrable
            goesUP(x, y);//move the character
            return true;//the character has moved
        }
        return false;//the character hasn't moved
    }

    /**
     * specific function for the character to move down
     *
     * @param character
     * @param x
     * @param y
     * @return the has moved
     */
    public boolean characterGoesDown(IEntity character, int x, int y) {
        IEntity downEntity = this.getOnTheMapXY(x, y + 1);//checks what's the entity where the character wanted to move
        if (downEntity instanceof IPermeability) {//if the entity is penetrable
            goesDown(x, y);//the character move down
            return true;//the character has moved
        }
        return false;//the character hasn't moved
    }

    /**
     * specific function for the character to move left
     *
     * @param character
     * @param x
     * @param y
     * @return the has moved
     */
    public boolean characterGoesLeft(IEntity character, int x, int y) {
        IEntity leftEntity = this.getOnTheMapXY(x - 1, y);//checks what's the entity where the character wanted to move
        if (leftEntity instanceof IPermeability) {//if the entity is penetrable
            goesLeft(x, y);//the character moves
            return true;//the character has moved
        }
        return false;//the character hasn't moved
    }

    /**
     * specific function for the character to move right
     *
     * @param character
     * @param x
     * @param y
     * @return the has moved
     */
    public boolean characterGoesRight(IEntity character, int x, int y) {
        IEntity rightEntity = this.getOnTheMapXY(x + 1, y);//checks whant's the entity where the character wanted to move
        if (rightEntity instanceof IPermeability) {//if the entity is penetrable
            goesRight(x, y);//the character moves
            return true;
        }
        return false;//the character hasn't moved
    }

    public boolean character2GoesUp(IEntity character2, int x2, int y2) {

        IEntity topEntity = this.getOnTheMapX2Y2(x2, y2 - 1);//checks whant's the entity where the character wanted to move
        if (topEntity instanceof IPermeability) {//if the entity is penetrable
            goesUP2(x2, y2);//move the character
            return true;//the character has moved
        }
        return false;//the character hasn't moved
    }

    /**
     * specific function for the character to move down
     *
     * @param character2
     * @param x2
     * @param y2
     */
    public boolean character2GoesDown(IEntity character2, int x2, int y2) {
        IEntity downEntity = this.getOnTheMapX2Y2(x2, y2 + 1);//checks what's the entity where the character wanted to move
        if (downEntity instanceof IPermeability) {//if the entity is penetrable
            goesDown2(x2, y2);//the character move down
            return true;//the character has moved
        }
        return false;//the character hasn't moved
    }

    /**
     * specific function for the character to move left
     *
     * @param character2
     * @param x2
     * @param y2
     */
    public boolean character2GoesLeft(IEntity character2, int x2, int y2) {
        IEntity leftEntity = this.getOnTheMapX2Y2(x2 - 1, y2);//checks what's the entity where the character wanted to move
        if (leftEntity instanceof IPermeability) {//if the entity is penetrable
            goesLeft2(x2, y2);//the character moves
            return true;//the character has moved
        }
        return false;//the character hasn't moved
    }

    /**
     * specific function for the character to move right
     *
     * @param character2
     * @param x2
     * @param y2
     */
    public boolean character2GoesRight(IEntity character2, int x2, int y2) {
        IEntity rightEntity = this.getOnTheMapX2Y2(x2 + 1, y2);//checks whant's the entity where the character wanted to move
        if (rightEntity instanceof IPermeability) {//if the entity is penetrable
            goesRight2(x2, y2);//the character moves
            return true;
        }
        return false;//the character hasn't moved
    }

    /**
     * Method to update the map and apply all the change
     *
     * @return
     */
    public int updateMap() {
        numberOfUpdates++;
        setChanged();
        notifyObservers();
        return 0;
    }

    /**
     * get the observable
     *
     * @return the observable
     */
    public Observable getObservable() {
        // TODO Auto-generated method stub
        return this;
    }

}