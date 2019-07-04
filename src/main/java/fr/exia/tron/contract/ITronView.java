package fr.exia.tron.contract;

/**
 *The Interface ITronView
 *
 * @author Victor Lerivray
 * @version 1.0
 */
public interface ITronView {

    /**
     * Display message.
     *
     * @param message
     *            the message
     */
    void displayMessage(String message);

    /**
     * Follow myPerso.
     */
    void followMyCharacter();
    IMap getMap();

}
