/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.muni;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

/**
 *
 * @author oficina2
 */
@Entity
@Table(name = "abstractpersonas")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_personas")
    private long id;
    @Column(name = "nombreUsuarios")
    private String nombreUsuario;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "cuil_cuit")
    private String cuil_cuit;
    @Column(name = "domicilio")
    private String domicilo;
    @Column(name = "telPrincipal")
    private String telefonoPrincipal;
    @Column(name = "telAlternativo")
    private String telefonoAltarnativo;
    @Column(name = "email")
    private String email;

    public Persona() {

    }

    public Persona(String nombre, String cuil_cuit, String domicilo, String telefonoPrincipal, String telefonoAltarnativo, String email) {
        this.nombre = nombre;
        this.cuil_cuit = cuil_cuit;
        this.domicilo = domicilo;
        this.telefonoPrincipal = telefonoPrincipal;
        this.telefonoAltarnativo = telefonoAltarnativo;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuil_cuit() {
        return cuil_cuit;
    }

    public void setCuil_cuit(String cuil_cuit) {
        this.cuil_cuit = cuil_cuit;
    }

    public String getDomicilo() {
        return domicilo;
    }

    public void setDomicilo(String domicilo) {
        this.domicilo = domicilo;
    }

    public String getTelefonoPrincipal() {
        return telefonoPrincipal;
    }

    public void setTelefonoPrincipal(String telefonoPrincipal) {
        this.telefonoPrincipal = telefonoPrincipal;
    }

    public String getTelefonoAltarnativo() {
        return telefonoAltarnativo;
    }

    public void setTelefonoAltarnativo(String telefonoAltarnativo) {
        this.telefonoAltarnativo = telefonoAltarnativo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
}
