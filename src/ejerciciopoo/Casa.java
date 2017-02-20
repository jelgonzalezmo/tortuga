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
public class Casa {
    private Triangulo techo;
    private Rectangulo estructura;
    private Turtle tortuga;

    public Casa(Triangulo techo, Rectangulo estructura) {
        this.techo = techo;
        this.estructura = estructura;
        this.tortuga = new Turtle();
    }
    
    public void dibujar(){
    this.techo.dibujar(tortuga);
    this.estructura.dibujar(tortuga);
    }
    
    
    
    
    
    
}
