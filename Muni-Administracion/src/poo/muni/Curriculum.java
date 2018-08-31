/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.muni;

/**
 *
 * @author oficina2
 */
public class Curriculum {
    private String expLaboral;
    private String cursos;
    private Postulante postulante;

    public Curriculum() {
    }

    public Curriculum(String expLaboral, String cursos, Postulante postulante) {
        this.expLaboral = expLaboral;
        this.cursos = cursos;
        this.postulante = postulante;
    }

    public String getExpLaboral() {
        return expLaboral;
    }

    public void setExpLaboral(String expLaboral) {
        this.expLaboral = expLaboral;
    }

    public String getCursos() {
        return cursos;
    }

    public void setCursos(String cursos) {
        this.cursos = cursos;
    }

    public Postulante getPostulante() {
        return postulante;
    }

    public void setPostulante(Postulante postulante) {
        this.postulante = postulante;
    }
    
}
