/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.muni.dao;

import java.sql.Connection;
import org.hibernate.SessionFactory;
import poo.muni.Postulante;
/**
 *
 * @author oficina2
 */
public class postulanteDao {
    private final SessionFactory sessionFactory;
    private final Connection connection;
    
    
    public postulanteDao(SessionFactory sessionFactory1, Connection connection1){
        this.sessionFactory = sessionFactory1;
        this.connection = connection1;
    }
    
    public boolean guardarPostulante(Postulante postulante){
        
    }
}
