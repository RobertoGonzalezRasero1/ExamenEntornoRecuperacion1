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

// Instancio un objeto resul para visualizar llamar los metodos de otra clase
    Metodos resul = new Metodos();

    //Con esto llamo al metodo que introduce datos
resul.pedirDatos();
    
    //Con esto llamo al metodo que calcula el tiempo de vida 
resul.tiempoVivido();

    //Con esto muestro el resultado de los calculos del metodo anterior
resul.resultado();

 
 

}
   

}
