/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.biblioteca.dao;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.biblioteca.modelo.Autor;

/**
 *
 * @author Sony
 */
@Local
public interface AutorDaoLocal {

    void crear(Autor autor);

    void editar(Autor autor);

    void eleminar(Autor autor);

    Autor buscarPorId (Object id);

    List<Autor>buscarTodos();

    List<Autor>  buscarEnRango(int[] range);

    int contar();
    
}
