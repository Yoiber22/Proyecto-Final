package Tombola;

import static Tombola.Config.*;
import static Tombola.Funciones.*;
import java.util.InputMismatchException;


public class Jugada {
        public static boolean salir_menu_jugada = false;
        
        public static void menu_jugada(){
            
        if (!se_realizo_apuesta){
            do{
                try{
                    System.out.println("\n\nHorarios Sorteo\n");
                    System.out.println("1. Vespertino");
                    System.out.println("2. Nocturno");
                    System.out.println("3. Ambos");
                    System.out.println("0. Salir\n");
                    System.out.print("Ingrese opcion: "); 
                    int opcion = input.nextInt();
                    input.nextLine();

                    switch(opcion){
                        case 0:
                            salir_menu_jugada = true;
                            break;
                        case 1:
                            tipo_sorteo = "vespertino";
                            break;
                        case 2:
                            tipo_sorteo = "nocturno";
                            break;
                        case 3:
                            tipo_sorteo = "ambos";
                            break;               
                        default:
                            System.out.println("Opcion incorrecta.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Solo se pueden ingresar numeros.");
                    input.nextLine();
                }
            
                if (!salir_menu_jugada){
                    menu_modalidades();
                }
                
                      
            }while(!salir_menu_jugada); 
        } else {
                System.out.println("Ya se realizo la apuesta.");
            }
    }
    
    public static void menu_modalidades(){
        try{
            System.out.println("\n\nModalidaes\n");

            System.out.print("Ingrese Modalidad entre 3 y 7: "); 
            int opcion = input.nextInt();
            input.nextLine();

            switch(opcion){
                case 3:
                    modalidades(3);
                    break;
                case 4:
                    modalidades(4);
                    break;
                case 5:
                    modalidades(5);
                    break;
                case 6:
                    modalidades(6);
                    break;
                case 7:
                    modalidades(7);
                    break;
                default:
                    System.out.println("Opcion incorrecta.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Solo se pueden ingresar numeros.");
            input.nextLine();
        }
    }
    
    public static void modalidades(int num_modalidad){
                System.out.println("\nModalidad "+num_modalidad+"\n");
                modalidad = num_modalidad;
                if (Config.tipo_sorteo.equals("vespertino")){
                    pedir_numeros(num_modalidad, jugada_vespertino, numeros_jugados_vespertino);
                    dinero_apostado_vespertino = ingresar_dinero();
                } else if (Config.tipo_sorteo.equals("nocturno")){
                    pedir_numeros(num_modalidad, jugada_nocturno, numeros_jugados_nocturno);
                    dinero_apostado_nocturno = ingresar_dinero();
                } else {
                    pedir_numeros(num_modalidad, jugada_vespertino, numeros_jugados_vespertino);
                    dinero_apostado_vespertino = ingresar_dinero();
                    System.out.println("");
                    pedir_numeros(num_modalidad, jugada_nocturno, numeros_jugados_nocturno);
                    dinero_apostado_nocturno = ingresar_dinero();
                }
                salir_menu_jugada = true;
            }
}
