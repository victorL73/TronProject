package fr.exia.tron;

import fr.exia.tron.contract.UserOrder;
import fr.exia.tron.controller.tronController;
import fr.exia.tron.model.Model;
import fr.exia.tron.view.View;

/**
 * The tronMAIN is the class for launch the program
 *
 * @author Victor Lerivray
 * @version 1.0
 */
public abstract class tronMAIN {

    /**
     * the main fonction
     * @param args
     */
    public static void main(final String[] args){
        final Model model = new Model();
        final View view = new View(model);
        final tronController tronController = new tronController(view, model);
        view.setController(tronController);
        tronController.orderPerform(UserOrder.L1);

    }
}
