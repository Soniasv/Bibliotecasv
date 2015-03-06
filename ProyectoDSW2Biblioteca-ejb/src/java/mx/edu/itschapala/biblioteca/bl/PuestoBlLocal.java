/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.biblioteca.bl;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.biblioteca.modelo.Puesto;

/**
 *
 * @author Sony
 */
@Local
public interface PuestoBlLocal {

    boolean resgistrar(Puesto puesto);

    boolean eleminar(Puesto puesto);

    void editar(Puesto puesto);

    Puesto getPorId(int di);

    List<Puesto> getList();
    
}
