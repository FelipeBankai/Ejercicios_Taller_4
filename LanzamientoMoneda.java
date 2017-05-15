/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanzamientomoneda;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class LanzamientoMoneda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int eleccion;
        int azar;
        String RA="RA";
        String R_UNO="R 1";
        String D="D";
        String E="E";
        String DIS="DIS";
        String edificio[]=new String[5];
        edificio[0]=RA;
        edificio[1]=R_UNO;
        edificio[2]=D;
        edificio[3]=E;
        edificio[4]=DIS;
        System.out.println("Un dia Alejandro estaba aburrido y no sabia cómo distraerse, "
                + "asi que se propuso ir desde el departamento de Ciencias jurídicas y empresariales "
                + "hasta el departamento de Ingeniería de Computación e Informática, estaba "
                + "buscando una mesa para sentarse cómodamente y prender su computador para jugar StarCraft."
                + " Desde el edificio en el que estaba podía pasar al edificio RA, R1, D, E, DIS. Al pasar "
                + "por cada uno de éstos edificios se propuso lanzar una moneda, si salía cara iba a buscar "
                + "una mesa en ése edificio, si salía cruz seguía caminando.");
        for(int i=0;i<=5;i++){
            System.out.println("Intento "+(i+1));
            System.out.println("Presione 1 y luego enter");
            eleccion=sc.nextInt();
            azar=(int)(Math.random()*2+1);
            if(eleccion==azar){
                System.out.println("Me quedo en el edificio "+edificio[i]);
                
                break;
            }
            System.out.println("Hay que volver a intentarlo");
        
        }
    }
    
}
