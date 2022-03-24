/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *
 * @author alumno
 */
public class Coche {
    
    private String color;
    private String marca;
    private String placa;
    private Persona chofer;
    private Persona copiloto;
    private Persona pasajero1;
    private Persona pasajero2;
    /**
    Constructor vacio de coche
    */
    Coche(){
    }
    /**
    Constructor con todos los atributos del carro
     * @param color es el color del carro
     * @param marca es la marca del carro
     * @param placa es la identificacion del carro
     * @param chofer es la persona en el puesto de chofer
     * @param copiloto es la persona en el puesto de copiloto
     * @param pasajero1 es la persona como pasajero 1
     * @param pasajero2 es la persona como pasajero 2
    */
    public Coche(String color, String marca, String placa, Persona chofer, Persona copiloto, Persona pasajero1, Persona pasajero2) {
        this.color = color;
        this.marca = marca;
        this.placa = placa;
        this.chofer = chofer;
        this.copiloto = copiloto;
        this.pasajero1 = pasajero1;
        this.pasajero2 = pasajero2;
    }
    /**
    @return el color para poder mandarlo a llamar.
    */
    public String getColor() {
        return color;
    }
    /**
    Sirve para poder darle un valor al atributo color recibiendo una cadena de nombre color.
     * @param color recibe el parametro del color
    */
    public void setColor(String color) {
        this.color = color;
    }
    /**
    @return la marca del carro.
    */
    public String getMarca() {
        return marca;
    }
    /**
    Nos permite darle una marca a nuestro carro debido a que tenemos la variable como privada
     * @param marca recibe la marca del carro
    */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    /**
    @return placa para poder obtener el contenido de esta cadena.
    */
    public String getPlaca() {
        return placa;
    }
    /**
    Recibe una cadena con el contenido perteneciente a lo que seria la placa para que así se le
    pueda asignar al atributo.
     * @param placa recibe la placa del carro
    */
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    /**
    @return el chofer que es una variable privada.
    */
    public Persona getChofer() {
        return chofer;
    }
    /**
    Nos permite asignarle una persona al chofer que es de tipo persona.
     * @param chofer recibe al chofer tipo persona
    */
    public void setChofer(Persona chofer) {
        this.chofer = chofer;
    }
    /**
    @return al copiloto para poder imprimir o consultar su infomación
    */
    public Persona getCopiloto() {
        return copiloto;
    }
    /**
    Nos permite recibir un objeto de tipo persona para darle el atributo de copiloto.
     * @param copiloto recibe el copiloto tipo persona
    */
    public void setCopiloto(Persona copiloto) {
        this.copiloto = copiloto;
    }
    /**
     * 
    @return al pasajero1 de tipo Persona.
    */
    public Persona getPasajero1() {
        return pasajero1;
    }
    /**
    Nos permite recibir un objeto de tipo persona para darle el atributo de pasajero1.
     * @param pasajero1 recibe al parametro pasajero 1 tipo persona
    */
    public void setPasajero1(Persona pasajero1) {
        this.pasajero1 = pasajero1;
    }
    /**
    Nos permite extraer la información de la Persona pasajero2.
     * @return al pasajero 2 retorna los datos del pasajero 2
    */
    public Persona getPasajero2() {
        return pasajero2;
    }
    /**
    Nos permite recibir un objeto de tipo persona para darle el atributo de pasajero2.
     * @param pasajero2 recibe el parametro pasajero 2 que es tipo Persona
    */
    public void setPasajero2(Persona pasajero2) {
        this.pasajero2 = pasajero2;
    }
    /**
    ToString que nos permite imprimir todo el contenido del objeto Coche, así como atributos y Personas con su respectivo nombre
    del atributo.
    */
    @Override
    public String toString() {
        return "Coche{" + "color=" + color + ", marca=" + marca + ", placa=" + placa + ", chofer=" + chofer + ", copiloto=" + copiloto + ", pasajero1=" + pasajero1 + ", pasajero2=" + pasajero2 + '}';
    }
    
    
    
}
