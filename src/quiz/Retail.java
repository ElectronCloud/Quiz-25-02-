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
public class Retail extends Manufacturer {

    private ArrayList<DistributionCenter> centros;
    
    public Retail(String nombre, String descripcion, String direccion, Fecha finicio, Fecha fFinal) {
        super(nombre, descripcion, direccion, finicio, fFinal);
        this.productos = new ArrayList<>();
    }

    public void addProducto(String nombre, ArrayList<String> items, double precio, String codigo){
        Producto producto= new Producto (nombre, items, precio, codigo);
        this.productos.add(producto);
    }
}
