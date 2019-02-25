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
public class Producto {
    private String nombre;
    private ArrayList<String> items;
    private double precio;
    private String codigo;
    

    public Producto(String nombre, ArrayList<String> items, double precio, String codigo) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
        this.items = items;
    }

    public Producto(String nombre, ArrayList<String> items) {
        this.nombre = nombre;
        this.items = items;
    }
    
    public void addItem(String item){
        items.add(item);
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
}
