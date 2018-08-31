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
public abstract class Persona {
    private String nombre;
    private int cuil_cuit;
    private String domicilo;
    private int telefonoPrincipal;
    private int telefonoAltarnativo;
    private String email;
    
    public Persona(){
        
    }

    public Persona(String nombre, int cuil_cuit, String domicilo, int telefonoPrincipal, int telefonoAltarnativo, String email) {
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

    public int getCuil_cuit() {
        return cuil_cuit;
    }

    public void setCuil_cuit(int cuil_cuit) {
        this.cuil_cuit = cuil_cuit;
    }

    public String getDomicilo() {
        return domicilo;
    }

    public void setDomicilo(String domicilo) {
        this.domicilo = domicilo;
    }

    public int getTelefonoPrincipal() {
        return telefonoPrincipal;
    }

    public void setTelefonoPrincipal(int telefonoPrincipal) {
        this.telefonoPrincipal = telefonoPrincipal;
    }

    public int getTelefonoAltarnativo() {
        return telefonoAltarnativo;
    }

    public void setTelefonoAltarnativo(int telefonoAltarnativo) {
        this.telefonoAltarnativo = telefonoAltarnativo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
