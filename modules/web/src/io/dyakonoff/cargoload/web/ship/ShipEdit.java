package io.dyakonoff.cargoload.web.ship;

import com.haulmont.cuba.core.entity.Entity;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.LoadContext;
import com.haulmont.cuba.gui.components.AbstractEditor;
import io.dyakonoff.cargoload.entity.Ship;

import javax.inject.Inject;

public class ShipEdit extends AbstractEditor<Ship> {
    @Inject
    private DataManager dataManager;


    public void setItem(Entity item) {
        Ship ship = dataManager.load(LoadContext.create(Ship.class)
                .setQuery(LoadContext.createQuery("SELECT s FROM cargoload$Ship s"))
                .setView("_local"));

        if (ship == null)
            super.setItem(item);
        else
            super.setItem(ship);
    }
}