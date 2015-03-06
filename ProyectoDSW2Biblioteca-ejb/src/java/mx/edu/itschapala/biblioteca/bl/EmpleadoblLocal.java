/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.biblioteca.bl;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.biblioteca.modelo.Empleado;

/**
 *
 * @author Sony
 */
@Local
public interface EmpleadoblLocal {

    boolean registrar(Empleado empleado);

    boolean editar(Empleado empleado);

    boolean eliminar(Empleado empleado);

    Empleado getPorId(int id);  

    List<Empleado> getList();
    
}
