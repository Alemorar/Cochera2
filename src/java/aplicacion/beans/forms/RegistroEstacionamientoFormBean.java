/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.beans.forms;

import aplicacion.beans.modelo.RegistroEstacionamientoBean;
//import aplicacion.modelo.dominio.GuiaPrecio;
import aplicacion.modelo.dominio.RegistroEstacionamiento;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import org.primefaces.context.RequestContext;

/**
 *
 * @author nahuel
 */
@ManagedBean
@RequestScoped
public class RegistroEstacionamientoFormBean implements Serializable{
    @ManagedProperty(value = "#{registroEstacionamientoBean}")
    private RegistroEstacionamientoBean registroEstacionamientoBean;
    /**
     * Creates a new instance of RegistroEstacionamientoFormBean
     */
    public RegistroEstacionamientoFormBean() {
    }
    
    public void mostrarConfirmacionRegistro(){
        RequestContext.getCurrentInstance().execute("PF('confirmaRegistrarEntrada').show()");
    }
    
    public ArrayList<RegistroEstacionamiento> getRegistrosEntradas(){
        System.out.println("Cant reg: " + registroEstacionamientoBean.getRegistroEstacionamientoDAO().getRegistrosEntrada().size());
        return registroEstacionamientoBean.getRegistroEstacionamientoDAO().getRegistrosEntrada();
    } 
    
    public void actualizarHoraEntrada(){
        registroEstacionamientoBean.getRegistroEstacionamiento().sethEntrada(new Date(System.currentTimeMillis()));
    }
    
    public void establecerElegido(RegistroEstacionamiento registroEstacionamiento){
        System.out.println("paso ....");
        registroEstacionamientoBean.setRegistroEstacionamiento(registroEstacionamiento);
        registroEstacionamientoBean.getRegistroEstacionamiento().sethSalida(new Date(System.currentTimeMillis()));
        System.out.println(registroEstacionamientoBean.getRegistroEstacionamiento().getCodigo() + " " + registroEstacionamientoBean.getRegistroEstacionamiento().gethSalida());
    }
    
    public void actualizarHoraSalida(){
        registroEstacionamientoBean.getRegistroEstacionamiento().sethSalida(new Date(System.currentTimeMillis()));
    }
    
    public void actualizarEstacionamiento(){
        registroEstacionamientoBean.getRegistroEstacionamientoDAO().actualizarRegistro(registroEstacionamientoBean.getRegistroEstacionamiento());
    }
    
    public void guardarEstacionamiento(){
        registroEstacionamientoBean.getRegistroEstacionamiento().setFecha(new Date());
        registroEstacionamientoBean.getRegistroEstacionamientoDAO().guardarRegistro(registroEstacionamientoBean.getRegistroEstacionamiento());
    }

    public RegistroEstacionamientoBean getRegistroEstacionamientoBean() {
        return registroEstacionamientoBean;
    }

    public void setRegistroEstacionamientoBean(RegistroEstacionamientoBean registroEstacionamientoBean) {
        this.registroEstacionamientoBean = registroEstacionamientoBean;
    }
    
}
