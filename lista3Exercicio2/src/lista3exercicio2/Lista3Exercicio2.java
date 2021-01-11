
package lista3exercicio2;

import java.util.Scanner;

public class Lista3Exercicio2 {

    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Programa da lista 3, exercício 2 \n ");
        
        System.out.println("Digite um número qualquer. \n ");
        
        double numero = ler.nextDouble();
        
        if ( numero > 20){
            
            System.out.println("Número, " + numero + " é maior que 20 \n ");
        }
        if ( numero == 20){
            
            System.out.println("Número, " + numero + " é igual a 20 \n ");
        }
        if ( numero < 20){
            
            System.out.println("Número, " + numero +  " é menor que 20 \n ");
        }
    }
    
}
