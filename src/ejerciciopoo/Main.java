/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopoo;

/**
 *
 * @author Estudiante
 */
public class Main {
    public static void main(String[] args) {
       Rectangulo rectangulo=new Rectangulo(180,130);
       Triangulo triangulo =new Triangulo (104);
       Poligono poligono=new Poligono(4,40);
       Casa casa=new Casa(triangulo, rectangulo , poligono);
    casa.dibujar();
    
    }
}
