/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.datos.hibernate.dao.imp;

import aplicacion.datos.hibernate.dao.IGuiaPrecioDAO;
import aplicacion.modelo.dominio.GuiaPrecio;
import java.io.Serializable;
import javax.transaction.Transactional;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

/**
 *
 * @author nahuel
 */
public class GuiaPrecioDAOImpl extends HibernateDaoSupport implements IGuiaPrecioDAO, Serializable{
    @Override
    @Transactional
    public void crearGuiaPrecio(GuiaPrecio guiaPrecio){
        getHibernateTemplate().save(guiaPrecio);
    }
}
