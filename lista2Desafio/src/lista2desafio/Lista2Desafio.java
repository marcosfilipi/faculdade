
package lista2desafio;

import java.util.Scanner;

public class Lista2Desafio {

    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println(" Programa de converção de Escalas de Temperaturas. \n ");
        
        System.out.println("Selecione a Escala Atual desejada. \n ");
        
        System.out.println("-------------------------");
        System.out.println("| Celsius:    DIGITE  1 |");
        System.out.println("| Kelvin:     DIGITE  2 |");
        System.out.println("| Fahrenheit: DIGITE  3 |");
        System.out.println("-------------------------");
        
        int escolha = scan.nextInt(); // escolha das escalas
        
        int escala1 = 1;
        int escala2 = 2;
        int escala3 = 3;
        
        if ( escolha == 1){
            System.out.println("Você escolhe a Escala Celsius. \n ");
        }
        if ( escolha == 2){
            System.out.println("Você Escolheu a Escala Kelvin. \n ");
        }
        if (escolha == 3 ){
            System.out.println("Você escolheu a Escala Fahrenheit. \n  ");
        }
        
        System.out.println("Digite a Escala para qual você deseja converter. \n ");
        
        System.out.println("-------------------------");
        System.out.println("| Celsius:    DIGITE  1 |");
        System.out.println("| Kelvin:     DIGITE  2 |");
        System.out.println("| Fahrenheit: DIGITE  3 |");
        System.out.println("-------------------------");
        
        int escolha1 = 1;
        int escolha2 = 2;
        int escolha3 = 3;
                
        int conversor = scan.nextInt(); // escolha das escalas
        
        if ( conversor == 1 ){
            System.out.println("Você escolheu a Escala Celsius. \n ");
        }
        if ( conversor == 2){
            System.out.println("Você escolheu a Escala Kevin. \n ");
        }
        if ( conversor == 3){
            System.out.println("Você escolheu a Escala Fahrenheit. \n ");
            
        }
        
            System.out.println("Digite o valor da temperatura a ser convertido. \n ");             
       
             
            int valor = scan.nextInt(); // entrada do valor da temperatura
            
        if ( escolha == 1 && conversor == 1){ // em casa de escolher duas escalas iguais
            System.out.println("ERRO !!!! ESCOLHA DUAS ESCALAS DIFERENTES.\n ");
        
        }                                     
            if ( escolha == 1 && conversor == 2){ // conversão de celsius para kelvin
            double conversao1 = ( valor + 273.15);
            System.out.println("O valor convertido de Celsius para Kelvin é: " + conversao1 + " K ");
            
        }
        if ( escolha == 1 && conversor == 3){ // conversão de celsius para fahrenheit
            double conversao2 = valor * 9/5  + 32;
            System.out.println("O valor convertido de Celsius para Fahrenheit é: " + conversao2 + " °F ");
        }
        if ( escolha == 2 && conversor == 1){ // conversão de Kelvin para Celsius
            double conversao3 = ( valor - 273.15);
            System.out.println("O valor convertido de Kelvin para Celsius é: " + conversao3 + " °C ");
        }
        if ( escolha == 2 && conversor == 2){ // conversão da erro
            System.out.println("ERRO !!!! ESCOLHA DUAS ESCALAS DIFERENTES.\n");
        }
        if ( escolha == 2 && conversor == 3){ // conversão de Kelvin para Fahrenheit
            double conversao4 = (( valor - 273.15)* 9/5 + 32);
            System.out.println("O valor convertido de Kelvin para Fahrenheit é: " + conversao4 + " F ");
        }
        if ( escolha == 3 && conversor == 1){ // conversão de Fahrenheit para Celsius
            double conversao5 = (( valor - 32)* 5/9 );
            System.out.println("O valor convertido de Fahrenheit para Celsius é: " + conversao5 + " °C ");
        }
        if ( escolha == 3 && conversor == 2){ // conversão de Fahrenheit para Kelvin
            double conversao6 = (( valor - 32)* 5/9 )+ 273.15;
            System.out.println("O valor convertido de Fahrenheit para Kelvin é: " + conversao6 + " K ");
        }
        if ( escolha == 3 && conversor == 3){ // conversão de escalas iguais. ERRO
            double conversao5 = (( valor - 32)* 5/9 );
            System.out.println("ERRO !!!! ESCOLHA DUAS ESCALAS DIFERENTES.\n");
        }
        
        
    }
    
}
