package Tombola;

import static Tombola.Config.*;

public class Resultado {
    public static void mostar_resultado(int[] numeros_jugados, boolean[] sorteo, boolean[] jugada, int[] numeros_sorteados, int dinero_apostado){
        
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
            int resultado = calcular_premio(cant_num_acertados, dinero_apostado);
            System.out.println("\nDinero por premios: "+resultado+"\n");
            
        } else {
            System.out.println("No se ha realizado el sorteo.");
        }
    }
    
    public static void mostrar_resultados_ambos(){
        if (se_realizo_sorteo){
            System.out.println("\nResultado de los sorteos\n");
            System.out.println("Vespertino");
            System.out.print("Numeros juagados vespertino: ");
            for (int i : numeros_jugados_vespertino){
                if (i!=0){    
                System.out.print(i+i+", ");
                }
            }            
            int cant_num_acertados_vespertino = 0;
            for (int i = 0; i > sorteo_vespertino.length; i++){
                if (sorteo_vespertino[i] == jugada_vespertino[i]){
                    cant_num_acertados_vespertino++;
                }
            }
            System.out.print("Numeros acertados vespertino: ");
            for (int i : numeros_jugados_vespertino){
                for (int j : numeros_sorteados_vespertino){
                    if (i==j){
                        System.out.println(+i+", ");
                    }
                }
            }
            int resultado_vespertino = calcular_premio(cant_num_acertados_vespertino, dinero_apostado_vespertino);
            System.out.println("\nDinero por premios: "+resultado_vespertino+"\n");
            
            
            System.out.println("/\nNocturno");
            System.out.print("Numeros juagados nocturno: ");
            for (int i : numeros_jugados_nocturno){
                if (i!=0){    
                System.out.print(i+i+", ");
                }
            }            
            int cant_num_acertados_nocturno = 0;
            for (int i = 0; i > sorteo_nocturno.length; i++){
                if (sorteo_nocturno[i] == jugada_nocturno[i]){
                    cant_num_acertados_vespertino++;
                }
            }
            System.out.print("Numeros acertados nocturno: ");
            for (int i : numeros_jugados_nocturno){
                for (int j : numeros_sorteados_nocturno){
                    if (i==j){
                        System.out.println(+i+", ");
                    }
                }
            }
            int resultado_nocturno = calcular_premio(cant_num_acertados_nocturno, dinero_apostado_nocturno);
            System.out.println("\nDinero por premios: "+resultado_vespertino+"\n");
            
            int resultado_total = resultado_vespertino + resultado_nocturno;
            System.out.println("\nTotal de premios: "+resultado_total);
            
        } else {
            System.out.println("No se han realizado los sorteos.");
        }
    }
    
    public static int calcular_premio(int cant_num_acertados, int dinero_apostado){
        int resultado = 0;
        if (cant_num_acertados >= 3){
            switch (modalidad) {
                case 3:
                    resultado = 60*cant_num_acertados;
                    break;
                case 4:
                    switch (cant_num_acertados) {
                        case 3:
                            resultado = 9*dinero_apostado;
                            break;
                        case 4:
                            resultado = 180*dinero_apostado;
                            break;
                    }   break;
                case 5:
                    switch (cant_num_acertados) {
                        case 3:
                            resultado = 3*dinero_apostado;
                            break;
                        case 4:
                            resultado = 24*dinero_apostado;
                            break;
                        case 5:
                            resultado = 900*dinero_apostado;
                            break;
                    }   break;
                case 6:
                    switch (cant_num_acertados) {
                        case 3:
                            resultado = (int) (1.5*dinero_apostado);
                            break;
                        case 4:
                            resultado = 9*dinero_apostado;
                            break;
                        case 5:
                            resultado = 90*dinero_apostado;
                            break;
                        case 6:
                            resultado = 3600*dinero_apostado;
                            break;
                    }   break;
                case 7:
                    switch (cant_num_acertados) {
                        case 3:
                            resultado = 1*dinero_apostado;
                            break;
                        case 4:
                            resultado = 3*dinero_apostado;
                            break;
                        case 5:
                            resultado = 30*dinero_apostado;
                            break;
                        case 6:
                            resultado = 600*dinero_apostado;
                            break;
                        case 7:
                            resultado = 12000*dinero_apostado;
                            break;
                    }   break;
                default:
                    break;
            }
            
        }else{
            System.out.println("Dinero apostado: "+dinero_apostado);
            resultado -= dinero_apostado;
        }
        return resultado;
    }
}


