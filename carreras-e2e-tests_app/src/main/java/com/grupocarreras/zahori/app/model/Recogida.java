package com.grupocarreras.zahori.app.model;

import java.util.Map;

import com.grupocarreras.zahori.app.data.Static;

public class Recogida {

    private String numAlbaran;
    private String codigoCompania;
    private String codigoDivision;
    private String fecha;
    private String horaInicio;
    private String horaFin;
    private String temperatura;
    private String remitente;
    private String destinatario;
    private String bultos;
    private String kilos;

    public Recogida(Map<String, String> testData) {
        numAlbaran = testData.get(Static.NUM_ALBARAN);
        codigoCompania = testData.get(Static.CODIGO_COMPANIA);
        codigoDivision = testData.get(Static.CODIGO_DIVISION);
        fecha = testData.get(Static.FECHA);
        horaInicio = testData.get(Static.HORA_INICIO);
        horaFin = testData.get(Static.HORA_FIN);
        temperatura = testData.get(Static.TEMPERATURA);
        remitente = testData.get(Static.REMITENTE);
        destinatario = testData.get(Static.DESTINATARIO);
        bultos = testData.get(Static.BULTOS);
        kilos = testData.get(Static.KILOS);
    }

    @Override
    public String toString() {
        return "Recogida [numAlbaran=" + numAlbaran + ", codigoCompania=" + codigoCompania + ", codigoDivision=" + codigoDivision + ", fecha=" + fecha
                + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + ", temperatura=" + temperatura + ", remitente=" + remitente + ", destinatario="
                + destinatario + ", bultos=" + bultos + ", kilos=" + kilos + "]";
    }

    public String getNumAlbaran() {
        return numAlbaran;
    }

    public void setNumAlbaran(String numAlbaran) {
        this.numAlbaran = numAlbaran;
    }

    public String getCodigoCompania() {
        return codigoCompania;
    }

    public void setCodigoCompania(String codigoCompania) {
        this.codigoCompania = codigoCompania;
    }

    public String getCodigoDivision() {
        return codigoDivision;
    }

    public void setCodigoDivision(String codigoDivision) {
        this.codigoDivision = codigoDivision;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getBultos() {
        return bultos;
    }

    public void setBultos(String bultos) {
        this.bultos = bultos;
    }

    public String getKilos() {
        return kilos;
    }

    public void setKilos(String kilos) {
        this.kilos = kilos;
    }

}
