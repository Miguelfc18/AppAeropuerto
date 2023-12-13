/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pa.cifpaviles.dam.aeropuertoclase.dto;

/**
 *
 * @author mariorl
 */
public class Aeropuerto {
    private String CodigoIATA;
    private String nombre;
    private String provincia;
    private String codMunicipio;

    public String getCodigoIATA() {
        return CodigoIATA;
    }

    public void setCodigoIATA(String IATA) {
        this.CodigoIATA = CodigoIATA;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCodMunicipio() {
        return codMunicipio;
    }

    public void setCodMunicipio(String codprovincia) {
        this.codMunicipio = codprovincia;
    }

    public Aeropuerto(String CodigoIATA, String nombre, String codMunicipio) {
        this.CodigoIATA = CodigoIATA;
        this.nombre = nombre;
        this.codMunicipio = codMunicipio;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
    public Aeropuerto() {
    
}
    
    
    
    
}
