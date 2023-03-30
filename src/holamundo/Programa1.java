/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holamundo;

/**
 *
 * @author Javi
 */

public class Programa1 {
    
    //donde empieza el programa Java
    public static void main(String[] args) {
        byte edad = 30; //valor entre -128 y 127
        //byte edad = 32; //valor entre -128 y 127 
        /*Da error al declarar otra vez la variable de tipo 'byte'. Para asignar 
        otro valor a la variable NO hay que volver a declarar el tipo de 
        variable ni declararla usando otro tipo de variable (ver ejemplo del 
        'int value')*/
        double edad1 = 32; //valor entre -128 y 127
        System.out.println("La edad es: " + edad + " años");
        System.out.println("La edad es: " + edad1 + " años");
        
        
        int value = 10;
        System.out.println(value);
        value = 4;
        System.out.println(value);
        
        
        boolean flag = false;
        //flag = 42; //no funciona
        System.out.println(flag);
        int value1 = 10;
        //flag = value1; //tampoco funciona
        System.out.println(value1);
        
        
        int flag1 = 42; 
        int value2 = 12;
        flag1 = value2; 
        System.out.println(flag1);
        System.out.println("value2 = " + value2); //escribir 'soutv' y tabular
        System.out.println("flag1 = " + flag1); //escribir 'soutv' y tabular
       
        
        double floatPointing = 0.42;/*a un decimal SÍ se le puede asignar un 
                                    número entero (al revés NO)*/
        floatPointing = 1; 
        int value3 = 15;
        floatPointing = value3; 
        System.out.println("value3 = " + value3); //escribir 'soutv' y tabular
        System.out.println("floatPointing = " + floatPointing); /*escribir 
                                                                'soutv' y 
                                                                tabular*/
        
        
//        int value4 = 4.2; //no funciona
//        double floatPointing1 = 0.42;
//        value4 = floatPointing1;
//        System.out.println("floatPointing1 = " + floatPointing1); 
        
        
        //conversión implícita
        int y = 45;
        double v = y;
        System.out.println("v = " + v);
        
        //conversión explícita (casting)
        double v1 = 4.5;
        int y1 = (int) v1;
        System.out.println("y1 = " + y1); //imprime el '4' (NO la parte decimal)
        
        
        //ASCII. El '64' en ASCII es la '@'
        byte h = 64;
        char hh = (char) h;
        System.out.println("h = " + h);
        System.out.println("hh = " + hh);
        
        
        int first = 2;
        System.out.println(first); //imprime 2
        int second = 4;
        System.out.println(second); //imprime 4
        int sum = first + second; //asigna la suma a la variable sum
        //System.out.println(sum); //imprime 6 
        System.out.println("El resultado de la suma es: " + sum); //imprime 6 
        //el '+' sirve para concatenar 'sum' con "El resultado de la suma es: "
        
        int first1 = 2;
        System.out.println(first1); //imprime 2
        int second1 = 4;
        System.out.println(second1); //imprime 4
        int rest = first1 - second1; //asigna la resta a la variable rest
        //System.out.println(rest); //imprime -2
        System.out.println("El resultado de la resta es: " + rest); //imprime -2 
        
        
        int first2 = 2;
        System.out.println(first2); //imprime 2
        int second2 = 4;
        System.out.println(second2); //imprime 4
        int mult = first2 * second2; //asigna la multiplicación a la variable mult
        //System.out.println(mult); //imprime 8
        System.out.println("El resultado de la multiplicación es: " + mult); //imprime 8 
        
        
        int first3 = 2;
        System.out.println(first2); //imprime 2
        int second3 = 4;
        System.out.println(second3); //imprime 4
        int div = first3 / second3; //asigna la multiplicación a la variable mult
        //System.out.println(div); //imprime 0
        System.out.println("El resultado de la división es: " + div); //imprime 0
        
        
        System.out.println("Cuatro: " + (2 + 2)); //aquí es una suma
        System.out.println("ventidos: " + 2 + 2);
        /*con la suma, el compilador no entiende si es una concatenación de 
        caracteres o una suma*/
        
        
        int $valor = 11;
        int _valor = 11;
        int H_L_M = 11;
        int a, b, c; //por defecto, estas tres variables valen '0'
        int a1, b1, c1 = 11;
        int d, e, F;
        
        
        
        //opciones NO válidas
        //int #valor = 11;
        //int ¿valor = 11;
        //int 1valor = 11;
        //int 123 = 11;
        //int .p = 11;
        //int %p = 11;
        //int_H_L_M = 11;
        //int g, o, m; = 0;
        //int g, int o, int s = 11;
        
       
    /*  byte bb = 1;
        bb = bb + 1; //a un byte no se le puede sumar un entero
        System.out.println("bb = " + bb);*/
        
        int bb = 1;
        bb = bb + 1; //a un byte no se le puede sumar un entero
        System.out.println("bb = " + bb);
        
        
        int edad0 = 34;
        System.out.println("edad0 = " + edad0); //edad 34
        edad0++; //incremento de 1
        System.out.println("edad0 = " + edad0); //edad 35
        edad0++; //incremento de 1
        System.out.println("edad0 = " + edad0); //edad 36
        edad0--; //decremento de 1
        System.out.println("edad0 = " + edad0); //edad 35
        
        
        int n = 4;
        n--; //decremento de 1 (n=n-1)
        //--n; //nueva variable para decremento de 1 (n=n-1)
        System.out.println(n); //imprime 3
        System.out.println(--n); //decremento de 1. Imprime 2 
        //System.out.println(n); //imprime 2
        
        
        System.out.println("Result: " + 2 + 3 + 5); //imprime 235 (NO suma)
        System.out.println("Result: " + 2 + 3 * 5); //imprime 215 (SÍ calcula)
        
         
        //bucle for
        for(int i = 0; i <= 10; i++){
            System.out.println("i = " + i);
        }
        
        
        //condicional if
        int edad01 = 15;
        
        if(edad01 == 18){
            System.out.println("Puede entrar en la discoteca");
        }else{
            System.out.println("Es menor de edad. NO puede entrar en la discoteca");
        }
        
        
        int r = 10;
        
        if(r%2 == 0){
            System.out.println("El número es par");
        }else{
            System.out.println("El número es impar");
        } 
         
        
        int r1 = 19;
        int r2 = 5;
        
        if(r1%r2 != 0){
            System.out.println("El número es impar");
        }else{
            System.out.println("El número es par");
        } 
        
        
        
        
    }
    
}
