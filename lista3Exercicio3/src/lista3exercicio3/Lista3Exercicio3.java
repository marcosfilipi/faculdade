
package lista3exercicio3;

import java.util.Scanner;

public class Lista3Exercicio3 {

   
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        // programa que verifica qual dos dois números digitados é maior que o outro
        
        System.out.println("Programa da lista 3, exercício 3 \n ");
        
        System.out.println("Digite um número por favor. \n ");
        
        double numero1 = ler.nextDouble();
        
        System.out.println("Agora digite um segundo número por favor. \n ");
        
        double numero2 = ler.nextDouble();
        
        if ( numero1 > numero2 ){
            
            System.out.println("O número  " + numero1 + " é maior que o número " + numero2 );
        }
        if ( numero1 < numero2 ){
            
            System.out.println("O número " + numero1 + " é menor que o número " + numero2 );
        }
        if ( numero1 == numero2 ){
            
            System.out.println("O número " + numero1 + " é igual ao número " + numero2);
        }
    }
    
}
