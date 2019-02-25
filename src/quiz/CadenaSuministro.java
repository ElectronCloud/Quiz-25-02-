/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.util.ArrayList;

/**
 *
 * @author jcarrero
 */
public class CadenaSuministro {
    protected String nombre;
    protected String descripcion;
    protected String direccion;
    protected Fecha finicio;
    protected Fecha fFin;
    private ArrayList<Cliente> clientes;

    public CadenaSuministro(String nombre, String descripcion, String direccion, Fecha finicio, Fecha fFinal) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.finicio = finicio;
        this.fFin = fFin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Fecha getFinicio() {
        return finicio;
    }

    public void setFinicio(Fecha finicio) {
        this.finicio = finicio;
    }

    public Fecha getfFin() {
        return fFin;
    }

    public void setfFin(Fecha fFin) {
        this.fFin = fFin;
    }
    
   /* public void adquirirProducto(Cliente cliente){
        clientes.add(cliente);
        Retail retail = new Retail ();
        retail.getProductos();
    }*/
    
}
