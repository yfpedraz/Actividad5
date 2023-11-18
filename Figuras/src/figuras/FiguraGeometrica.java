/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author YONNATTANTH
 */
/**
* Esta clase denominada FiguraGeométrica modela un figura
* geométrica que cuenta con un volumen y una superficie a ser
* calculados de acuerdo al tipo de figura geométrica.
* @version 1.2/2020
*/
public class FiguraGeometrica {
    private double volumen; /* Atributo que identifica el volumen de
una figura geométrica */
private double superficie; /* Atributo que identifica la superficie de
una figura geométrica */
/**
* Método para establecer el volumen de una figura geométrica
* @param volumen Parámetro que define el volumen de una figura
* geométrica
*/
public void setVolumen(double volumen) {
this.volumen = volumen;
}
/**
* Método para establecer la superficie de una figura geométrica
* @param superficie Parámetro que define la superficie de una
* figura geométrica
*/
public void setSuperficie(double superficie) {
this.superficie = superficie;
}
/**
* Método para obtener el volumen de una figura geométrica
* @return El volumen de una figura geométrica
*/
public double getVolumen() {
return this.volumen;
}
/**
* Método para obtener la superficie de una figura geométrica
* @return La superficie de una figura geométrica
*/
public double getSuperficie() {
return this.superficie;
}

}
