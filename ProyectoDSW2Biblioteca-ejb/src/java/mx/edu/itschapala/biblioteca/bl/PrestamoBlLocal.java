/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.biblioteca.bl;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.biblioteca.modelo.Prestamo;

/**
 *
 * @author Sony
 */
@Local
public interface PrestamoBlLocal {

    boolean registrar(Prestamo prestamo);

    boolean eleminar(Prestamo prestamo);

    void editar(Prestamo prestamo);

    Prestamo getPorId(int id);

    List<Prestamo> getList();
    
}
