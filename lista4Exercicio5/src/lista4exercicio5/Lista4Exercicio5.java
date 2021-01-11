
package lista4exercicio5;

import java.util.Scanner;


public class Lista4Exercicio5 {

   
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
//        int n = 0;
        
        System.out.println("Programa que imprime os números ímpares de 1 até 100.");
        
            for (int n = 0; n < 101; n++){
                
                if ( n % 2 == 1)
                    System.out.println(n);
            }
        
        
        
        
        
    }
    
}
