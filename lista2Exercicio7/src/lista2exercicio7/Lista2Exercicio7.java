
package lista2exercicio7;

import java.util.Scanner;


public class Lista2Exercicio7 {

   
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int HORAS_FIXA = 24; // 24 horas.
        double MINUTO_FIXO = 1.440; // total de 24 horas em miutos.
        double SEGUNDO_FIXO = 86.400; // total de 24 horas em segundos.
        
        
        double calculoMinutos;
        double calculoSegundos;
               
        System.out.println("Programa para calcular as Horas e Minutos. \n ");
                 
        System.out.println("Digite a Hora. \n ");
        int hora = ler.nextInt();
        
        System.out.println("Digite os Minutos. \n ");
        int minutos = ler.nextInt();
        
        System.out.println("Digite os Segundos. \n ");
        int segundos = ler.nextInt();
        
        calculoMinutos = (minutos - MINUTO_FIXO);
        calculoSegundos = (SEGUNDO_FIXO - segundos );
        
        System.out.println("Desde as 00:00 de Hoje já se passaram: " + hora + " :Horas, " + calculoMinutos + " Minutos e" + calculoSegundos + " segundos. ");
        
        
        
        
        
        
        
        
    }
    
}
