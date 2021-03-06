/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.biblioteca.bl;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import mx.edu.itschapala.biblioteca.dao.EmpleadoDaoLocal;
import mx.edu.itschapala.biblioteca.modelo.Empleado;

/**
 *
 * @author Sony
 */
@Stateless
public class Empleadobl implements EmpleadoblLocal {
    @EJB
    private EmpleadoDaoLocal empleadoDao;

    @Override
    public boolean registrar(Empleado empleado) {
        empleadoDao.crear(empleado);
        return true;
        
        
    }

    @Override
    public boolean editar(Empleado empleado) {
        empleadoDao.editar(empleado);
        return true;
    }

    @Override
    public boolean eliminar(Empleado empleado) {
        empleadoDao.eleminar(empleado);
        return true;
    }

    @Override
    public Empleado getPorId(int id) {
        return empleadoDao.buscarPorId(id);
    }

    @Override
    public List<Empleado> getList() {
        return empleadoDao.buscarTodos();
    }

    

  

}
