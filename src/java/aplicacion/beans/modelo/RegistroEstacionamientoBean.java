/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.beans.modelo;

import aplicacion.modelo.dominio.GuiaPrecio;
import aplicacion.modelo.dominio.RegistroEstacionamiento;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author nahuel
 */
@ManagedBean
@RequestScoped
public class RegistroEstacionamientoBean implements Serializable{
    private RegistroEstacionamiento registroEstacionamiento;
    /**
     * Creates a new instance of RegistroEstacionamientoBean
     */
    public RegistroEstacionamientoBean() {
        registroEstacionamiento = new RegistroEstacionamiento();
        registroEstacionamiento.setGuiaPrecio(new GuiaPrecio());
    }
    /**
     * @return the registroEstacionamiento
     */
    public RegistroEstacionamiento getRegistroEstacionamiento() {
        return registroEstacionamiento;
    }

    /**
     * @param registroEstacionamiento the registroEstacionamiento to set
     */
    public void setRegistroEstacionamiento(RegistroEstacionamiento registroEstacionamiento) {
        this.registroEstacionamiento = registroEstacionamiento;
    }
    
}
