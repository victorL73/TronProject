package fr.exia.tron.model;

import fr.exia.tron.contract.IModel;

import fr.exia.tron.entity.Map;

import java.util.Observable;

/**the class Model is use for get the map and set it and load it
 * @author  Victor Lerivray
 * @version 1.0
 */
public final class Model extends Observable implements IModel {
    /** The map. */
    private Map map;

    /**
     * Instantiates a new model.
     */
    public Model() {
        this.map = new Map();
    }

    /**
     * Gets the map.
     *
     * @return the map
     */
    public Map getMap() {
        return this.map;
    }

    /** sets the map
     *
     * @param map
     */
    private void setMap(final Map map) {
        this.map = map;
        this.setChanged();
        this.notifyObservers();
    }

    /** Load the map
     *
     * @param id
     */
    public void loadMap(final int id) {
        final DAOLevel daoMap = new DAOLevel();
        this.setMap(daoMap.findMapOnDataBase(id));


    }

    /**
     * Gets the observable.
     *
     * @return the observable
     */

    public Observable getObservable() {
        return this;
    }
}