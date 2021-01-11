
package segundos;

import java.util.Scanner;

public class Segundos {

  
    public static void main(String[] args) {
        
        
        System.out.println("Cálculo de segundos e horas \n ");
        
        System.out.println("Digite a Quantidade de segundos \n ");
        
        Scanner ler = new Scanner(System.in);
        
               
        double minutos;
        
        double horas;
               
        double segundos = ler.nextDouble();
        
        minutos = segundos / 60;
        
        horas = minutos / 60;
        
        
        System.out.println(String.format("A quantidade de Segundos são: " + segundos));
        System.out.println(String.format("A quantidade de minutos são: " + minutos));
        System.out.println(String.format("A quantidade de horas são: %.3fl." , horas));
    }
    
}
