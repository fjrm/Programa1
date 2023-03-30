import java.util.Scanner; /*dentro del paquete java.util, Scanner es una clase 
                          que permite obtener la entrada de datos primitivos. 
                          Esto quiere decir que se pueden capturar datos del 
                          tipo int, double, string y etc.*/

public class ServicioEcoNombre {

    public static void main(String[] args) {

        //Lee la entrada del usuario y lo almacena en la variable scanner
        Scanner consola = new Scanner(System.in); //para intoducir algo por consola (System.in)

        // Solicita el mensaje, de forma dinámica (NO estática como en 'Programa1.java')
        System.out.println("Introduce tu nombre: ");

        //Lee la cadena escrita por el usuario y lo asigna a la variable mensaje
        String nombre = consola.nextLine(); //nextLine lee una linea completa
        
        // Imprime el mensaje introducido por el usuario
        System.out.println("Tu nombre es: " + nombre);
        
        // Solicita el mensaje, de forma dinámica (NO estática como en 'Programa1.java')
        System.out.println("Introduce tus apellidos: ");

        //Lee la cadena escrita por el usuario y lo asigna a la variable mensaje
        String apellidos = consola.nextLine(); //nextLine lee una linea completa
        
        // Imprime el mensaje introducido por el usuario
        System.out.println("Tus apellidos son: " + apellidos);
        
        // Imprime el mensaje introducido por el usuario
        System.out.println("Tu nombre y apellidos son: " + nombre + " " + apellidos);
        
    }
        
}
