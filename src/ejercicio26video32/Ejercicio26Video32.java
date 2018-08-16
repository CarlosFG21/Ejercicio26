/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio26video32;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Ejercicio26Video32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        coche2 car = new coche2();
        
        car.establecer_color(JOptionPane.showInputDialog("INTRODUCE COLOR"));
     
        System.out.println(car.dime_datos_generales());
        
        System.out.println(car.dime_color());
        
        car.establecer_color(JOptionPane.showInputDialog("TIENE ASIENTOS DE CUERO"));
        
        System.out.println(car.dime_asientos());
        
        car.establecer_color(JOptionPane.showInputDialog("TIENE CLIMATIZADOR"));
        
        System.out.println(car.dime_climatizador());
        
        System.out.println(car.dime_peso_coche());
        
        System.out.println("EL PRECIO FINAL DEL AUTOMOVIL ES: " + car.precio_coche());
        
        
    }
    
}
