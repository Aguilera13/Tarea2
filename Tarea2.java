/*
 * Crear un programa que permita solicitar una sola línea. Por ejemplo: 
 * "3 + 2"
 * La idea es capturar esa cadena, separarla en valores y el operador. Según el 
 * operador decidir la operación y finalmente mostrar el resultado.
 */
package tarea2;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author mario
 */
public class Tarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String texto, temp;
        int seleccion, valorA, valorB=0;
        //Entrada de datos
        Scanner entrada = new Scanner(System.in);
        System.out.println("Seleccione la operacion basica de matematica que "
                + "desea realizar:\n1. Suma\n2. Resta\n3. Multiplicacion\n"
                + "4. Division");
        seleccion = entrada.nextInt();
        texto = entrada.nextLine();
        System.out.println("Ingrese la operacion matematica selaccionada, "
                + "separando con espacio los numeros y el operador "
                + "(ejemplo: 2 + 3 )");
        texto = entrada.nextLine();
        //Separacion de la cadena
        StringTokenizer tkns = new StringTokenizer(texto);
        //while(tkns.hasMoreElements()){
        temp = tkns.nextToken();
        valorA = Integer.parseInt(temp);
       
        if (tkns.hasMoreElements()){
            temp = tkns.nextToken();
            
        }
        if (tkns.hasMoreElements()){
            temp = tkns.nextToken();
            valorB = Integer.parseInt(temp);
        }
        switch(seleccion){
            case 1: System.out.println("La suma es: "+(valorA + valorB)); 
                    break;
            case 2: System.out.println("La resta es: "+(valorA - valorB)); 
                    break;
            case 3: System.out.println("La multiplicacion es: "+(valorA * valorB));
                    break;
            case 4: System.out.println("La division es: "+(valorA / valorB)
                    +"\ny su reciduo es: "+(valorA%valorB));
                    break;
        }
    }
    
}
