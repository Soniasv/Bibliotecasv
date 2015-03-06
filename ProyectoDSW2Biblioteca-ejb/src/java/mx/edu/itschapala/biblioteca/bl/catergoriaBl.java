/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.biblioteca.bl;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import mx.edu.itschapala.biblioteca.dao.CatergoriaDaoLocal;
import mx.edu.itschapala.biblioteca.modelo.Catergoria;

/**
 *
 * @author Sony
 */
@Stateless
public class catergoriaBl implements catergoriaBlLocal {
    @EJB
    private CatergoriaDaoLocal catergoriaDao;

    @Override
    public boolean registrar(Catergoria catergoria) {
        catergoriaDao.crear(catergoria);
        return true;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public void editar(Catergoria catergoria) {
        catergoriaDao.editar(catergoria);
    }

    @Override
    public boolean eliminar(Catergoria catergoria) {
        catergoriaDao.eleminar(catergoria);
        return true;
    }

    @Override
    public List<Catergoria> getList(Catergoria catergoria) {
        return null;
    }

    @Override
    public Catergoria getPorId(int id) {
        return catergoriaDao.buscarPorId(id);
    }

    
    
}
