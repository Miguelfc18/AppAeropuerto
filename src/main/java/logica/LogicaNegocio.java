/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import GUI.MenuCompanya;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import pa.cifpaviles.dam.aeropuertoclase.dto.Aeropuerto;
import pa.cifpaviles.dam.aeropuertoclase.dto.Companya;
import pa.cifpaviles.dam.aeropuertoclase.dto.VueloBase;
import pa.cifpaviles.dam.aeropuertoclase.dto.VueloDiario;

/**
 *
 * @author mariorl
 */
public class LogicaNegocio {

    private static List<Aeropuerto> lstAeropuertos = new ArrayList<Aeropuerto>();
    private static List<Companya> lstCompanya = new ArrayList<Companya>();
    private static List<VueloBase> lstVueloBase = new ArrayList<VueloBase>();
    private static List<VueloDiario> lstVueloDiario = new ArrayList<VueloDiario>();

    public static List<Aeropuerto> getAllAeropuertos() {
        return new ArrayList<Aeropuerto>();
    }

    public static Aeropuerto getAeropuertoByCodigoIATA(String codigoIATA) {
        Aeropuerto valorSalida = null;

        for (Aeropuerto a : lstAeropuertos) {
            if (a.getCodigoIATA().equals(codigoIATA)) {
                valorSalida = a;
                return valorSalida;

            }
        }
        return valorSalida;
    }

    public static void addAeropuerto(Aeropuerto a) {
        lstAeropuertos.add(a);
    }

    public static Aeropuerto aeropuertBase = getAeropuertoByCodigoIATA("OVD");

    public static List<Companya> getAllCompanyas() {
        return new ArrayList<Companya>();
    }

    public static Companya getCompanyaByCodigoPrefijo(int prefijo) {
        for (Companya a : lstCompanya) {
            if (a.getPrefijo() == prefijo) {
                return a;
            }
        }
        return new Companya();
    }

    public static Companya getCompanyaByCodigo(String codigo) {
        Optional<Companya> optValorSalida = lstCompanya.stream()
                .filter(value -> value.getCodigo().equals(codigo))
                .findFirst();
        if (optValorSalida.isPresent()) {
            return optValorSalida.get();
        } else {
            return new Companya();
        }

    }

    public static List<VueloBase> getAllVueloBases() {
        return new ArrayList<VueloBase>();
    }

    public static void addVueloBase(VueloBase v) {
        lstVueloBase.add(v);
    }

    public static VueloBase getByVueloBaseByCodigoIATA(String Codigo) {
        for (VueloBase v : lstVueloBase) {
            if (v.getCodigoVuelo().equalsIgnoreCase(Codigo)) {
                return v;
            }
        }
        return null;
    }

    public static List<VueloBase> getVuelosBaseByFecha(Date fecha) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(fecha);
        int diaSemana = cal.get(Calendar.DAY_OF_WEEK);
        String diaSemanaCad = " ";
        switch (diaSemana) {
            case Calendar.SUNDAY:
                diaSemanaCad = "D";
                break;
            case Calendar.MONDAY:
                diaSemanaCad = "L";
                break;
            case Calendar.TUESDAY:
                diaSemanaCad = "M";
                break;
            case Calendar.WEDNESDAY:
                diaSemanaCad = "M";
                break;
            case Calendar.THURSDAY:
                diaSemanaCad = "j";
                break;
            case Calendar.FRIDAY:
                diaSemanaCad = "V";
                break;
            case Calendar.SATURDAY:
                diaSemanaCad = "S";
                break;
            default:
                diaSemanaCad = "";
        }
        return getVuelosBaseByDiaSemana(diaSemanaCad);

    }

    public static List<VueloBase> getVuelosBaseByDiaSemana(String diaSemana) {
        /*Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal.get(Calendar.DAY_OF_WEEK);*/
        List<VueloBase> lstVuelosByDiaSemana = lstVueloBase.stream()
                .filter(v -> v.getDiasOperacion().contains(diaSemana))
                .toList();

        return lstVuelosByDiaSemana;
    }

    public static VueloBase getByVueloBaseByAeropuertoBase(String Codigo) {
        return new VueloBase();
    }

    public static List<VueloDiario> getAllVueloDiario() {
        return new ArrayList<VueloDiario>();
    }

    public static VueloDiario getByVueloDiarioByCodigoVueloBase(String Codigo) {
        return new VueloDiario();
    }

    public static void addCompanya(Companya c) {
        lstCompanya.add(c);
    }

    public static void updateCompanyaByCodigo(String codigo, Companya newComp) {
        Companya comp = getCompanyaByCodigo(codigo);
        comp.setDireccion(newComp.getDireccion());
        comp.setMunicipio(newComp.getMunicipio());
        comp.setNombre(newComp.getNombre());
        comp.setPrefijo(newComp.getPrefijo());
        comp.setTelefonoAeropuerto(newComp.getTelefonoAeropuerto());
        comp.setTelefonoPasajeros(newComp.getTelefonoPasajeros());
        //foto
    }

    public static void deleteCompanyaByCodigo(String codigo) {
        Companya delComp = getCompanyaByCodigo(codigo);
        lstCompanya.remove(delComp);
    }

    public static Date getFechaByHora(int horas, int minutos) {
        Calendar cal = Calendar.getInstance();
        cal.set(1970, 1, 1, horas, minutos);
        Date fecha = cal.getTime();
        return fecha;
    }

    public static Calendar getHoraFecha(Date fecha) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(fecha);
        return cal;
    }

    public static JComboBox<String> rellenarListaCompanya(JComboBox<String> CBEliminar) {
        String rutaArchivo = "./src/main/resources/Companyas.csv";
        int total = 0;
        int total2 = 0;
        try (CSVReader csvReader = new CSVReader(new FileReader(rutaArchivo))) {
            String[] fila;
            while ((fila = csvReader.readNext()) != null) {
                for (String dato : fila) {
                    if (total2 == 0) {
                        CBEliminar.insertItemAt("", 0);

                    }
                    total++;
                    total2++;
                    if (total == 3) {
                        CBEliminar.addItem(dato);

                    }
                    if (total == 7) {
                        total = 0;
                    }
                }
            }
            return CBEliminar;
        } catch (IOException ex) {
            System.err.println("Error al leer el archivo CSV: " + ex.getMessage());
        } catch (CsvValidationException ex) {
            Logger.getLogger(MenuCompanya.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CBEliminar;
    }
    
    public static JComboBox<String> rellenarListaAeropuertos(JComboBox<String> CBAeropuertos){
        String rutaArchivo = "./src/main/resources/Aeropuertos.csv";
        int total = 0;
        int total2 = 0;
        try (CSVReader csvReader = new CSVReader(new FileReader(rutaArchivo))) {
            String[] fila;
            while ((fila = csvReader.readNext()) != null) { 
                for (String dato : fila) {
                    if (total2 == 0) {
                        CBAeropuertos.insertItemAt("", 0);

                    }
                    total++;
                    total2++;
                    if (total == 2) {
                        CBAeropuertos.addItem(dato);

                    }
                    if (total == 3) {
                        total = 0;
                    }
                }
            }
            return CBAeropuertos;
        } catch (IOException ex) {
            System.err.println("Error al leer el archivo CSV: " + ex.getMessage());
        } catch (CsvValidationException ex) {
            Logger.getLogger(MenuCompanya.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CBAeropuertos;
    }
    
    public static JComboBox<String> rellenarListaVuelosBase(JComboBox<String> CBAeropuertos){
        
        String rutaArchivo = "./src/main/resources/VuelosBase.csv";
        int total = 0;
        int total2 = 0;
        try (CSVReader csvReader = new CSVReader(new FileReader(rutaArchivo))) {
            String[] fila;
            while ((fila = csvReader.readNext()) != null) {
                for (String dato : fila) {
                    if (total2 == 0) {
                        CBAeropuertos.insertItemAt("", 0);

                    }
                    total++;
                    total2++;
                    if (total == 1) {
                        
                        CBAeropuertos.addItem(dato);
                        
                    }

                    if (total == 7) {
                        total = 0;
                        
                        
                    }
                }
            }
            return CBAeropuertos;
        } catch (IOException ex) {
            System.err.println("Error al leer el archivo CSV: " + ex.getMessage());
        } catch (CsvValidationException ex) {
            Logger.getLogger(MenuCompanya.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CBAeropuertos;
    }
    
    
    public static JComboBox<String> rellenarListaVuelosDiarios(JComboBox<String> CBAeropuertos){
        String rutaArchivo = "./src/main/resources/VuelosDiarios.csv";
        int total = 0;
        int total2 = 0;

        try (CSVReader csvReader = new CSVReader(new FileReader(rutaArchivo))) {
            String[] fila;
            while ((fila = csvReader.readNext()) != null) {
                for (String dato : fila) {
                    if (total2 == 0) {
                        CBAeropuertos.insertItemAt("", 0);

                    }
                    total++;
                    total2++;
                    if (total == 1) {
                        
                        CBAeropuertos.addItem(dato);
                        
                    }

                    if (total == 6) {
                        total = 0;
                        
                        
                    }
                }
            }
            return CBAeropuertos;
        } catch (IOException ex) {
            System.err.println("Error al leer el archivo CSV: " + ex.getMessage());
        } catch (CsvValidationException ex) {
            Logger.getLogger(MenuCompanya.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CBAeropuertos;
    }
    
}
