/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pa.cifpaviles.dam.aeropuertoclase.dto;

/**
 *
 * @author mariorl
 */
public class Companya {
    private int prefijo;
    private String codigo;
    private String nombre;
    private String direccion;
    private String municipio;
    private String telefonoPasajeros;
    private String telefonoAeropuerto;

    public void setPrefijo(int prefijo) {
        this.prefijo = prefijo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public void setTelefonoPasajeros(String telefonoPasajeros) {
        this.telefonoPasajeros = telefonoPasajeros;
    }

    public void setTelefonoAeropuerto(String telefonoAeropuerto) {
        this.telefonoAeropuerto = telefonoAeropuerto;
    }

    public int getPrefijo() {
        return prefijo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getMunicipio() {
        return municipio;
    }

    public String getTelefonoPasajeros() {
        return telefonoPasajeros;
    }

    public String getTelefonoAeropuerto() {
        return telefonoAeropuerto;
    }
    
    public Companya(){
        
    }
    
    

    public Companya(int prefijo, String codigo, String nombre, String direccion, String municipio, String telefonoPasajeros, String telefonoAeropuerto) {
        this.prefijo = prefijo;
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.municipio = municipio;
        this.telefonoPasajeros = telefonoPasajeros;
        this.telefonoAeropuerto = telefonoAeropuerto;
    }
}
