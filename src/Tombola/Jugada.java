package Tombola;

import static Tombola.Config.*;
import static Tombola.Funciones.*;
import java.util.InputMismatchException;


public class Jugada {
        public static boolean salir_menu_jugada = false;
        
        public static void menu_jugada(){
                  
        do{    
            try{
             
                System.out.println("\nModalidaes\n");
                System.out.println("1. Modalidad 3");
                System.out.println("2. Modalidad 4");
                System.out.println("3. Modalidad 5");
                System.out.println("4. Modalidad 6 ");
                System.out.println("5. Modalidad 7");
                System.out.println("0. Salir\n");
                System.out.print("Ingrese Modalidad: "); 
                int opcion = input.nextInt();
                input.nextLine();

                switch(opcion){
                    case 0:
                        salir_menu_jugada = true;
                        break;
                    case 1:
                        modalidad_3();
                        break;
                    case 2:
                        modalidad_4();
                        break;
                    case 3:
                        modalidad_5();
                        break;
                    case 4:
                        modalidad_6();
                        break;
                    case 5:
                        modalidad_7();
                        break;
                    default:
                        System.out.println("Opcion incorrecta.");

                }
            } catch (InputMismatchException e) {
                System.out.println("Solo se pueden ingresar numeros.");
                input.nextLine();
            }                  
        }while(!salir_menu_jugada);

    }
    
    public static void modalidad_3(){
                System.out.println("\nModalidad 3\n");
                modalidad = 3;
                pedir_numeros(3);
                ingresar_dinero();
                salir_menu_jugada = true;
            }
    
    public static void modalidad_4(){
                System.out.println("\nModalidad 4\n");
                modalidad = 4;
                pedir_numeros(4);
                ingresar_dinero();
                salir_menu_jugada =  true;
            }
    
    public static void modalidad_5(){
                System.out.println("\nModalidad 5\n");
                modalidad = 5;
                pedir_numeros(5);
                ingresar_dinero();
                salir_menu_jugada =  true;
            }
    
    public static void modalidad_6(){
                System.out.println("\nModalidad 6\n");
                modalidad = 6;
                pedir_numeros(6);
                ingresar_dinero();
                salir_menu_jugada =  true;
            }
    
    public static void modalidad_7(){
                System.out.println("\nModalidad 7\n");
                modalidad = 7;
                pedir_numeros(7);
                ingresar_dinero();
                salir_menu_jugada =  true;
            }
}
