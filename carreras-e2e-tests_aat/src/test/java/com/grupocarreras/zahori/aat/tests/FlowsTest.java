/*
 * Panel Sistemas Informaticos, S.L 
 * Center of Excellence in SQA and Testing.
 */

package com.grupocarreras.zahori.aat.tests;

import es.panel.cest.zahori.framework.BaseTest;

import com.grupocarreras.zahori.app.data.TestCaseData;
import com.grupocarreras.zahori.app.flows.RecogidasFlow;

public class FlowsTest extends BaseTest {

    public void test() {

        /* LOAD TEST DATA */
        TestCaseData testData = new TestCaseData(testContext);

        /* LOAD URL */
        testContext.getBrowser().loadPage(testData.url);

        /* FLOW EXECUTION */
        RecogidasFlow flujoRecogidas = new RecogidasFlow(testContext, testData);
        flujoRecogidas.execute();
    }
}
