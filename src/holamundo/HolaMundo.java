/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.util.Scanner;

/**
 *
 * @author Catherin
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        int veces, mesnum;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un nombre");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese cuantas veces saludar");
        veces = entrada.nextInt();
        
        System.out.println("Ingrese un mes");
        mesnum = entrada.nextInt();
        
        saludar(nombre, veces);
        imprimirMes(mesnum);
        
        saludar("Catherin", 10);
        //Cambios que hice en Netbeans
    }
    
    static void saludar(String nombre, int veces){
        if (veces<1){
          System.out.println("Ingrese un numero mayor");
        }
        else
        {
           for(int i=0; i<veces; i++){
                System.out.println("Hola " + nombre);
           } 
        } 
    }
    static void imprimirMes(int mes){
        switch (mes){
            case 1: 
                System.out.println("Enero");
            case 2:
                System.out.println("Febrero");
        }
    }
}
