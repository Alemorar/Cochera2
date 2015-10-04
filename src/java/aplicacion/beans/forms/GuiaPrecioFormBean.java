 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.beans.forms;

import aplicacion.beans.modelo.GuiaPrecioBean;
import java.io.Serializable;
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
public class GuiaPrecioFormBean implements Serializable{
    @ManagedProperty(value = "#{guiaPrecioBean}")
    private GuiaPrecioBean guiaPrecioBean;
    /**
     * Creates a new instance of GuiaPrecioFormBean
     */
    public GuiaPrecioFormBean() {
    }
    
    public void mostrarConfirmacionNuevaGuia(){
        RequestContext.getCurrentInstance().execute("PF('confirmaRegistrarGuia').show()");
    }
    
    public void grabarGuia(){
        guiaPrecioBean.getPrecioDAO().crearGuiaPrecio(guiaPrecioBean.getGuiaPrecio());//
    }

    public GuiaPrecioBean getGuiaPrecioBean() {
        return guiaPrecioBean;
    }

    public void setGuiaPrecioBean(GuiaPrecioBean guiaPrecioBean) {
        this.guiaPrecioBean = guiaPrecioBean;
    }
    
}
