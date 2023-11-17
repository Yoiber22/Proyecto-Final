package Tombola;

import static Tombola.Config.*;

public class Sorteo {
    public static void hacer_sorteo(){
        while(true){
            
            if (se_realizo_apuesta){

                System.out.println("Sorteo");
                generar_numero_ramdom();
                System.out.println("\nNumeros Sorteados\n");
                for (int i : numeros_sorteados){
                    System.out.print(+i+", ");
                }
                se_realizo_sorteo = true;
                System.out.println("\n\nSorteo realizado exitosamente.");
                System.out.print("\nIngrese Enter para continuar...");
                input.nextLine();
                input.nextLine();
                break;

            } else {
                System.out.println("No ha apostado.");
                break;
            }
        }
    }
    
    public static void generar_numero_ramdom(){
        for (int i = 0; i < numeros_sorteados.length; i++) {
            int num_random = random.nextInt(99) + 1;          
            sorteo[num_random] = true;
            numeros_sorteados[i] = num_random;
        }
    }
    
}
