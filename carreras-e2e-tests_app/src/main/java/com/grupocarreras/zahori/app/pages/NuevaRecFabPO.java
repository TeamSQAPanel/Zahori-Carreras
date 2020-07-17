package com.grupocarreras.zahori.app.pages;

import es.panel.cest.zahori.framework.Locator;
import es.panel.cest.zahori.framework.Page;
import es.panel.cest.zahori.framework.PageElement;
import es.panel.cest.zahori.framework.TestContext;

import com.grupocarreras.zahori.app.model.Recogida;

public class NuevaRecFabPO extends Page {

    private static final long serialVersionUID = -3027498072954750757L;

    public NuevaRecFabPO(TestContext contextTC) {
        super(contextTC);
    }

    public void rellenarFormulario(Recogida recogida) {
        escribirNumAlbaran(recogida.getNumAlbaran());
        escribirCodigoCompania(recogida.getCodigoCompania());
        escribirCodigoDivision(recogida.getCodigoDivision());
        escribirFecha(recogida.getFecha());
        escribirHoraInicio(recogida.getHoraInicio());
        escribirHoraFin(recogida.getHoraFin());

        seleccionarRemitente(recogida.getRemitente());
        seleccionarDestinatario(recogida.getDestinatario());

        escribirBultos(recogida.getBultos());
        escribirKilos(recogida.getKilos());
    }

    private void escribirNumAlbaran(String numAlbaran) {
        PageElement albaranLabel = new PageElement(this, "Label Número de albarán", Locator.xpath("//label[@for='documentNumber']"));
        albaranLabel.click();

        PageElement albaranByName = new PageElement(this, "Label Número de albarán", Locator.name("documentNumber"));
        // albaranByName.click();
        albaranByName.write(numAlbaran);

        // PageElement albaran = new PageElement(this, "Número de albarán", Locator.id("documentNumber"));
        // albaran.click();
        // albaran.write(numAlbaran);
    }

    private void escribirCodigoCompania(String compania) {
        PageElement codigoCompania = new PageElement(this, "Código de compañia", Locator.id("companyCode"));
        codigoCompania.write(compania);
    }

    private void escribirCodigoDivision(String division) {
        PageElement codigoDivision = new PageElement(this, "Código división", Locator.id("divisionCode"));
        codigoDivision.write(division);
    }

    private void escribirFecha(String fecha) {
        PageElement fechaPE = new PageElement(this, "Fecha", Locator.id("date"));
        fechaPE.write(fecha);
    }

    private void escribirHoraInicio(String horaInicio) {
        PageElement horaInicioPE = new PageElement(this, "Hora de inicio", Locator.id("startDate"));
        horaInicioPE.write(horaInicio);
    }

    private void escribirHoraFin(String horaFin) {
        PageElement horaFinPE = new PageElement(this, "Hora de fin", Locator.id("endDate"));
        horaFinPE.write(horaFin);
    }

    private void seleccionarRemitente(String remitente) {
        PageElement buscarConsignatario = new PageElement(this, "Buscar consignatario remitente", Locator.xpath("(//i[contains(text(),'search')])[2]"));
        buscarConsignatario.click();

        PageElement elegirOpcion = new PageElement(this, "Elegir consignatario " + remitente,
                Locator.xpath(" *[@class='grid']span[text()='" + remitente + "']"));
        elegirOpcion.click();
    }

    private void seleccionarDestinatario(String destinatario) {
        PageElement buscarConsignatario = new PageElement(this, "Buscar consignatario destinatario", Locator.xpath("(//i[contains(text(),'search')])[3]"));
        buscarConsignatario.click();

        PageElement elegirOpcion = new PageElement(this, "Elegir consignatario " + destinatario,
                Locator.xpath(" *[@class='grid']span[text()='" + destinatario + "']"));
        elegirOpcion.click();
    }

    private void escribirBultos(String bultos) {
        PageElement bultosPE = new PageElement(this, "Bultos", Locator.id("packs"));
        bultosPE.write(bultos);
    }

    private void escribirKilos(String kilos) {
        PageElement kilosPE = new PageElement(this, "Kilos", Locator.id("kilos"));
        kilosPE.write(kilos);
    }

}
