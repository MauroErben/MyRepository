/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.muni;

import java.util.Date;

/**
 *
 * @author oficina2
 */
public class Empresa extends Persona{
    private Perfil perfil;
    private String representanteLegal;
    private String sede;
    private int cantidadTrabajadores;
    private String razonSocial;
    private Date fechaDeContacto;
    private String tipoDeContacto;

    public Empresa() {
    }

    public Empresa(Perfil perfil, String representanteLegal, String sede, int cantidadTrabajadores, String razonSocial, Date fechaDeContacto, String tipoDeContacto, String nombre, String cuil_cuit, String domicilo, String telefonoPrincipal, String telefonoAltarnativo, String email) {
        super(nombre, cuil_cuit, domicilo, telefonoPrincipal, telefonoAltarnativo, email);
        this.perfil = perfil;
        this.representanteLegal = representanteLegal;
        this.sede = sede;
        this.cantidadTrabajadores = cantidadTrabajadores;
        this.razonSocial = razonSocial;
        this.fechaDeContacto = fechaDeContacto;
        this.tipoDeContacto = tipoDeContacto;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public int getCantidadTrabajadores() {
        return cantidadTrabajadores;
    }

    public void setCantidadTrabajadores(int cantidadTrabajadores) {
        this.cantidadTrabajadores = cantidadTrabajadores;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public Date getFechaDeContacto() {
        return fechaDeContacto;
    }

    public void setFechaDeContacto(Date fechaDeContacto) {
        this.fechaDeContacto = fechaDeContacto;
    }

    public String getTipoDeContacto() {
        return tipoDeContacto;
    }

    public void setTipoDeContacto(String tipoDeContacto) {
        this.tipoDeContacto = tipoDeContacto;
    }
    
}
