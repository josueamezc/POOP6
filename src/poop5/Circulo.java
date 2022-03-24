/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *
 * @author alumno
 */
public class Circulo {
    
    static double PI=3.1416;
    private double radio;
    /**
    Constructor vacio, no recibe nada ni hace nada.
    */
    Circulo(){
    }
    /**
    Constructor con los atributos que pueden ser manipulables aunque sean private
     * @param radio es el parametro del radio
    */
    public Circulo(double radio) {
        this.radio = radio;
    }
    /**
    Se calcula el perimetro y no necesita recibir como tal ningun valor ya que lo hace
    el método que está dentro de la misma clase que los atributos asi que solo los toma
    e imprime.
    */
    public void perimetro(){
        double perimetro=2*PI*radio;
        System.out.println("Perimetro: "+perimetro);
    }
    /**
    Se calcula el area y no necesita recibir como tal ningun valor ya que lo hace
    el método que está dentro de sla misma clase que los atributos asi que solo los toma
    e imprime.
    */
    public void area(){
        double area = PI*radio*radio;
        System.out.println("Area: "+area);
    }
    /**
    El get nos sirve para poder tomar este valor y poder imprimirlo desde la clase principal
     * @return radio retorna el radio
    */
    public double getRadio(){
        return radio;
    }
    /**
    Con este metodo podemos asignarle un radio a nuestro circulo para poder sacarle el area
    y perimetro, pero antes de eso se verifica si el valor que le damos es menor a 0 entonces le
    dará un valor al radio = 1, de lo contrario le da el valor que el usuario le asigna.
     * @param radio recibe el radio para poder hacer los calculos
    */
    public void setRadio(double radio){
        if(radio<0){
            radio=1;
        }
        this.radio=radio;
    }
    /**
    toString para poder imprimir la información del circulo con lo que contiene en sus atributos, al
    menos en este caso el radio.
    */
    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
    
        
}
