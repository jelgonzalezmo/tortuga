/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopoo;

import ch.aplu.turtle.Turtle;

/**
 *
 * @author Estudiante
 */
public class Triangulo {
    private int lado;

    public Triangulo(int lado) {
        this.lado = lado;
    }

   public void dibujar(Turtle turtle){
     turtle.setPos(-80,-50);
     turtle.right(60);
     turtle.forward(this.lado);
     turtle.right(60);
     turtle.forward(this.lado);
     turtle.left(30);
     turtle.back(180);
      
       
   }




}
