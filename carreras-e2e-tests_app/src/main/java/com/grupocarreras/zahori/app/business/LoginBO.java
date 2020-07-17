package com.grupocarreras.zahori.app.business;

import es.panel.cest.zahori.framework.TestContext;

import com.grupocarreras.zahori.app.model.Login;
import com.grupocarreras.zahori.app.pages.LoginPO;

public class LoginBO {

    private TestContext testContext;

    public LoginBO(TestContext testContext) {
        this.testContext = testContext;
    }

    public void login(Login login) {
        LoginPO loginPO = new LoginPO(testContext);
        loginPO.login(login.getUsername(), login.getPassword());

        if (loginPO.hayError()) {
            testContext.logStepFailedWithScreenshot("login.ko", login.getUsername(), loginPO.getMensajeError());
        } else {
            testContext.logStepPassedWithScreenshot("login.ok", login.getUsername());
        }
    }
}
