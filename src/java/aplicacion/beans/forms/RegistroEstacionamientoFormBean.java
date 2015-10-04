/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.beans.forms;

import aplicacion.beans.modelo.RegistroEstacionamientoBean;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

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
    
    public void guardarEstacionamiento(){
        registroEstacionamientoBean.getRegistroEstacionamientoDAO().guardarRegistro(registroEstacionamientoBean.getRegistroEstacionamiento());
    }

    public RegistroEstacionamientoBean getRegistroEstacionamientoBean() {
        return registroEstacionamientoBean;
    }

    public void setRegistroEstacionamientoBean(RegistroEstacionamientoBean registroEstacionamientoBean) {
        this.registroEstacionamientoBean = registroEstacionamientoBean;
    }
    
}
