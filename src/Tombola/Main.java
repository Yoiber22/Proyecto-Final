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
                        Sorteo.hacer_sorteo();
                        break;
                    case 3:
                        Resultado.mostar_resultado();
                        break;
                    default:
                        System.out.println("Opcion incorrecta.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Solo se pueden ingresar numeros.");
            }
       }while(!salir);   
        
        
    }
    
}
