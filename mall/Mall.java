/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mall;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Mall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int trabHoras;
        int horaExtra;
        int acumDinerHora=0;
        int venta;
        int porcentajeVenta=0;
        int acumSemana;
        int acumMes=0;
        System.out.println("Programa para el sueldo");
        for(int i=0;i<5;i++){
            System.out.println("Ingrese horas trabajadas durante la semana "+(i+1));
            trabHoras=sc.nextInt();
            if(trabHoras>40){
                horaExtra=(trabHoras-40)*3000;
                acumDinerHora=80000+horaExtra;
            }
            if(trabHoras<=40){
                acumDinerHora=trabHoras*2000;
            }
            
            System.out.println("Ventas de la semana "+(i+1));
            venta=sc.nextInt();
            
            if(venta<300000){
                porcentajeVenta=0;
            }
            if(venta>=300000 && venta<=500000){
                porcentajeVenta=(venta*5)/100;
            }
            if(venta>500000){
                porcentajeVenta=(venta*10)/100;
            }
            acumSemana=porcentajeVenta+acumDinerHora;
            System.out.println("Dinero ganado semana "+(i+1)+": "+acumSemana);
            acumMes=acumMes+acumSemana;
        }
        System.out.println("Usted ha ganado en el mes "+acumMes);
    }
    
}
