/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.biblioteca.bl;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.biblioteca.modelo.Libro;

/**
 *
 * @author Sony
 */
@Local
public interface LibroBlLocal {

    boolean registrar(Libro libro);

    boolean eliminar(Libro libro);

    void editar(Libro libro);

    Libro getPorId(int id);

    List<Libro> getList();
    
}
