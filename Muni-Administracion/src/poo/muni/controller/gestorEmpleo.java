/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.muni.controller;
import java.sql.Connection;
import org.hibernate.SessionFactory;
import poo.muni.Usuario;
import poo.muni.ui.AltaUsuario;
import poo.muni.dao.usuarioDao;

/**;
 *
 * @author oficina2
 */
public class gestorEmpleo {
    
    private usuarioDao usuarioDao;
    
    public gestorEmpleo(SessionFactory sessionFactory, Connection connection){
        this.usuarioDao = new usuarioDao(sessionFactory, connection);
        
    }
   
    public void run(){
        new AltaUsuario(this).setVisible(true);
    }
   
    
    public boolean guardarUsuario(String nombre, String apellido, String email,char[] contraseña,String nombreUsuario){
        Usuario usuario = new Usuario(nombreUsuario,contraseña,nombre,apellido, email);
        return usuarioDao.guardarUsuario(usuario);
            
    }
    
    public boolean isUsuarioExistente(String nombreUsuario){
        return usuarioDao.isUsuarioExistente(nombreUsuario);
    }
}
