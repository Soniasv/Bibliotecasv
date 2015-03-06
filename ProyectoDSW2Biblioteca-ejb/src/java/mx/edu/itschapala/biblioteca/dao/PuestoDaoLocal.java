/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.biblioteca.dao;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.biblioteca.modelo.Puesto;

/**
 *
 * @author Sony
 */
@Local
public interface PuestoDaoLocal {

    void crear(Puesto puesto);

    void editar(Puesto puesto);

    void eleminar(Puesto puesto);

    Puesto buscarPorId(Object id);

    List<Puesto>buscarTodos();

    List<Puesto> buscarEnRango(int[] range);

    int contar();
    
}
