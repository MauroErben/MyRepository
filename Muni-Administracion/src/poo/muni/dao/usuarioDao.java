/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.muni.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import poo.muni.Usuario;

/**
 *
 * @author oficina2
 */
public class usuarioDao {
    private final SessionFactory sessionFactory;
    private final Connection connection;
    public usuarioDao(SessionFactory sessionFactory, Connection connection){
        this.sessionFactory = sessionFactory;
        this.connection = connection;
    }
    
    public boolean guardarUsuario(Usuario usuario){
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        
        try{
            tx = session.beginTransaction();
            session.save(usuario);               
            tx.commit();
            return true;
        }catch(HibernateException e){
            if(tx != null){
                tx.rollback();
            }
            e.printStackTrace();
            return false;
        }finally{
            session.close();
        }
    }
    
    public boolean isUsuarioExistente(String nombreUsuario) {
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs;
            rs = stmt.executeQuery("SELECT nombreUsuario FROM usuario WHERE nombreUsuario = '"+nombreUsuario+"'");
            while (rs.next()) {
                String lastName = rs.getString("nombreUsuario");
                if(lastName.equals(nombreUsuario)){
                    return false;
                }
            }
            //connection.close();    
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return true;
    }
    
    public boolean validadInicioSession(String usuario, String contraseña){
        try{
            Statement stmt = connection.createStatement();
            ResultSet rs;
            rs = stmt.executeQuery("SELECT nombreUsuario,contraseña FROM usuario WHERE nombreUsuario = '"+usuario+"' AND contraseña = '"+contraseña+"'");
            while(rs.next()){
                String user = rs.getString("nombreUsuario");
                String password = rs.getString("contraseña");
                if(user.equals(usuario) && password.equals(contraseña)){
                    return true;
                }
            }
        }catch(Exception e){
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return false;
    }
    
}
