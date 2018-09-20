/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.muni.controller;

import java.sql.Connection;
import org.hibernate.SessionFactory;
import poo.muni.NivelEducativo;
import poo.muni.Perfil;
import poo.muni.Postulante;
import poo.muni.Programa;
import poo.muni.Usuario;
import poo.muni.dao.postulanteDao;
import poo.muni.dao.usuarioDao;
import poo.muni.ui.LogInUsuario;

/**
 * ;
 *
 * @author oficina2
 */
public class gestorEmpleo {

    private usuarioDao usuarioDao;
    private postulanteDao postulanteDao;

    public gestorEmpleo(SessionFactory sessionFactory, Connection connection) {
        this.usuarioDao = new usuarioDao(sessionFactory, connection);
        this.postulanteDao = new postulanteDao(sessionFactory, connection);
    }

    public void run() {
        new LogInUsuario(this).setVisible(true);

    }

    public boolean guardarUsuario(String nombre, String apellido, String email, char[] contraseña, String nombreUsuario) {
        Usuario usuario = new Usuario(nombreUsuario, contraseña, nombre, apellido, email);
        return usuarioDao.guardarUsuario(usuario);

    }

    
    public boolean guardarPostulante(Perfil perfil, String movilidad, String dispHoraria, String docAdicional, Programa programa, String dni, String sexo, String edad, String nombre, String cuil_cuit, String domicilo, String telefonoPrincipal, String telefonoAltarnativo, String email){
        Postulante postulante = new Postulante(perfil, movilidad, dispHoraria, docAdicional, programa, dni, sexo, edad, nombre, cuil_cuit, domicilo, telefonoPrincipal, telefonoAltarnativo, email);
        
        return postulanteDao.guardarPostulante(postulante);
    }
            
            
    public boolean isUsuarioExistente(String nombreUsuario) {
        return usuarioDao.isUsuarioExistente(nombreUsuario);
    }
    
    public boolean validarInicioSession(String usuario, String contraseña){
        return usuarioDao.validadInicioSession(usuario, contraseña);
    }
}
