package aplicacion.modelo.dominio;


import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nahuel
 */
public class GuiaPrecio implements Serializable {
    private String tipoVehiculo;
    private double precio;

    public GuiaPrecio() {
    }
    
    public void crearNuevaGuia(String tipoVehiculo, double precio){
        this.tipoVehiculo = tipoVehiculo;
        this.precio = precio;
        //codigo para registrar la guia en la base de datos
    }
    
    public void modificarGuia(String tipoVehiculo, double precio){
        this.tipoVehiculo = tipoVehiculo;
        this.precio = precio;
        //codigo para modificar el precio del vehiculo en la base de datos
    }
    
    public void eliminarGuia(String tipoVehiculo){
        /*
        codigo que usa el tipo de vehiculo suministrado
        para eliminarlo de la base de datos
        */
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
