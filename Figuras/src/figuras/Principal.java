/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras;

/**
 *
 * @author YONNATTANTH
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       VentanaPrincipal miVentanaPrincipal; /* Define la ventana
principal */
miVentanaPrincipal= new VentanaPrincipal(); /* Crea la ventana
principal */
miVentanaPrincipal.setVisible(true); /* Establece la ventana
como visible */
// Establece que la ventana no puede cambiar su tamaño
miVentanaPrincipal.setResizable(false); 
    }
    
}
