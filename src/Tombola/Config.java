package Tombola;

import java.util.Scanner;
import java.util.Random;

public class Config {
    
    //Scanner
    public static Scanner input = new Scanner(System.in);
    
    //Random
    public static Random random = new Random();
    
    //Arreglos
    public static boolean[] jugada = new boolean[100];
    public static boolean[] sorteo = new boolean[100];
    public static int[] numeros_sorteados = new int[20];
    public static int[] numeros_jugados = new int[7];
    
    //Variables Booleanas
    public static boolean se_realizo_sorteo = false;
    public static boolean se_realizo_apuesta = false;
    
    //Modalidad
    public static int modalidad = 0;
    
    //Dinero Ingresado
    public static int cant_dinero = 0;
}
