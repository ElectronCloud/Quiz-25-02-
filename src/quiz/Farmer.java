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
public class Farmer extends CadenaSuministro {
    
    private ArrayList<String> cultivos;

    public Farmer(String nombre, String descripcion, String direccion, Fecha finicio, Fecha fFinal) {
        super(nombre, descripcion, direccion, finicio, fFinal);
        this.cultivos = new ArrayList<>();
    }

    
    
    public void addCultivo(String string){
        cultivos.add(string);
    }

    public ArrayList<String> getCultivos() {
        return cultivos;
    }
    
    
}
