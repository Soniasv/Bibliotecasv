/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.biblioteca.dao;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.biblioteca.modelo.Prestamo;

/**
 *
 * @author Sony
 */
@Local
public interface PrestamoDaoLocal {

    void crear(Prestamo prestamo);

    void editar(Prestamo prestamo);

    void eleminar(Prestamo prestamo);

    Prestamo buscarPorId(Object id);

    List<Prestamo> buscarTodos();

    List<Prestamo> buscarEnRango(int[] range);

    int contar();
    
}
