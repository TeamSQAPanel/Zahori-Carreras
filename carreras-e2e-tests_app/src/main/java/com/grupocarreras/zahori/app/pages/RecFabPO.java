package com.grupocarreras.zahori.app.pages;

import es.panel.cest.zahori.framework.Locator;
import es.panel.cest.zahori.framework.Page;
import es.panel.cest.zahori.framework.PageElement;
import es.panel.cest.zahori.framework.TestContext;

public class RecFabPO extends Page {

    private static final long serialVersionUID = -3027498072954750756L;

    public RecFabPO(TestContext contextTC) {
        super(contextTC);
    }

    public void crearRecFab() {
        PageElement nuevaRecFab = new PageElement(this, "Botón Nueva REC-FAB", Locator.xpath("//button[contains(text(),'Nueva REC-FAB')]"));
        nuevaRecFab.click();
    }

}
