package fr.exia.tron.controller;

import fr.exia.tron.contract.ITronController;
import fr.exia.tron.contract.IModel;
import fr.exia.tron.contract.IView;
import fr.exia.tron.contract.UserOrder;

/**

 * The Class Controller.
 * The Class tronController.
 * @author Victor Lerivray
 * @version 1.0


 */
public final class tronController implements ITronController {
    /** The view. */
    private IView view;

    /** The model. */
    private IModel model;
/**Position of the character in X*/
    private int characterX = 1;
/** Position of the lightCircle1 in Y*/
    private int characterY = 1;
    /**Position of the character in X*/
    private int character2X = 1;
    /** Position of the lightCircle1 in Y*/
    private int character2Y = 1;
/** The level*/
    private int level ;
/** Check if something has moved*/
    private boolean hasMoved;

    /**
     * Instantiates a new controller.
     *
     * @param view
     *          the view
     * @param model
     *          the model
     */
    public tronController(final IView view, final IModel model)  {
        this.setView(view);
        this.setModel(model);
    }

    /**
     * Sets the view.
     *
     * @param pview
     *            the new view
     */
    private void setView(final IView pview) {
        this.view = pview;
    }

    /**
     * Sets the model.
     *
     * @param model
     *          the new model
     */
    private void setModel(final IModel model) {
        this.model = model;
    }

    /**
     * This method set number of diamond for earch level and the spawn of the player
     * @param userOrder
     */
    public void orderPerform(final UserOrder userOrder) {
        switch (userOrder) {
            case L1:
                level = this.model.getMap().getLevel();
                this.model.loadMap(this.model.getMap().getLevel());
                this.model.getMap().setLevel(level);
                switch(this.model.getMap().getLevel()) {
                    case 1 :
                        //Level when you lose the game
                        this.characterX = 1;//Positioning of the player in X on the MAP at the start
                        this.characterY = 1;//Positioning of the player in Y on the MAP at the start
                        this.character2X = 1;//Positioning of the player in X on the MAP at the start
                        this.character2Y = 1;//Positioning of the player in Y on the MAP at the start
                        this.model.getMap().setLevel(1);
                        System.out.println("You lose !");
                        break;
                    case 2 :
                        System.out.println("You are on the Level 1 ! GOOD LUCK");
                        //Level 1
                        this.characterX = 2;//Positioning of the player in X on the MAP at the start
                        this.characterY = 2;//Positioning of the player in Y on the MAP at the start
                        this.character2X = 29;//Positioning of the player in X on the MAP at the start
                        this.character2Y = 29;//Positioning of the player in Y on the MAP at the start
                        break;
                }
                break;

            case UP:
                //Movement up
                hasMoved = this.model.getMap().characterGoesUp(this.model.getMap().getOnTheMapXY(characterX, characterY), characterX, characterY);
                if (hasMoved) {
                    characterY--;
                }
                break;
            case DOWN:
                //Movement down
                hasMoved = this.model.getMap().characterGoesDown(this.model.getMap().getOnTheMapXY(characterX, characterY), characterX, characterY);
                if (hasMoved) {
                    characterY++;
                }
                break;
            case LEFT:
                //Movement left
                hasMoved = this.model.getMap().characterGoesLeft(this.model.getMap().getOnTheMapXY(characterX, characterY), characterX, characterY);
                if (hasMoved) {
                    characterX--;
                }
                break;
            case RIGHT:
                //Movement right
                hasMoved = this.model.getMap().characterGoesRight(this.model.getMap().getOnTheMapXY(characterX, characterY), characterX, characterY);
                if (hasMoved) {
                    characterX++;
                }
                break;
            case UP2:
                //Movement up
                hasMoved = this.model.getMap().character2GoesUp(this.model.getMap().getOnTheMapX2Y2(character2X, character2Y), character2X, character2Y);
                if (hasMoved) {
                    character2Y--;
                }
                break;
            case DOWN2:
                //Movement down
                hasMoved = this.model.getMap().character2GoesDown(this.model.getMap().getOnTheMapX2Y2(character2X, character2Y), character2X, character2Y);
                if (hasMoved) {
                    character2Y++;
                }
                break;
            case LEFT2:
                //Movement left
                hasMoved = this.model.getMap().character2GoesLeft(this.model.getMap().getOnTheMapX2Y2(character2X, character2Y), character2X, character2Y);
                if (hasMoved) {
                    character2X--;
                }
                break;
            case RIGHT2:
                //Movement right
                hasMoved = this.model.getMap().character2GoesRight(this.model.getMap().getOnTheMapX2Y2(character2X, character2Y), character2X, character2Y);
                if (hasMoved) {
                    character2X++;
                }
                break;
            default:
                break;

        }

    }


    /**
     * get the view
     * @return a view
     */
    public IView getView() {
        return view;
    }
    /**
     * get the model
     * @return a model
     */

    public IModel getModel() {
        return model;
    }
    /**
     * get the character position X
     * @return the position in X
     */
    public int getCharacterX() {
        return characterX;
    }
    /**
     * set the character in position X
     */

    public void setCharacterX(int characterX) {
        this.characterX = characterX;
    }
    /**
     * get the character position Y
     * @return the position in Y
     */

    public int getCharacterY() {
        return characterY;
    }
    /**
     * Set the position Y of the lightCircle1
     */

    public void setCharacterY(int characterY) {
        this.characterY = characterY;
    }
    /**
     * get the level
     * @return the level
     */
    public int getCharacter2X() {
        return characterX;
    }
    /**
     * set the character in position X
     */

    public void setCharacte2X(int characterX) {
        this.characterX = characterX;
    }
    /**
     * get the character position Y
     * @return the position in Y
     */

    public int getCharacter2Y() {
        return characterY;
    }
    /**
     * Set the position Y of the lightCircle1
     */

    public void setCharacter2Y(int characterY) {
        this.characterY = characterY;
    }
    /**
     * get the level
     * @return the level
     */
    public int getLevel() {
        return level;
    }
    /**
     * Set the level
     */
    public void setLevel(int level) {
        this.level = level;
    }

}