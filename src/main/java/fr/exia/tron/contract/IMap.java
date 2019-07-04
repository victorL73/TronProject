package fr.exia.tron.contract;


import java.util.Observable;

/**
 *The Interface IMap
 *
 * @author Victor Lerivray
 * @version 1.0
 */

public interface IMap {
    /**gets the Width
     *
     * @return the height
     */
    int getWidth();

    /**
     * Gets the height.
     *
     * @return the height
     */
    int getHeight();

    /**
     * Gets the on the MAP XY.
     *
     * @param x
     *            the x
     * @param y
     *            the y
     * @return the on the MAP XY
     */
    IEntity getOnTheMapXY(int x, int y);

    /** Get the Obervable
     *
     * @return Observable
     */
    Observable getObservable();
}