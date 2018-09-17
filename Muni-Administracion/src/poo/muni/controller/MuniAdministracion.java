/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.muni.controller;
import java.sql.Connection;
import java.sql.DriverManager;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import poo.muni.AltaUsuario;
import org.hibernate.cfg.AnnotationConfiguration;
import poo.muni.Usuario;
import poo.muni.ui.LogInUsuario;
/**
 *
 * @author oficina2
 */
public class MuniAdministracion {
    private static SessionFactory factory;
    private static Connection conn;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // Session session = null;
        
        try{
            factory = new AnnotationConfiguration().configure().
                    addAnnotatedClass(Usuario.class)
                    .buildSessionFactory();
                     getConnection();
        }catch(Throwable e){
            System.err.println("Failed to create sessionFactory object." + e);
            throw new ExceptionInInitializerError(e); 
        }
         new gestorEmpleo(factory, conn).run();
         //new LogInUsuario().setVisible(true);
//        try{
//            try{
//                sessionFactory = HibernateUtil.getSessionFactory();
//                session = sessionFactory.openSession();
//                System.out.println("insertando registro...");
//                Transaction tx = session.beginTransaction();
//                
//                AltaUsuario alta = new AltaUsuario();
//                alta.setNombre("Mauro");
//                alta.setApellido("Erben");
//                session.save(alta);
//                tx.commit();
//                System.out.println("Finalizado...");
//            }catch(Exception e){
//                System.out.println(e.getMessage());
//            }
//        }finally{
//            session.close();
//        }
    }
    
    public static Connection getConnection() throws Exception{
        if(conn == null){
             String url = "jdbc:mysql://localhost:3306/oficinaempleo";
             conn = DriverManager.getConnection(url, "root", "root");
        }
        return conn;
    }
    
    public static void closeConnection(Connection connection){
        try{
            
        }catch(Exception e){
        
        } 
    }
}
