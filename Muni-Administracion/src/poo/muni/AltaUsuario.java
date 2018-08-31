/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.muni;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

/**
 *
 * @author oficina2
 */

@Entity
@Table(name = "usuario")
public class AltaUsuario {
    @Id
    private String nombre;
    @JoinColumn(name = "nombre")
    private String apellido;
    @JoinColumn(name = "apellido")
    //@JoinColumn(name = "apellido")
    private String  nombreUsuario;
    //@Column(name = "nombreUsuario")
    private String email;
    //@Column(name = "email")
    private char[] contraseña;
    private char[] confirmarContraseña;
    
    public AltaUsuario(){
        
    }
    
    public AltaUsuario(String nombre, String apellido, String nombreUsuario, String email, char[] contraseña, char[] confirmarContraseña){
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.contraseña = contraseña;
        this.confirmarContraseña = confirmarContraseña;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char[] getContraseña() {
        return contraseña;
    }

    public void setContraseña(char[] contraseña) {
        this.contraseña = contraseña;
    }

    public char[] getConfirmarContraseña() {
        return confirmarContraseña;
    }

    public void setConfirmarContraseña(char[] confirmarContraseña) {
        this.confirmarContraseña = confirmarContraseña;
    }
}
