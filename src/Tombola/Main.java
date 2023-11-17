package Tombola;

import java.util.InputMismatchException;


public class Main {

    public static void main(String[] args) {
        menu_pricipal();
    }
    
    public static void menu_pricipal(){
        
       boolean salir = false;
        
       do{        
            try{
                System.out.println("\nESI-TOMBOLA\n");
                System.out.println("1. Jugada");
                System.out.println("2. Sorteo");
                System.out.println("3. Resultado");
                System.out.println("0. Salir\n");
                System.out.print("Ingrese opcion: ");
                int opcion = Config.input.nextInt();

                switch (opcion){
                    case 0:
                        System.out.println("Gracias por usar mi programa");
                        salir = true;
                        break;
                    case 1:
                        Jugada.menu_jugada();
                        break;
                    case 2:
                        if (Config.tipo_sorteo.equals("vespertino")){
                            Sorteo.hacer_sorteo(Config.numeros_sorteados_vespertino ,Config.sorteo_vespertino, "Vespertino");         
                        } else if (Config.tipo_sorteo.equals("nocturno")){
                            Sorteo.hacer_sorteo(Config.numeros_sorteados_nocturno ,Config.sorteo_vespertino, "Nocturno");
                        } else {
                            Sorteo.realizar_ambos_sorteos();
                        }
                        break;
                    case 3:
                        if (Config.tipo_sorteo.equals("vespertino")){
                            Resultado.mostar_resultado(Config.numeros_jugados_vespertino, Config.sorteo_vespertino, Config.jugada_vespertino, Config.numeros_sorteados_vespertino, Config.dinero_apostado_vespertino);  
                            Funciones.reiniciar_tombola(Config.jugada_vespertino, Config.sorteo_vespertino, Config.numeros_jugados_vespertino, Config.numeros_jugados_vespertino);
                        } else if (Config.tipo_sorteo.equals("nocturno")){
                            Resultado.mostar_resultado(Config.numeros_jugados_nocturno, Config.sorteo_nocturno, Config.jugada_nocturno, Config.numeros_sorteados_nocturno, Config.dinero_apostado_nocturno);
                            Funciones.reiniciar_tombola(Config.jugada_nocturno, Config.sorteo_nocturno, Config.numeros_jugados_nocturno, Config.numeros_jugados_nocturno);
                        } else {
                            Resultado.mostar_resultado(Config.numeros_jugados_vespertino, Config.sorteo_vespertino, Config.jugada_vespertino, Config.numeros_sorteados_vespertino, Config.dinero_apostado_vespertino);
                            System.out.println("");
                            Resultado.mostar_resultado(Config.numeros_sorteados_nocturno, Config.sorteo_nocturno, Config.jugada_nocturno, Config.numeros_sorteados_nocturno, Config.dinero_apostado_nocturno);
                            Funciones.reiniciar_tombola(Config.jugada_vespertino, Config.sorteo_vespertino, Config.numeros_jugados_vespertino, Config.numeros_jugados_vespertino);
                            Funciones.reiniciar_tombola(Config.jugada_nocturno, Config.sorteo_nocturno, Config.numeros_jugados_nocturno, Config.numeros_jugados_nocturno);
                        }
                        break;
                    default:
                        System.out.println("Opcion incorrecta.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Solo se pueden ingresar numeros.");
                Config.input.next();
                Main.menu_pricipal();
            }
       }while(!salir);   
        
        
    }
    
}
