package modelo;
// Generated 17 nov. 2022 18:59:52 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private String apellido;
     private String dni;
     private String direccion;
     private String telefono;
     private String nota;
     private String pais;
     private Set<Direccion> direccions = new HashSet<Direccion>(0);
     private Set<Venta> ventas = new HashSet<Venta>(0);

    public Cliente() {
    }

    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    
    public Cliente(String nombre, String apellido, String dni, String direccion, String telefono, String nota, String pais, Set<Direccion> direccions, Set<Venta> ventas) {
       this.nombre = nombre;
       this.apellido = apellido;
       this.dni = dni;
       this.direccion = direccion;
       this.telefono = telefono;
       this.nota = nota;
       this.pais = pais;
       this.direccions = direccions;
       this.ventas = ventas;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDni() {
        return this.dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getNota() {
        return this.nota;
    }
    
    public void setNota(String nota) {
        this.nota = nota;
    }
    public String getPais() {
        return this.pais;
    }
    
    public void setPais(String pais) {
        this.pais = pais;
    }
    public Set<Direccion> getDireccions() {
        return this.direccions;
    }
    
    public void setDireccions(Set<Direccion> direccions) {
        this.direccions = direccions;
    }
    public Set<Venta> getVentas() {
        return this.ventas;
    }
    
    public void setVentas(Set<Venta> ventas) {
        this.ventas = ventas;
    }




}


