package com.grupocarreras.zahori.app.pages;

import es.panel.cest.zahori.framework.Locator;
import es.panel.cest.zahori.framework.Page;
import es.panel.cest.zahori.framework.PageElement;
import es.panel.cest.zahori.framework.TestContext;

public class LoginPO extends Page {

    private static final long serialVersionUID = -3027498072954750755L;

    private PageElement mensajeError = new PageElement(this, "Mensaje de error en login", Locator.xpath("//span[@class='message-text']"));

    public LoginPO(TestContext contextTC) {
        super(contextTC);
    }

    public void login(String user, String pass) {
        PageElement username = new PageElement(this, "Usuario", Locator.id("username"));
        username.write(user);

        PageElement password = new PageElement(this, "Contraseña", Locator.id("password"));
        password.writePassword(pass);

        PageElement loginButton = new PageElement(this, "Botón login", Locator.className("submit"));
        loginButton.click();
    }

    public boolean hayError() {
        return mensajeError.isVisible();
    }

    public String getMensajeError() {
        return mensajeError.getText();
    }

}
