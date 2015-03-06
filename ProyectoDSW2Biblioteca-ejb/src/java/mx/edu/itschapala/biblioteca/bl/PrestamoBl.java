/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.biblioteca.bl;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import mx.edu.itschapala.biblioteca.dao.PrestamoDaoLocal;
import mx.edu.itschapala.biblioteca.modelo.Prestamo;

/**
 *
 * @author Sony
 */
@Stateless
public class PrestamoBl implements PrestamoBlLocal {
    @EJB
    private PrestamoDaoLocal prestamoDao;

    @Override
    public boolean registrar(Prestamo prestamo) {
        prestamoDao.crear(prestamo);
        return true;
    }

    @Override
    public boolean eleminar(Prestamo prestamo) {
        prestamoDao.eleminar(prestamo);
        return true;
    }

    @Override
    public void editar(Prestamo prestamo) {
        prestamoDao.editar(prestamo);
    }

    @Override
    public Prestamo getPorId( int id ) {
        return prestamoDao.buscarPorId(id);
    }

    @Override
    public List<Prestamo> getList() {
        return null;
    }
}
