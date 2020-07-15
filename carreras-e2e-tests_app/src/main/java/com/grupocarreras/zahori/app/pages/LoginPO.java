package com.grupocarreras.zahori.app.pages;

import es.panel.cest.zahori.framework.Locator;
import es.panel.cest.zahori.framework.Page;
import es.panel.cest.zahori.framework.PageElement;
import es.panel.cest.zahori.framework.TestContext;

public class LoginPO extends Page {

    private static final long serialVersionUID = -3027498072954750755L;

    private PageElement username = new PageElement(this, "Usuario", Locator.id("username"));
    private PageElement password = new PageElement(this, "Contraseña", Locator.id("password"));
    private PageElement loginButton = new PageElement(this, "Botón login", Locator.className("submit"));

    public LoginPO(TestContext contextTC) {
        super(contextTC);
    }

    public void login(String user, String pass) {
        testContext.logInfo("Haciendo login con el usuario {0}", user);

        username.write(user);
        password.writePassword(pass);
        testContext.logStepPassedWithScreenshot("Formulario de login rellenado");

        loginButton.click();
    }

}
