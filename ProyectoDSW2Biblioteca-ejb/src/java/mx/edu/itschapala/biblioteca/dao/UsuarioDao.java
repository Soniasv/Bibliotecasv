/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.biblioteca.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import mx.edu.itschapala.biblioteca.modelo.Usuario;

/**
 *
 * @author Sony
 */
@Stateless
public class UsuarioDao extends AbstractDao<Usuario> implements UsuarioDaoLocal {
    @PersistenceContext(unitName = "ProyectoDSW2Biblioteca-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioDao() {
        super(Usuario.class);
    }
    
}
