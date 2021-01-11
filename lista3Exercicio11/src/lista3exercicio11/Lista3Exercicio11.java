package lista3exercicio11;

import java.util.Scanner;

public class Lista3Exercicio11 {

    public static void main(String[] args) {
        
            double temperatura;
            
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Programa de verificação de temperaturas em Graus Celsius. \n ");
            
            System.out.println("Informe a temperatura em Graus Celsius. \n ");
            
            temperatura = sc.nextDouble();
            
            if ( temperatura < 0 ){
                System.out.println("Congelante");
            }
            if ( temperatura >= 0 && temperatura <= 10){
                System.out.println("Muito Frio.");
            }
            if ( temperatura >= 10 && temperatura <= 20){
                System.out.println("Frio");
            }
            if ( temperatura >= 20 && temperatura <= 30){
                System.out.println("Agradavel");
            }
            if ( temperatura >= 30 && temperatura < 40){
                System.out.println("Quente");
            }
            if ( temperatura >= 40 ){
                System.out.println("Muito Quente. Quente não, se amostra.");
            }
    }
    
}
