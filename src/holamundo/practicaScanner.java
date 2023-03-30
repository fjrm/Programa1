import java.util.Scanner; /*dentro del paquete java.util, Scanner es una clase 
                          que permite obtener la entrada de datos primitivos. 
                          Esto quiere decir que se pueden capturar datos del 
                          tipo int, double, string y etc.*/

public class practicaScanner {

    public static void main(String[] args) {

        //Lee la entrada del usuario y lo almacena en la variable consola
        Scanner consola = new Scanner(System.in);
        
        // Imprime el mensaje introducido por el usuario
        System.out.println("Introduce tu nombre: ");

        //Lee la cadena escrita por el usuario y lo asigna a la variable mensaje
        String nombre = consola.nextLine(); //nextLine lee una linea completa
                
        // Imprime el mensaje introducido por el usuario
        System.out.println("Introduce tus apellidos: ");

        //Lee la cadena escrita por el usuario y lo asigna a la variable mensaje
        String apellidos = consola.nextLine(); //nextLine lee una linea completa
                
        // Imprime el mensaje introducido por el usuario
        System.out.println("Introduce tu DNI: ");

        //Lee la cadena escrita por el usuario y lo asigna a la variable mensaje
        String dni = consola.nextLine(); //nextLine lee una linea completa
               
        // Imprime el mensaje introducido por el usuario
        System.out.println("Introduce el precio de la matrícula: ");
        
        //convertir un 'String' a 'double' y nextLine lee una linea completa
        //'Double' es una clase y 'parseDouble' un método
        //La variable 'consola' llama a la función 'nextLine' (por eso se usan los paréntesis)
        double precioMatricula = Double.parseDouble(consola.nextLine());
                
        // Imprime el mensaje introducido por el usuario
        System.out.println("Indique si hay clases virtuales: ");
        
        //convertir un 'String' a 'Boolean' y nextLine lee una linea completa
        //'Boolean' es una clase y 'parseBoolean' un método
        //La variable 'consola' llama a la función 'nextLine' (por eso se usan los paréntesis)
        Boolean claseVirtual = Boolean.parseBoolean(consola.nextLine()); 
        
        // Imprime el mensaje introducido por el usuario
        System.out.println("Tu nombre y apellidos: " + nombre + " " + apellidos); 
      
        // Imprime el mensaje introducido por el usuario
        System.out.println("Tu DNI: " + dni);
        
        // Imprime el mensaje introducido por el usuario
        System.out.println("El precio de tu matrícula: " + precioMatricula + " €");
        
        // Imprime el mensaje introducido por el usuario
        System.out.println("¿Hay clases virtuales? " + claseVirtual);
        
    }
        
}
