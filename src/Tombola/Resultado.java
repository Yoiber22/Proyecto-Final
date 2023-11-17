package Tombola;

import static Tombola.Config.*;

public class Resultado {
    public static void mostar_resultado(){
        
        if (se_realizo_sorteo){
            
            System.out.println("\nResultado del sorteo\n");
            System.out.print("Numeros jugados: ");   
            for (int i : numeros_jugados){
                if (i!=0){
                System.out.print(+i+", ");
                }
            }

            int cant_num_acertados = 0;
            for (int i = 0; i > sorteo.length; i++){
                if (sorteo[i] == jugada[i]){
                    cant_num_acertados++;
                }
            }

            System.out.println("\nCantidad de numeros acertados: "+cant_num_acertados);

            System.out.print("Numeros acertados: ");
            for (int i : numeros_jugados){
                for (int j : numeros_sorteados){
                    if (i==j){
                        System.out.print(+i+", ");
                    }
                }
            }
            int resultado = calcular_premio(cant_num_acertados);
            System.out.println("\nDinero por premios: "+resultado);
            
        } else {
            System.out.println("No se ha realizado el sorteo.");
        }
    }
    
    public static int calcular_premio(int cant_num_acertados){
        int resultado = 0;
        if (cant_num_acertados >= 3){
            switch (modalidad) {
                case 3:
                    resultado = 60*cant_num_acertados;
                    break;
                case 4:
                    switch (cant_num_acertados) {
                        case 3:
                            resultado = 9*cant_dinero;
                            break;
                        case 4:
                            resultado = 180*cant_dinero;
                            break;
                    }   break;
                case 5:
                    switch (cant_num_acertados) {
                        case 3:
                            resultado = 3*cant_dinero;
                            break;
                        case 4:
                            resultado = 24*cant_dinero;
                            break;
                        case 5:
                            resultado = 900*cant_dinero;
                            break;
                    }   break;
                case 6:
                    switch (cant_num_acertados) {
                        case 3:
                            resultado = (int) (1.5*cant_dinero);
                            break;
                        case 4:
                            resultado = 9*cant_dinero;
                            break;
                        case 5:
                            resultado = 90*cant_dinero;
                            break;
                        case 6:
                            resultado = 3600*cant_dinero;
                            break;
                    }   break;
                case 7:
                    switch (cant_num_acertados) {
                        case 3:
                            resultado = 1*cant_dinero;
                            break;
                        case 4:
                            resultado = 3*cant_dinero;
                            break;
                        case 5:
                            resultado = 30*cant_dinero;
                            break;
                        case 6:
                            resultado = 600*cant_dinero;
                            break;
                        case 7:
                            resultado = 12000*cant_dinero;
                            break;
                    }   break;
                default:
                    break;
            }
            
        }else{
            resultado -= cant_dinero;
        }
        return resultado;
    }
}


