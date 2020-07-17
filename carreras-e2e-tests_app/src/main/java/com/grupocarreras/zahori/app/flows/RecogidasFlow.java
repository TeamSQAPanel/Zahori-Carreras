/*
 * Panel Sistemas Informaticos, S.L 
 * Center of Excellence in SQA and Testing.
 */

package com.grupocarreras.zahori.app.flows;

import es.panel.cest.zahori.framework.TestContext;

import com.grupocarreras.zahori.app.business.LoginBO;
import com.grupocarreras.zahori.app.data.TestCaseData;
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
        LoginBO loginBO = new LoginBO(testContext);
        loginBO.login(testData.login);

        MenuPO menu = new MenuPO(testContext);
        menu.entradaPedidosRecFab(testData.url);

        RecFabPO recFab = new RecFabPO(testContext);
        recFab.crearRecFab();

        NuevaRecFabPO nuevaRecFabPO = new NuevaRecFabPO(testContext);
        nuevaRecFabPO.rellenarFormulario(testData.recogida);
    }

}
