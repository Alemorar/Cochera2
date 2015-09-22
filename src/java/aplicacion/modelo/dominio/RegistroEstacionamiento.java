package aplicacion.modelo.dominio;


import aplicacion.modelo.dominio.GuiaPrecio;
import java.time.LocalTime;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nahuel
 */
public class RegistroEstacionamiento {
    private Date fecha;
    private String patente;
    private LocalTime hEntrada;
    private LocalTime hSalida;
    private double precioTotal;
    private GuiaPrecio GuiaPrecio;

    public RegistroEstacionamiento() {
    }
        
    public void registrarEntrada(String patente, String tipoVehiculo){
        
    }
    public double registrarSalida(String patente){
        return 0;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public LocalTime gethEntrada() {
        return hEntrada;
    }

    public void sethEntrada(LocalTime hEntrada) {
        this.hEntrada = hEntrada;
    }

    public LocalTime gethSalida() {
        return hSalida;
    }

    public void sethSalida(LocalTime hSalida) {
        this.hSalida = hSalida;
    }
    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public GuiaPrecio getGuiaPrecio() {
        return GuiaPrecio;
    }

    public void setGuiaPrecio(GuiaPrecio GuiaPrecio) {
        this.GuiaPrecio = GuiaPrecio;
    }
}
