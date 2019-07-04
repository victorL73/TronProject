package fr.exia.tron.contract;


import fr.exia.tron.entity.Map;

import java.util.Observable;





/**
 * The Interface IModel.
 *
 * @author Victor Lerivray
 * @version 1.0
 */
public interface IModel {

    /**
     * Gets the Map.
     *
     * @return the MAP
     */
    Map getMap();

    /** Load the MAP
     *
     * @param id
     */
    void loadMap(int id);

    /**
     * Gets the observable.
     *
     * @return the observable
     */
    Observable getObservable();


}