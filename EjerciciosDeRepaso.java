/*
 * Crear un programa que calcule el salario diario de un empleado. El programa 
 * debe solicitar:
 *
 *    Nombre del empleado
 *    Horas laboradas
 *    Precio de la hora laborada
 *
 * La salida esperada es:
 *
 *    Nombre del empleado
 *    Total a pagar
 *
 * En caso de que el usuario tenga más de 8 horas se establecerá el resto de 
 * horas como horas extras. Por ejemplo: si alguien labora 10 horas, 8 son 
 * normales y 2 son extras. Cuando se encuentren horas extras se agregará una 
 * hora más de pago, en resumen: La hora extra vale el doble que la normal.
 *
 * Si en el sistema se intenta ingresar más de 24 horas esto generará un mensaje 
 * que impida calcular el total. También debe validarse cuando las horas o el 
 * precio de la hora sean negativos.
 */
package ejerciciosderepaso;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class EjerciciosDeRepaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Declaraciòn de variables
        String nombre;
        float hrsLaboradas, hrsExtras, precioHora, totalPago;
        
        //Codigo para solicitud de datos por consola
        Scanner entrada = new Scanner(System.in);
        
        //Encabezado del Programa
        System.out.println("*********** PROGRAMA DE CALCULO DE SALARIO DIARIO **"
                + "*********\n\n");
        
        //Solicitud y asignacion de la variable nombre
        System.out.println("Nombre del Empleado: ");
        nombre = entrada.nextLine();
        
        //Solicitud, verificacion del valor (0 <= Hora <= 24) y asignacion de la 
        //variable hrsLaboradas
        System.out.println("\nCantidad de Horas Trabajadas: ");
        hrsLaboradas = entrada.nextFloat();
        while(hrsLaboradas<0 || hrsLaboradas>24){
            System.out.println("El valor introducido es incorrecto");
            System.out.println("\nCantidad de Horas Trabajadas: ");
            hrsLaboradas = entrada.nextFloat();
        }
        
        //Solicitud, verificacion del valor (>= 0) y asignacion de la variable 
        //precioHora
        System.out.println("\nPrecio por Hora Trabajada: ");
        precioHora = entrada.nextFloat();
        while(precioHora<0){
            System.out.println("El valor introducido es incorrecto");
            System.out.println("\nPrecio por Hora Trabajada: ");
            precioHora = entrada.nextFloat();
        }
        
        //Calculos
        hrsExtras = hrsLaboradas - 8;
        totalPago = (8 + hrsExtras * 2) * precioHora;
        
        //Salida de datos
        System.out.println("\nNombre: " + nombre);
        System.out.printf("Total a pagar: = %.2f", totalPago);
        System.out.println("\n\n");
    }
    
}
