/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.biblioteca.bl;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import mx.edu.itschapala.biblioteca.dao.AutorDaoLocal;
import mx.edu.itschapala.biblioteca.modelo.Autor;

/**
 *
 * @author Sony
 */
@Stateless
public class AutorBL implements AutorBLLocal {
   
    
    @EJB
    private AutorDaoLocal autorDao;

    @Override
    //capa para hacer todas la aclaraciones que nos esta danto
    public boolean registrar(Autor autor) {
        autorDao.crear(autor);
        return true;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public boolean Eleminar(Autor autor) {
         autorDao.eleminar(autor);
        return true;
    }
    
    @Override
    public void editar(Autor autor) {
        autorDao.editar(autor);
    }

    @Override
    public List<Autor> getLista() {
        return autorDao.buscarTodos();
    }

    @Override
    public Autor getPorId(int id) {
        return autorDao.buscarPorId(id);
    }

    }
