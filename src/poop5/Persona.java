/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *
 * @author alumno
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private Fecha fnacimiento;
    private int edad;
    /**
    Constructor vacio.
    */
    Persona(){
    }
    /**
    Constructor para poder Obtener getters y setters para manejar la información de los atributos
    privados.
     * @param nombre recibe el nombre
     * @param apellido recibe el apellido
     * @param fnacimiento recibe el objeto fecha para crear una fecha de nacimiento
     * @param edad rebice un entero para la edad
    */
    public Persona(String nombre, String apellido, Fecha fnacimiento,int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fnacimiento = fnacimiento;
        this.edad=edad;
    }
    /**
    Sobrecarga al constructor para tener otra opcion de agregar la fecha de manera más directa dando tal cual
    los valores de tipo entero.
     * @param nombre recibe el nombre
     * @param apellido recibe el apellido
     * @param dia recibe el numero del dia como int
     * @param mes recibe el mes como int
     * @param anio recibe el año como int
     * @param edad recibe la edad como int
    */
    public Persona(String nombre, String apellido, int dia, int mes, int anio, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fnacimiento=new Fecha(dia,mes,anio);
        this.edad=edad;
        
    }
    /**
    * 
    @return el atributo nombre.
    */
    public String getNombre() {
        return nombre;
    }
    /**
    @return el atributo apellido.
    */
    public String getApellido() {
        return apellido;
    }
    /**
    @return el atributo Fnacimiento.
    */
    public Fecha getFnacimiento() {
        return fnacimiento;
    }
    /**
    @return el atributo edad.
    */
    public int getEdad() {
        return edad;
    }
    /**
    Recibe una cadena para poder asignarle el valor al atributo retornado en get.
     * @param nombre recibe el nombre que quieres 
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
    Recibe una cadena para poder asignarle el valor al atributo retornado en get.
     * @param apellido recibe al apellido para guardarlo
    */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    /**
    Recibe un int para poder asignarle el valor al atributo retornado en get.
     * @param edad recibe la edad como int
    */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
    Recibe una Fecha para poder asignarle el valor al atributo retornado en get.
     * @param fnacimiento recibe el objeto de Fecha
    */
    public void setFnacimiento(Fecha fnacimiento) {
        this.fnacimiento = fnacimiento;
    }
    /**
    ToString para poder obtener información de cada persona, esto gracias a los get que hicimos
    al inicio.
    */
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", fnacimiento=" + fnacimiento + ", edad=" + edad + '}';
    } 
    
}
