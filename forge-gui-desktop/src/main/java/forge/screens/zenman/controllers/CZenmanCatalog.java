package forge.screens.zenman.controllers;

import forge.gui.framework.ICDoc;
import forge.itemmanager.ItemManagerConfig;
import forge.screens.workshop.views.VWorkshopCatalog;
import forge.screens.zenman.views.VZenmanCatalog;

/**
 * Controls the "card catalog" panel in the workshop UI.
 *
 * <br><br><i>(C at beginning of class name denotes a control class.)</i>
 *
 */
public enum CZenmanCatalog implements ICDoc {
    /** */
    SINGLETON_INSTANCE;

    CZenmanCatalog() {
    }

    //========== Overridden methods

    @Override
    public void register() {
    }

    /* (non-Javadoc)
     * @see forge.gui.framework.ICDoc#initialize()
     */
    @Override
    public void initialize() {
    }

    /* (non-Javadoc)
     * @see forge.gui.framework.ICDoc#update()
     */
    @Override
    public void update() {
        VZenmanCatalog.SINGLETON_INSTANCE.getCardManager().setup(ItemManagerConfig.ZENMAN_CATALOG);
        //TODO: Restore previously selected card
    }
}
