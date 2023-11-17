package Tombola;

import static Tombola.Config.*;
import java.util.InputMismatchException;

public class Funciones {
    
    public static void pedir_numeros(int cant_numero_pedir) {
        for (int i = 0; i < cant_numero_pedir; i++) {
            try {
                System.out.print("Ingrese el numero " + (i + 1) + ": ");
                int num_ingresado = input.nextInt();

                if (num_ingresado > 0 && num_ingresado < 100) {
                    jugada[num_ingresado] = true;
                    numeros_jugados[i] = num_ingresado;
                } else {
                    System.out.println("Solo se pueden ingresar numeros del 1 al 99");
                    i--;
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese un número entero.");
                input.next(); 
                i--;
            } 
        }
    }
    
    public static void ingresar_dinero(){
        while (true){
            try {
                System.out.print("\nIngrese cantidad de dinero a apostar: ");
                int dinero_ingresado = input.nextInt();
                if (dinero_ingresado >= 40  && dinero_ingresado <= 400){
                    cant_dinero = dinero_ingresado;
                    se_realizo_apuesta = true;
                    System.out.println("\nApuesta realizada exitosamente.");
                    break;
                } else {
                    System.out.println("El monto a apostar debe ser entre 40$ y 400$.\n");
                }
                
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese un número entero.");
                input.next();
            }
        }
    }
    
    public static void borrar_contenido_arreglos(){
        for (int i = 0; i < jugada.length; i++){
            jugada[i] = false;
            sorteo[i] = false;   
        }
        
        for (int i = 0; i < numeros_sorteados.length; i++){
            numeros_sorteados[i] = 0;
        }
        
        for (int i = 0; i < numeros_jugados.length; i++){
            numeros_jugados[i] = 0;
        }
    }
}
