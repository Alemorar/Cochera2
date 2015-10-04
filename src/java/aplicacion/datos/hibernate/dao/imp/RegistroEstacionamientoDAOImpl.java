/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.datos.hibernate.dao.imp;

import aplicacion.datos.hibernate.dao.IRegistroEstacionamientoDAO;
import aplicacion.modelo.dominio.RegistroEstacionamiento;
import java.io.Serializable;
import javax.transaction.Transactional;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

/**
 *
 * @author nahuel
 */
public class RegistroEstacionamientoDAOImpl extends HibernateDaoSupport implements IRegistroEstacionamientoDAO, Serializable{

    @Override
    @Transactional
    public void guardarRegistro(RegistroEstacionamiento registroEstacionamiento) {
        getHibernateTemplate().save(registroEstacionamiento);
    }
}
