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
public class Manufacturer extends CadenaSuministro {
    
    protected ArrayList<Producto> productos;
    protected ArrayList<Farmer> granjas;

    public Manufacturer(String nombre, String descripcion, String direccion, Fecha finicio, Fecha fFinal) {
        super(nombre, descripcion, direccion, finicio, fFinal);
        this.productos = new ArrayList<>();
    }

    
    
    public void addProducto(String nombre, ArrayList<String> items){
        Producto producto = new Producto (nombre, items);
        productos.add(producto);
    }
    
    public void addGranja (String nombre, String descripcion, String direccion, Fecha in, Fecha fin){
        Farmer farmer = new Farmer (nombre, descripcion, direccion, in, fin);
        granjas.add(farmer);
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }
    
    
}
