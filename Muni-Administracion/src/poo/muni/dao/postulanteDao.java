/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.muni.dao;

import java.sql.Connection;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import poo.muni.Persona;
import poo.muni.Postulante;
/**
 *
 * @author oficina2
 */
public class postulanteDao {
    private final SessionFactory sessionFactory;
    private final Connection connection;
    
    
    public postulanteDao(SessionFactory sessionFactory, Connection connection){
        this.sessionFactory = sessionFactory;
        this.connection = connection;
    }
    
    public boolean guardarPostulante(Postulante postulante){
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        
         try{
            tx = session.beginTransaction();
            postulante.getNivelEducativo().setId(1);
            session.save(postulante);               
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
}
