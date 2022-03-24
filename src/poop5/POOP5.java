/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop5;

/**
 *
 * @author alumno
 */
public class POOP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circulo cir=new Circulo();
        cir.setRadio(5);
        cir.area();
        cir.perimetro();
        /**Se crea un nuevo circulo de nombre cir y se le añade el radio
        Se ejecutan los métodos para calcular el área y el perímetro
        */
        
        double radio=cir.getRadio();
        /**
        Se extra el valor del radio guardandolo en nueva variable de tipo double
        */
        System.out.println("Radio: "+radio);
        System.out.println(cir);
        Circulo cir2= new Circulo();
        cir2.setRadio(-15);
        /**
        Se crea un segundo Circulo el caul se le asigna un valor negativo
        la impresión es basandose en la condicional que tenemos en esa clase
        por lo cual se le da un valor de 1 al radio.
        */
        System.out.println("cir2: "+cir2);
        System.out.println("---------------------------");
        Persona Per1= new Persona();
        System.out.println(Per1);
        /**
        Se crea una Persona la cual se manda a imprimir de manera directa pero sin
        asignarle nada de información por lo cual debería devolvernos algunos null y 0
        segun sean datos primitivos o no.
        */
        Per1.setNombre("Jorge");
        Per1.setApellido("Ramirez");
        Fecha fecha= new Fecha(2,3,1998);
        /**
        Le agregamos valores a la Per1 que es nuestra primera persona por lo cual tambien
        le agregamos su fecha recordando que Fecha es un objeto.
        */
        System.out.println(fecha);
        Per1.setFnacimiento(fecha);
        /**
        asignamos la fecha creada a la fecha de nacimiento de la Per1.
        */
        System.out.println("--------------------------");
        Per1.setEdad(24);
        System.out.println(Per1);
        Fecha fecha2= new Fecha(1,2,1997);
        Persona Persona2 = new Persona("Carlos","Gutierrez",fecha2,25);
        /**
        Creamos la segunda persona y le añadimos los valores directamente en el constructor
        por lo cual hemos creado una fecha2 la cual simplemente la asignamos en el constructor.
        */
        System.out.println("--------------------------");
        Persona Persona3 = new Persona("Fernanda","Perez",new Fecha(3,3,2001),21);
        System.out.println(Persona3);
        /**
        Se crea la tercera persona pero con la diferencia que no le creamos una variable para almancenar 
        su fecha sino que simplemente se lo asignamos creando ahi mismo la fecha.
        */
        System.out.println("--------------------------");
        Persona Persona4=new Persona("Julieta","Anaya",4,9,2000,21);
        /**
        Realizamos una pequeña modificacion ya que sobrecargamos al constructor por lo cual podemos usar
        un formato mas directo de fecha.
        */
        System.out.println(Persona4);
        
        Coche Mustang=new Coche("Rojo","Ford Mustang","AE1322",Per1,Persona2,Persona3,Persona4);
        System.out.println(Mustang);
        /**
        Creacion de un objeto de tipo coche el cual se le asignan los valores de sus atributos que son
        puras caracteristicas del carro, aparte de que se le asignan 4 personas: un conductor, un copiloto y 2
        pasajeros, por lo cual reciclamos las personas que ya habiamos creado y se las asignamos.
        */
        
    }
    
}
