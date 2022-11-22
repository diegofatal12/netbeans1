/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ClienteDao;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import modelo.Cliente;
import modelo.Direccion;

/**
 *
 * @author Usuario
 */
@Named(value = "clienteController")
@SessionScoped
public class ClienteController implements Serializable {

    /**
     * Creates a new instance of ClienteController
     */
    List<Cliente> clientes;
    Cliente registroSel;
    Cliente registroMod;
    Direccion registroModDireccion;
    
    public ClienteController() {
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Cliente getRegistroSel() {
        return registroSel;
    }

    public void setRegistroSel(Cliente registroSel) {
        this.registroSel = registroSel;
    }

    public Cliente getRegistroMod() {
        return registroMod;
    }

    public void setRegistroMod(Cliente registroMod) {
        this.registroMod = registroMod;
    }

    public Direccion getRegistroModDireccion() {
        return registroModDireccion;
    }

    public void setRegistroModDireccion(Direccion registroModDireccion) {
        this.registroModDireccion = registroModDireccion;
    }
    /*-----------------------------------
    -------------------------------------
    -------METODOS DE CONTROLADOR-------
    -------------------------------------
    -------------------------------------
    -------------------------------------
    */
    public List<Cliente> listarClientes(){
        ClienteDao cd = new ClienteDao();
        clientes = cd.getAll();
        return clientes;
    }
    public void prepararParaAgregarNuevo(){
        registroSel = new Cliente();
        registroMod = new Cliente();
    }
    public void agregarCliente(){
        ClienteDao cd = new ClienteDao();
        cd.agregar(registroMod);
        prepararParaAgregarNuevo();
    }
    public void modificarCliente(){
        ClienteDao cd = new ClienteDao();
        cd.modificar(registroMod);
        prepararParaAgregarNuevo();
    }
    public void prepararParaEditarCliente(){
        registroMod = registroSel;
    }
    public void eliminarCliente(){
        ClienteDao cd = new ClienteDao();
        cd.eliminar(registroSel);
        prepararParaAgregarNuevo();
    }
    public void visualizarDireccionesDelCliente(){
        if(registroSel!=null){
            ClienteDao cd = new ClienteDao();
            this.registroMod = cd.getOne(registroSel.getId());
        }
    }
}
