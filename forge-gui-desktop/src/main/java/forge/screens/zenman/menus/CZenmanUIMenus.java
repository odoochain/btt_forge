package forge.screens.zenman.menus;

import forge.screens.workshop.menus.WorkshopFileMenu;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Gets the menus associated with the Game screen.
 *
 */
public class CZenmanUIMenus {

    private final boolean SHOW_ICONS = true;

    public List<JMenu> getMenus() {
        List<JMenu> menus = new ArrayList<>();
        menus.add(ZenmanFileMenu.getMenu(SHOW_ICONS));
        return menus;
    }
}
