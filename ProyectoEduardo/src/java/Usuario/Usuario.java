/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuario;

/**
 *
 * @author Eduardo Moscoso
 */
public class Usuario {
    private String usuario;
    private String clave;
    private String nombre;
    

    public Usuario(){
    }



    public Usuario(String usuario, String clave, String nombre) {

        this.usuario = usuario;

        this.clave = clave;
        
        this.nombre = nombre;

    }



    public String getUsuario() {

        return usuario;

    }



    public void setUsuario(String usuario) {

        this.usuario = usuario;

    }



    public String getClave() {

        return clave;

    }



    public void setClave(String clave) {

        this.clave = clave;

    }
    
    public String getNombre() {

        return nombre;

    }



    public void setNombre(String nombre) {

        this.nombre = nombre;

    }


    @Override

    public String toString() {

        return "Usuario{" + "usuario=" + usuario + ", clave=" + clave + '}';

    }
}
