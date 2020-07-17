/*
 * Panel Sistemas Informaticos, S.L 
 * Center of Excellence in SQA and Testing.
 */

package com.grupocarreras.zahori.app.flows;

import es.panel.cest.zahori.framework.TestContext;

import com.grupocarreras.zahori.app.data.TestCaseData;
import com.grupocarreras.zahori.app.pages.LoginPO;
import com.grupocarreras.zahori.app.pages.MenuPO;
import com.grupocarreras.zahori.app.pages.NuevaRecFabPO;
import com.grupocarreras.zahori.app.pages.RecFabPO;

public class RecogidasFlow {

    /** The TestCase context. */
    private TestContext testContext;

    /** The TestCase data */
    private TestCaseData testData;

    /**
     * Flow constructor
     * 
     * @param testContext
     * @param testData
     */
    public RecogidasFlow(TestContext testContext, TestCaseData testData) {
        this.testContext = testContext;
        this.testData = testData;
    }

    public void execute() {
        LoginPO loginPO = new LoginPO(testContext);
        loginPO.login(testData.login.getUsername(), testData.login.getPassword());

        testContext.logStepPassedWithScreenshot("login.ok", testData.login.getUsername());

        MenuPO menu = new MenuPO(testContext);
        menu.entradaPedidosRecFab(testData.url);

        RecFabPO recFab = new RecFabPO(testContext);
        recFab.crearRecFab();

        NuevaRecFabPO nuevaRecFabPO = new NuevaRecFabPO(testContext);
        nuevaRecFabPO.rellenarFormulario(testData.recogida);
    }

}
