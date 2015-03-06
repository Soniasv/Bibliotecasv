/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.biblioteca.bl;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import mx.edu.itschapala.biblioteca.dao.PuestoDaoLocal;
import mx.edu.itschapala.biblioteca.modelo.Puesto;

/**
 *
 * @author Sony
 */
@Stateless
public class PuestoBl implements PuestoBlLocal {
    @EJB
    private PuestoDaoLocal puestoDao;

    @Override
    public boolean resgistrar(Puesto puesto) {
        puestoDao.crear(puesto);
        return true;
    }

    @Override
    public boolean eleminar(Puesto puesto) {
        puestoDao.eleminar(puesto);
        return true;
    }

    @Override
    public void editar(Puesto puesto) {
        puestoDao.editar(puesto);
    }

    @Override
    public Puesto getPorId(int id) {
        return puestoDao.buscarPorId(id);
    }

    @Override
    public List<Puesto> getList() {
        return null;
    }

    
}
