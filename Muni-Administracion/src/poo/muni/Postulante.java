/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.muni;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author oficina2
 */
@Entity
@Table(name = "postulante")
@PrimaryKeyJoinColumn(name = "id_personas", referencedColumnName = "id_personas")

public class Postulante extends Persona {
//    @Id
    @GeneratedValue
    @Column(name = "id_postulante")
    private long id;
    
//    private long id_nivel_educativo;
    
    //@Column(name = "id_nivel_educacion")
    @ManyToOne
    @JoinColumn(name="id_nivel_educacion")
    private NivelEducativo nivelEducativo;
   //private Perfil perfil;
    @Column(name = "movilidad")
    private String movilidad;
    @Column(name = "dispHoraria")
    private String dispHoraria;
    @Column(name = "docAdicional")
    private String docAdicional;
    //private Programa programa;
    @Column(name = "dni")
    private String dni;
    @Column(name = "sexo")
    private String sexo;
    @Column(name = "edad")
    private String edad;
    // private Persona persona;
    //private Usuario usuario;
    @Column(name = "apellido")
    private String apellido;

    public Postulante() {

    }

    public Postulante(Perfil perfil, String movilidad, String dispHoraria, String docAdicional, Programa programa, String dni, String sexo, String edad, String nombre, String cuil_cuit, String domicilo, String telefonoPrincipal, String telefonoAltarnativo, String email) {
        super(nombre, cuil_cuit, domicilo, telefonoPrincipal, telefonoAltarnativo, email);
        //this.nivelEducativo = nivelEducativo;
        //this.perfil = perfil;
        this.movilidad = movilidad;
        this.dispHoraria = dispHoraria;
        this.docAdicional = docAdicional;
        //this.programa = programa;
        this.dni = dni;
        this.sexo = sexo;
        this.edad = edad;
        this.nivelEducativo= new NivelEducativo("primaria","primaria");
    }

    public NivelEducativo getNivelEducativo() {
        return nivelEducativo;
    }
    
    public void setNivelEducativo(NivelEducativo nivelEducativo) {
        this.nivelEducativo = nivelEducativo;
    }
//    public Perfil getPerfil() {
//        return perfil;
//    }
//
//    public void setPerfil(Perfil perfil) {
//        this.perfil = perfil;
//    }
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

//    public Programa getPrograma() {
//        return programa;
//    }
//
//    public void setPrograma(Programa programa) {
//        this.programa = programa;
//    }
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

//    @OneToOne(cascade = CascadeType.ALL)
//    @PrimaryKeyJoinColumn
//    public Persona getPersona() {
//        return persona;
//    }
//
//    public void setPersona(Persona persona) {
//        this.persona = persona;
//    }
    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

//    public Usuario getUsuario() {
//        return usuario;
//    }
//
//    public void setUsuario(Usuario usuario) {
//        this.usuario = usuario;
//    }
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

//    public long getId_nivel_educativo() {
//        return id_nivel_educativo;
//    }
//
//    public void setId_nivel_educativo(long id_nivel_educativo) {
//        this.id_nivel_educativo = id_nivel_educativo;
//    }
}
