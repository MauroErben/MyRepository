/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.muni.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import org.hibernate.SessionFactory;
import poo.muni.NivelEducativo;
import poo.muni.Perfil;
import poo.muni.Postulante;
import poo.muni.Programa;
import poo.muni.dao.postulanteDao;

/**
 *
 * @author oficina2
 */
public class gestorPostulante {

    private final postulanteDao postulanteDao;

    public gestorPostulante(SessionFactory sessionFactory, Connection connection) {
        this.postulanteDao = new postulanteDao(sessionFactory, connection);
    }

    public boolean guardarPostulante(NivelEducativo nivelEducativo, Perfil perfil, String movilidad, String dispHoraria, String docAdicional, Programa programa, String dni, String sexo, String edad, String nombre, String cuil_cuit, String domicilo, String telefonoPrincipal, String telefonoAltarnativo, String email) {
        Postulante postulante = new Postulante(nivelEducativo, perfil, movilidad, dispHoraria, docAdicional, programa, dni, sexo, edad, nombre, cuil_cuit, domicilo, telefonoPrincipal, telefonoAltarnativo, email);
        return postulanteDao.guardarPostulante(postulante);
    }

    public ArrayList<NivelEducativo> getNivelEducativo() {
        ArrayList<NivelEducativo> listaNivelEducativo = new ArrayList<NivelEducativo>();
        NivelEducativo nivelEducativo;
        try {
            ResultSet rs = null;
            rs = postulanteDao.getNivelEducativo();

            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String descripcion = rs.getString("descripcion");
                String id = rs.getString("id_nivel_educacion");
                long idInt = Long.parseLong(id);

                nivelEducativo = new NivelEducativo(nombre, descripcion);

                nivelEducativo.setNombre(nombre);

                nivelEducativo.setId(idInt);

                listaNivelEducativo.add(nivelEducativo);

            }
            return listaNivelEducativo;

        } catch (Exception e) {
            if (e != null) {

            }
        }
        return listaNivelEducativo;
    }
    
    
     public ArrayList<Programa> getPrograma() {
        ArrayList<Programa> listaPrograma = new ArrayList<>();
        Programa programa;
        try {
            ResultSet rs = null;
            rs = postulanteDao.getPrograma();

            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String descripcion = rs.getString("descripcion");
                String id = rs.getString("id_programa");
                long idInt = Long.parseLong(id);

                programa = new Programa(nombre, descripcion);

                programa.setNombre(nombre);

                programa.setId(idInt);

                listaPrograma.add(programa);

            }
            return listaPrograma;

        } catch (Exception e) {
            if (e != null) {

            }
        }
        return listaPrograma;
    }
}
