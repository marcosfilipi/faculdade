
package lista4exercicio11;

import java.util.Scanner;


public class Lista4Exercicio11 {

    
    public static void main(String[] args) {
        
        System.out.println("Programa para identificar números primos. \n ");
        
        int num;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um número para verificar se é primo. \n ");
        
        num = scan.nextInt();
        
            if ( num % 2 == 0 || num % 3 == 0){
                System.out.println("Não é um número primo ");
                
            }else{
                System.out.println("É um número primo. \n ");
            }
    }
    
}
