/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pa.cifpaviles.dam.aeropuertoclase.dto;
import java.util.Date;

/**
 *
 * @author mariorl
 */
public class VueloDiario {
    private String codigoVueloBase;
    private Date fechaVuelo;
    private Date horaSalido;
    private Date horaSalida;
    private int numPlazasOcupadas;
    private float precioVuelo;
    private VueloBase vueloBase;

    public String getCodigoVueloBase() {
        return codigoVueloBase;
    }

    public Date getFechaVuelo() {
        return fechaVuelo;
    }

    public Date getHoraSalido() {
        return horaSalido;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public int getNumPlazasOcupadas() {
        return numPlazasOcupadas;
    }

    public float getPrecioVuelo() {
        return precioVuelo;
    }

    public VueloBase getVueloBase() {
        return vueloBase;
    }

    public void setCodigoVueloBase(String codigoVueloBase) {
        this.codigoVueloBase = codigoVueloBase;
    }

    public void setFechaVuelo(Date fechaVuelo) {
        this.fechaVuelo = fechaVuelo;
    }

    public void setHoraSalido(Date horaSalido) {
        this.horaSalido = horaSalido;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    public void setNumPlazasOcupadas(int numPlazasOcupadas) {
        this.numPlazasOcupadas = numPlazasOcupadas;
    }

    public void setPrecioVuelo(float precioVuelo) {
        this.precioVuelo = precioVuelo;
    }

    public void setVueloBase(VueloBase vueloBase) {
        this.vueloBase = vueloBase;
    }

    public VueloDiario() {
    }

    public VueloDiario(String codigoVueloBase, Date fechaVuelo, Date horaSalido, Date horaSalida, int numPlazasOcupadas, float precioVuelo) {
        this.codigoVueloBase = codigoVueloBase;
        this.fechaVuelo = fechaVuelo;
        this.horaSalido = horaSalido;
        this.horaSalida = horaSalida;
        this.numPlazasOcupadas = numPlazasOcupadas;
        this.precioVuelo = precioVuelo;
    }

    public VueloDiario(Date fechaVuelo, Date horaSalido, Date horaSalida, int numPlazasOcupadas, float precioVuelo, VueloBase vueloBase) {
        this.fechaVuelo = fechaVuelo;
        this.horaSalido = horaSalido;
        this.horaSalida = horaSalida;
        this.numPlazasOcupadas = numPlazasOcupadas;
        this.precioVuelo = precioVuelo;
        this.vueloBase = vueloBase;
    }
    
    
}
