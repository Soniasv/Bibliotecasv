/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.biblioteca.bl;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.biblioteca.modelo.Usuario;

/**
 *
 * @author Sony
 */
@Local
public interface UsuarioBlLocal {

    boolean registrar(Usuario usuario);

    boolean eleminar(Usuario usuario);

    void editar(Usuario usuario);

    Usuario getPorId(int id);

    List<Usuario> getList(Usuario usuario);
    
}
