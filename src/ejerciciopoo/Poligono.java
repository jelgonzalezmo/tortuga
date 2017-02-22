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
public class Poligono {
    private int numero_lados;
    private int lados;

    public Poligono(int numero_lados, int lados) {
        this.numero_lados = numero_lados;
        this.lados = lados;
    }

public void dibujar(Turtle turtle){
     turtle.setPos(40,-80);
    for(int i=0;i<numero_lados;i++){
    int grados=((((numero_lados-2)*180)/(numero_lados)));
    turtle.right(grados);
    turtle.forward(this.lados);
    }
       
   }





}
