/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopoo;

import ch.aplu.turtle.Turtle;
import java.awt.Color;

/**
 *
 * @author Estudiante
 */
public class Rectangulo {
    private int ancho;
    private int alto;

    public Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

   public void dibujar(Turtle turtle){
   turtle.setPos(-80,-50);
    turtle.left(90);
   turtle.back(this.alto);
   turtle.left(90);
   turtle.back(this.ancho);
   turtle.left(90);
   turtle.back(this.alto);
   turtle.left(90);
   turtle.back(this.ancho);
   turtle.left(90);
   turtle.setColor(Color.blue);
   turtle.setPos(-35,-120);
   turtle.back(60);
   turtle.left(90);
   turtle.back(30);
   turtle.left(90);
   turtle.back(60);
   turtle.left(90);
   turtle.back(30);
   turtle.left(90);
   }

   


}
