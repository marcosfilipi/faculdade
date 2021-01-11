
package lista4exercicio6;

import java.util.Scanner;


public class Lista4Exercicio6 {

    
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Programa imprime os números e soma os pares. ");
        
        System.out.println("Digite um número qualquer positivo.\n ");
        
        int n = scan.nextInt();
        
            while ( 0 < n ){ 
                
                if ( n % 2 == 0 )
                
                System.out.println("O valor da soma do número " + n + " somado mais o seu próprio número " +n + " é: " + (n+n));
                --n;
            }
    }
    
}
