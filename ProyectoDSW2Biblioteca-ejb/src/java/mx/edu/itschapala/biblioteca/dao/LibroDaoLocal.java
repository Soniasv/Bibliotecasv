/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.biblioteca.dao;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.biblioteca.modelo.Libro;

/**
 *
 * @author Sony
 */
@Local
public interface LibroDaoLocal {

    void crear(Libro libro);

    void editar(Libro libro);

    void eleminar(Libro libro);

    Libro buscarPorId(Object id);

    List<Libro> buscarTodos();

    List<Libro> buscarEnRango(int[] range);

    int contar();
    
}
