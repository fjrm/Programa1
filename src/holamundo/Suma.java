import java.util.Scanner; /*dentro del paquete java.util, Scanner es una clase 
                          que permite obtener la entrada de datos primitivos. 
                          Esto quiere decir que se pueden capturar datos del 
                          tipo int, double, string y etc.*/

public class Suma {

    public static void main(String[] args) {
        // Solicita el mensaje, de forma dinámica (NO estática como en 'Programa1.java')

        //Lee la entrada del usuario y lo almacena en la variable consola
        Scanner consola = new Scanner(System.in); 

        // Imprime el mensaje introducido por el usuario
        System.out.println("Introduce el primer número: ");

        //Lee la cadena escrita por el usuario y lo asigna a la variable mensaje
        //String a = consola.nextLine(); //nextLine lee una linea completa
        
        //convertir un 'String' a 'int'
        //int c = Integer.parseInt(a); 
        
        //convertir un 'String' a 'int' y nextLine lee una linea completa
        //'Integer' es una clase y 'parseInt' un método
        //La variable 'consola' llama a la función 'nextLine' (por eso se usan los paréntesis)
        int a = Integer.parseInt(consola.nextLine());  
        
        // Imprime el mensaje introducido por el usuario
        System.out.println("El primer número es: " + a);
        
        // Imprime el mensaje introducido por el usuario
        System.out.println("Introduce el segundo número: ");

        //Lee la cadena escrita por el usuario y lo asigna a la variable mensaje
        //String b = consola.nextLine(); //nextLine lee una linea completa
        
        //convertir un 'String' a 'int'
        //int d = Integer.parseInt(b); 
        
        //convertir un 'String' a 'int' y nextLine lee una linea completa
        //'Integer' es una clase y 'parseInt' un método
        //La variable 'consola' llama a la función 'nextLine' (por eso se usan los paréntesis)
        int b = Integer.parseInt(consola.nextLine()); 
        
        // Imprime el mensaje introducido por el usuario
        System.out.println("El segundo número es: " + b);
        
        //int resultado = c + d;
        
        int resultado = a + b;
        
        // Imprime el mensaje introducido por el usuario
        System.out.println("El resultado de la suma es: " + resultado);
        
    }
        
}
