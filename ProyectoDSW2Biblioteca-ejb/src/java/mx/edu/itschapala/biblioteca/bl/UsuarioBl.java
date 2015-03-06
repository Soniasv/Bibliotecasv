/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.biblioteca.bl;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import mx.edu.itschapala.biblioteca.dao.UsuarioDaoLocal;
import mx.edu.itschapala.biblioteca.modelo.Usuario;

/**
 *
 * @author Sony
 */
@Stateless
public class UsuarioBl implements UsuarioBlLocal {
    @EJB
    private UsuarioDaoLocal usuarioDao;

    @Override
    public boolean registrar(Usuario usuario) {
        usuarioDao.crear(usuario);
        return true;
    }

    @Override
    public boolean eleminar(Usuario usuario) {
        usuarioDao.eleminar(usuario);
        return true;
    }

    @Override
    public void editar(Usuario usuario) {
        usuarioDao.editar(usuario);
    }

    @Override
    public Usuario getPorId(int id) {
        return usuarioDao.buscarPorId(id);
    }

    @Override
    public List<Usuario> getList(Usuario usuario) {
        return usuarioDao.buscarTodos();
    }

    
}
