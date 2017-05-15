/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Contador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        int validacion=999999999;
        System.out.println("Ingrese un numero entre 1 y 10");
        num=sc.nextInt();
        if(num<1 || num>10){
            for(int i=1;i<validacion;i++){
                System.out.println("Valor erroneo, ingrese numeros entre 1 y 10");
                num=sc.nextInt();
                if(num>=1 && num<=10){
                    break;
                }
            
            }
        
        }
        for(int j=1;j<=num;j++){
            System.out.println("Sus numeros son "+j);
        
        }
        
    }
    
}
