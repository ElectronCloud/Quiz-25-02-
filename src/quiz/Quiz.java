/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author jcarrero
 */
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fecha in = new Fecha (15, 03, 2018);
    Fecha fin = new Fecha (20, 02, 2019);
    CadenaSuministro  cadena = new Farmer("piolin", "huevos ricos", "av 31232", in, fin);
    
    CadenaSuministro ratail = new Retail ("hoha", "sdasda", "sadasda", in, fin);
    
    }
    
}
