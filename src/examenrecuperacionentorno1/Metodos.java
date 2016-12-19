/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenrecuperacionentorno1;

import javax.swing.JOptionPane;

/**
 *
 * @author rgonzalezrasero
 */
public class Metodos {
    private String nombre;
    private String edad;
private int mes;
private int dias;
private int horas;
private int años;
    public Metodos() {
    }
    
    public void pedirDatos(){
nombre = JOptionPane.showInputDialog ("Escriba su nombre: ");
edad = JOptionPane.showInputDialog ("Escriba su edad: ");
}
    
    public int tiempoVivido (){
   




años = Integer.parseInt (edad);
 
mes = (años*12);
dias = (años*365);
horas = (dias*24);

return años;
        
    }
    
    public void resultado(){
        JOptionPane.showMessageDialog(null,  "Meses: "  +mes,"Numero de meses vividos de " +nombre,JOptionPane.INFORMATION_MESSAGE);


 JOptionPane.showMessageDialog(null, "Días: " +dias,"Numero de días vividos de "+nombre,JOptionPane.INFORMATION_MESSAGE);


 JOptionPane.showMessageDialog(null, "Horas: " +horas,"Numero de horas vividos de "+nombre,JOptionPane.INFORMATION_MESSAGE);

   System.exit (0);
    }
    
}
