
package lista3exercicio1;

import java.util.Scanner;

public class Lista3Exercicio1 {

   
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Programa Exercício 1. \n ");
        
        System.out.println("Digite um número qualquer. \n ");
        
        double numero = ler.nextDouble();
        
        if ( numero > 20){
            
            System.out.println("A metade do número digitado " + numero + " é: " + numero/2);
        }
        else {
            
            System.out.println("Número menor que 20 ");
        }
        
        
    }
    
}
