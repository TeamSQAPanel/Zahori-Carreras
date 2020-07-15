package com.grupocarreras.zahori.app.pages;

import es.panel.cest.zahori.framework.Locator;
import es.panel.cest.zahori.framework.Page;
import es.panel.cest.zahori.framework.PageElement;
import es.panel.cest.zahori.framework.TestContext;
import es.panel.cest.zahori.utils.Pause;

public class MenuPO extends Page {

    private static final long serialVersionUID = -3027498072954750756L;

    public MenuPO(TestContext contextTC) {
        super(contextTC);
    }

    public void entradaPedidosRecFab() {
        entradaPedidos();

        PageElement recFab = new PageElement(this, "Menú REC-FAB", Locator.xpath("//a[text()='REC-FAB']"));
        Pause.pause(1);
        recFab.scrollMiddle();
        Pause.pause(1);
        recFab.click();
    }

    public void entradaPedidosRecFab(String baseUrl) {
        testContext.getBrowser().loadPage(baseUrl + "entradapedidos-client/#/recfab/list");
    }

    public void entradaPedidosDocumentos() {
        entradaPedidos();

        PageElement recFab = new PageElement(this, "Menú Documentos", Locator.xpath("//a[text()='Documentos']"));
        recFab.click();
    }

    private void entradaPedidos() {
        PageElement entradaPedidos = new PageElement(this, "Menú Entrada Pedidos",
                Locator.xpath("//*[@class='item is-expandable' and contains(text(),'app.tabTitle.entradaPedidos')]"));
        entradaPedidos.click();
    }

}
