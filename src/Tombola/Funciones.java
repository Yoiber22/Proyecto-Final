package Tombola;

import static Tombola.Config.*;
import java.util.InputMismatchException;

public class Funciones {
    
    public static void pedir_numeros(int cant_numero_pedir, boolean[] jugada, int[] numeros_jugados) {
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
    
    public static int ingresar_dinero(){
        while (true){
            try {
                System.out.print("\nIngrese cantidad de dinero a apostar: ");
                int dinero_ingresado = input.nextInt();
                if (dinero_ingresado >= 40  && dinero_ingresado <= 400){
                    int dinero_apostado = dinero_ingresado;
                    se_realizo_apuesta = true;
                    System.out.println("\nApuesta realizada exitosamente.\n");
                    return dinero_apostado;
                } else {
                    System.out.println("El monto a apostar debe ser entre 40$ y 400$.\n");
                }
                
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese un número entero.");
                input.next();
            }
        }
    }
    
    public static void reiniciar_tombola(boolean[] jugada, boolean[] sorteo, int[] numeros_sorteados, int[] numeros_jugados){
        for (int i = 0; i < jugada.length; i++){
            jugada[i] = false;
            sorteo[i] = false;   
        }
        boolean se_realizo_sorte = false;
        se_realizo_apuesta = false;
        tipo_sorteo = "null";
        modalidad = 0;
        dinero_apostado_vespertino = 0;
        dinero_apostado_nocturno = 0;
        
        for (int i = 0; i < numeros_sorteados.length; i++){
            numeros_sorteados[i] = 0;
        }
        
        for (int i = 0; i < numeros_jugados.length; i++){
            numeros_jugados[i] = 0;
        }
    }
}
