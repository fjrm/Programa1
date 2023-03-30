import java.util.Scanner; /*dentro del paquete java.util, Scanner es una clase 
                          que permite obtener la entrada de datos primitivos. 
                          Esto quiere decir que se pueden capturar datos del 
                          tipo int, double, string y etc.*/

public class Suma {

    public static void main(String[] args) {

        //Lee la entrada del usuario y lo almacena en la variable scanner
        Scanner consola = new Scanner(System.in); //para intoducir algo por consola (System.in)

        // Solicita el mensaje, de forma dinámica (NO estática como en 'Programa1.java')
        System.out.println("Introduce el primer número: ");

        //Lee la cadena escrita por el usuario y lo asigna a la variable mensaje
        String a = consola.nextLine(); //nextLine lee una linea completa
        
        int c = Integer.parseInt(a); //convertir un 'String' a 'int'
        
        // Imprime el mensaje introducido por el usuario
        System.out.println("El primer número es: " + a);
        
        // Solicita el mensaje, de forma dinámica (NO estática como en 'Programa1.java')
        System.out.println("Introduce el segundo número: ");

        //Lee la cadena escrita por el usuario y lo asigna a la variable mensaje
        String b = consola.nextLine(); //nextLine lee una linea completa
        
        // Imprime el mensaje introducido por el usuario
        System.out.println("El segundo número es: " + b);
        
        int d = Integer.parseInt(b); //convertir un 'String' a 'int'
        
        int resultado = c + d;
        
        // Imprime el mensaje introducido por el usuario
        System.out.println("El resultado de la suma es: " + resultado);
        
    }
        
}
