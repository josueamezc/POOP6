/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *
 * @author alumno
 */
public class Fecha {
    
    private int dia;
    private int mes;
    private int anio;
    /**
    Constructor vacio.
    */
    Fecha(){
    }
    /**
    Constructor Fecha para poder extraer información de estos atributos o agregarle información.
     * @param dia recibe el dia de tipo int
     * @param mes recibe el mes de tipo int
     * @param anio recibe el año de tipo int
    */
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    /**
    @return dia, retorna el dia 
    */
    public int getDia() {
        return dia;
    }
    /**
    Permite recibir un entero para darselo al atributo dia.
     * @param dia recibe el dia 
    */
    public void setDia(int dia) {
        this.dia = dia;
    }
    /**
    @return el mes.
    */
    public int getMes() {
        return mes;
    }
    /**
    Permite recibir un entero para darselo al atributo mes.
     * @param mes recibe el parametro del mes
    */
    public void setMes(int mes) {
        this.mes = mes;
    }
    /**
    @return el año.
    */
    public int getAnio() {
        return anio;
    }
    /**
    Permite recibir un entero para darselo al atributo año.
     * @param anio recibe el paramtreo de año
    */
    public void setAnio(int anio) {
        this.anio = anio;
    }
    /**
    ToString levemente modificado para que nos pueda imprimir un formato mas cómodo de
    leer de fecha.
    */
    @Override
    public String toString() {
        return " "+dia+"/"+mes+"/"+anio;
    }
    
}
