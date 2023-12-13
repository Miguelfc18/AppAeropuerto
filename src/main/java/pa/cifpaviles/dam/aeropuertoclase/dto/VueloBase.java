/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pa.cifpaviles.dam.aeropuertoclase.dto;

import java.util.Date;
import java.sql.Time;

/**
 *
 * @author mariorl
 */
public class VueloBase {
    private String codigoVuelo;
    private String codigoaeropuertoOrigen;
    private String codigoaeropuertoDestino;
    private int numPlazas;
    private Date horaOficialSalida;
    private Date horaOficialLegada;
    private String diasOperacion;
    private Aeropuerto aeropuertoOrigen;
    private Aeropuerto aeropuertoDestino;

    public void setCodigoVuelo(String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public void setAeropuertoOrigen(String aeropuertoOrigen) {
        this.codigoaeropuertoOrigen = aeropuertoOrigen;
    }

    public void setAeropuertoDestino(String aeropuertoDestino) {
        this.codigoaeropuertoDestino = aeropuertoDestino;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

    public void setHoraOficialSalida(Date horaOficialSalida) {
        this.horaOficialSalida = horaOficialSalida;
    }

    public void setHoraOficialLegada(Date horaOficialLegada) {
        this.horaOficialLegada = horaOficialLegada;
    }

    public void setDiasOperacion(String diasOperacion) {
        this.diasOperacion = diasOperacion;
    }

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public String getAeropuertoOrigen() {
        return codigoaeropuertoOrigen;
    }

    public String getAeropuertoDestino() {
        return codigoaeropuertoDestino;
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public Date getHoraOficialSalida() {
        return horaOficialSalida;
    }

    public Date getHoraOficialLegada() {
        return horaOficialLegada;
    }

    public String getDiasOperacion() {
        return diasOperacion;
    }

    public VueloBase() {
    }

    public VueloBase(String codigoVuelo, String aeropuertoOrigen, String aeropuertoDestino, int numPlazas, Date horaOficialSalida, Date horaOficialLegada, String diasOperacion) {
        this.codigoVuelo = codigoVuelo;
        this.codigoaeropuertoOrigen = aeropuertoOrigen;
        this.codigoaeropuertoDestino = aeropuertoDestino;
        this.numPlazas = numPlazas;
        this.horaOficialSalida = horaOficialSalida;
        this.horaOficialLegada = horaOficialLegada;
        this.diasOperacion = diasOperacion;
    }
    
    
}
