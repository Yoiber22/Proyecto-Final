package Tombola;

import static Tombola.Config.*;

public class Sorteo {
    public static void hacer_sorteo(int[] numeros_sorteados, boolean[] sorteo, String tipo_sorteo){
        if (!se_realizo_sorteo){
            while(true){       
                if (se_realizo_apuesta){   
                    
                    System.out.println("\nSorteo "+tipo_sorteo);
                    generar_numero_random(numeros_sorteados, sorteo);
                    System.out.print("\nNumeros Sorteados: ");
                    for (int i : numeros_sorteados){
                        System.out.print(+i+", ");
                    }
                    se_realizo_sorteo = true;
                    System.out.println("\n\nSorteo "+tipo_sorteo+" realizado exitosamente.");
                    System.out.print("Ingrese Enter para continuar...");
                    input.nextLine();
                    input.nextLine();
                    break;
                

                } else {
                    System.out.println("No ha apostado.");
                    break;
                }
            }
        } else{
            System.out.println("Ya se realizo el sorteo.");
                }
    }
    
    public static void realizar_ambos_sorteos(){
        if (!se_realizo_sorteo){
            if (se_realizo_apuesta){
                
                System.out.println("\nSorteos");
                generar_numero_random(numeros_sorteados_vespertino, sorteo_vespertino);
                generar_numero_random(numeros_sorteados_nocturno, sorteo_nocturno);
                System.out.print("\nNumeros sorteados vespertino: ");
                for (int i : numeros_sorteados_vespertino){
                    System.out.print(+i+", ");
                }
                System.out.print("\nNumeros sorteados nocturno: ");
                for (int i: numeros_sorteados_vespertino){
                    System.out.print(+i+", ");
                }
                se_realizo_sorteo = true;
                System.out.println("\n\nSorteos realizados exitosamente.");
                System.out.println("Ingrese Enter para continuar...");
                input.next();
            } else {
                System.out.println("No ha apostado.");
            }
        } else {
            System.out.println("Ya se realizaron los sorteos");
        }
    } 
    
    public static void generar_numero_random(int[] numeros_sorteados, boolean[] sorteo){
        for (int i = 0; i < numeros_sorteados.length; i++) {
            int num_random = random.nextInt(99) + 1;          
            sorteo[num_random] = true;
            numeros_sorteados[i] = num_random;
        }
    }  
}
