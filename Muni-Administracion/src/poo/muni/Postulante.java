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
public class Postulante extends Persona{
    private NivelEducativo nivelEducativo;
    private Perfil perfil;
    private String movilidad;
    private String dispHoraria;
    private String docAdicional;
    private Programa programa;
    private int dni;
    private String sexo;
    private int edad;
    
    public Postulante(){
        
    }

    public Postulante(NivelEducativo nivelEducativo, Perfil perfil, String movilidad, String dispHoraria, String docAdicional, Programa programa, int dni, String sexo, int edad, String nombre, int cuil_cuit, String domicilo, int telefonoPrincipal, int telefonoAltarnativo, String email) {
        super(nombre, cuil_cuit, domicilo, telefonoPrincipal, telefonoAltarnativo, email);
        this.nivelEducativo = nivelEducativo;
        this.perfil = perfil;
        this.movilidad = movilidad;
        this.dispHoraria = dispHoraria;
        this.docAdicional = docAdicional;
        this.programa = programa;
        this.dni = dni;
        this.sexo = sexo;
        this.edad = edad;
    }

    public NivelEducativo getNivelEducativo() {
        return nivelEducativo;
    }

    public void setNivelEducativo(NivelEducativo nivelEducativo) {
        this.nivelEducativo = nivelEducativo;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public String getMovilidad() {
        return movilidad;
    }

    public void setMovilidad(String movilidad) {
        this.movilidad = movilidad;
    }

    public String getDispHoraria() {
        return dispHoraria;
    }

    public void setDispHoraria(String dispHoraria) {
        this.dispHoraria = dispHoraria;
    }

    public String getDocAdicional() {
        return docAdicional;
    }

    public void setDocAdicional(String docAdicional) {
        this.docAdicional = docAdicional;
    }

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
