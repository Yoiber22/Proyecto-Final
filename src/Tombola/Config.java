package Tombola;

import java.util.Scanner;
import java.util.Random;

public class Config {
    
    //Scanner
    public static Scanner input = new Scanner(System.in);
    
    //Random
    public static Random random = new Random();
    
    //Arreglos Vespertino
    public static boolean[] jugada_vespertino = new boolean[100];
    public static boolean[] sorteo_vespertino = new boolean[100];
    public static int[] numeros_sorteados_vespertino = new int[20];
    public static int[] numeros_jugados_vespertino = new int[7];
    
    // Arreglos Nocturno
    public static boolean[] jugada_nocturno = new boolean[100];
    public static boolean[] sorteo_nocturno = new boolean[100];
    public static int[] numeros_sorteados_nocturno = new int[20];
    public static int[] numeros_jugados_nocturno = new int[7];
    
    
    //Variables 
    public static boolean se_realizo_sorteo = false;
    public static boolean se_realizo_apuesta = false;
    public static String tipo_sorteo = "null";
    public static int modalidad = 0;
    public static int dinero_apostado_vespertino = 0;
    public static int dinero_apostado_nocturno = 0;
}
