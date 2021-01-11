
package lista4exercicio13;

import java.util.Scanner;


public class Lista4Exercicio13 {

   
    public static void main(String[] args) {
        
        
        System.out.println("Programa que imprime pares e ímpares. \n ");
        
            int num;
            int par = 0;
            int impar = 0;
            
            int cont=0;
            
            Scanner scan = new Scanner(System.in);
            
            System.out.println("Digite um número inteiro positivo. \n ");
            
            num = scan.nextInt();
            
            while ( cont <= num ){
                if (num % 2 == 0){
                    par = num;
                }else{ //(num % 2 == 1)
                    impar = num;
                }    
                num--;
                System.out.println("números pares: " + par + " números ímpares: " + impar );
                 
            }
    }           
    
}
