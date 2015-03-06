/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.biblioteca.dao;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.biblioteca.modelo.Catergoria;

/**
 *
 * @author Sony
 */
@Local
public interface CatergoriaDaoLocal {

    void crear(Catergoria catergoria);

    void editar(Catergoria catergoria);

    void eleminar(Catergoria catergoria);

    Catergoria buscarPorId(Object id);

    List<Catergoria> buscarTodos();

    List<Catergoria> buscarEnRango(int[] range);

    int contar();
    
}
