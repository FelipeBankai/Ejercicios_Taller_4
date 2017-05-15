/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package costodevuelo;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class CostoDeVuelo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int distancia;
        int numPasajeros;
        int edad;
        int contJoven=0;
        int contAdulto=0;
        int contViejo=0;
        System.out.println("Vuelo");
        System.out.println("Distancia ida y vuelta?");
        distancia=sc.nextInt();
        System.out.println("Nuemro de pasajeros para su viaje");
        numPasajeros=sc.nextInt();
        for(int i=0;i<numPasajeros;i++){
            System.out.println("Ingrese edad del pasajero "+(i+1));
            edad=sc.nextInt();
            if(edad<=15){
                contJoven++;
            }
            if(edad>15 && edad<65){
                contAdulto++;
            }
            if(edad>=65){
                contViejo++;
            }
        }
        
        if(distancia>1030){
            distancia=distancia*523;
            if(contAdulto>3){
                distancia=(distancia*10)/100;
                if(contViejo>=1){
                    distancia=(distancia*25)/100;
                }
            }
            if(contAdulto==2 && contJoven==1){
                distancia=(distancia*8)/100;
            }
            if(contViejo>=1 && contAdulto<=3){
                distancia=(distancia*50)/100;
            }
            if(distancia>550000){
                distancia=(distancia*20)/100;
            }
        }
        if(distancia<=1030){
            distancia=distancia*523;
        }
        System.out.println("Monto a pagar es de "+distancia);
        
    }
    
}
