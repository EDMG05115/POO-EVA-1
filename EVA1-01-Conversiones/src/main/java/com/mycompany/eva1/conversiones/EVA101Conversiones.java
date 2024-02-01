/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1.conversiones;

import java.util.Scanner;

/**
 *
 * @author Edwin Morales
 */
public class EVA101Conversiones {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kgrs, libra, pesos, dolares, m, cm;
        System.out.println("Ingrese el tipo de conversion que desee realizar:");
        System.out.println("1 - Kgrs/Libras.");
        System.out.println("2 - Pesos/Dólares.");
        System.out.println("3 - Metros/Centímetros.");
        String valor = input.next();
        
        switch(valor){
            case "1":
                System.out.println("Kgrs a libras");
                System.out.print("Ingresa tu peso en libras: ");
                kgrs = input.nextDouble();
                
                libra = (kgrs / 0.45);
                
                System.out.println(kgrs + " kgrs a libras es: " + libra + " lb");
            break;
            case "2":
                System.out.println("Pesos a dólares");
                System.out.print("Ingresa el número de pesos: ");
                pesos = input.nextDouble();
                
                dolares = (pesos * 0.059);
                
                System.out.println("$" + pesos + " a dolaes es: " + dolares + "$");
            break;
            case "3":
                System.out.println("Metros a centímetros");
                System.out.print("Ingresa tu altura en metros: ");
                m = input.nextDouble();
                
                cm = (m * 100);
                
                System.out.println(m + " m  a centímetros es: " + cm + " cm");
            break;
            default:
                System.out.println("Valor invalido");
        } 
    }
}
