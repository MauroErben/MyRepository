/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.muni;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
public class Postulante extends Persona {
    @Id
    @GeneratedValue
    @Column(name = "id_postulante")
    private long id;
    
    private NivelEducativo nivelEducativo;
    
    private Perfil perfil;
    @Column(name = "movilidad")
    private String movilidad;
    @Column(name = "dispHoraria")
    private String dispHoraria;
    @Column(name = "docAdicional")
    private String docAdicional;
    private Programa programa;
    @Column(name = "dni")
    private int dni;
    @Column(name = "sexo")
    private String sexo;
    @Column(name = "edad")
    private int edad;
    private Persona persona;
    private Usuario usuario;
    @Column(name = "apellido")
    private String apellido;

    public Postulante() {

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

    @OneToMany(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
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

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
