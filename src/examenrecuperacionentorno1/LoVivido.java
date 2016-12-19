/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenrecuperacionentorno1;

/**
 *
 * @author rgonzalezrasero
 */
import javax.swing.JOptionPane;

public class LoVivido {

public static void main(String[] args) {
String nombre;
String edad;

int mes;
int dias;
int horas;
int años;

nombre = JOptionPane.showInputDialog ("Escriba su nombre: ");
edad = JOptionPane.showInputDialog ("Escriba su edad: ");
 
años = Integer.parseInt (edad);
 
mes = (años*12);
dias = (años*365);
horas = (dias*24);
 
 JOptionPane.showMessageDialog(null,  "Meses: "  +mes,"Numero de meses vividos de " +nombre,JOptionPane.INFORMATION_MESSAGE);


 JOptionPane.showMessageDialog(null, "Días: " +dias,"Numero de días vividos de "+nombre,JOptionPane.INFORMATION_MESSAGE);


 JOptionPane.showMessageDialog(null, "Horas: " +horas,"Numero de horas vividos de "+nombre,JOptionPane.INFORMATION_MESSAGE);

   System.exit (0);

}
   

}
