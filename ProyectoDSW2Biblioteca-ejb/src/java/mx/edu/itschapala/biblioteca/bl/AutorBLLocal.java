/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.biblioteca.bl;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.biblioteca.modelo.Autor;

/**
 *
 * @author Sony
 */
@Local
public interface AutorBLLocal {

    boolean registrar(Autor autor);

    boolean Eleminar(Autor autor);

    void editar(Autor autor);

    List<Autor> getLista();

    Autor getPorId(int id);

    
  
    
}
