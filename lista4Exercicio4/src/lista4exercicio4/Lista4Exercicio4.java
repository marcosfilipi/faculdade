
package lista4exercicio4;

import java.util.Scanner;


public class Lista4Exercicio4 {

  
    public static void main(String[] args) {
        
        int n1, n2;
     
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Programa da lista 4 Exercício 4. \n ");
        
        System.out.println("Digite o primeiro número. \n ");
        
        n1 = scan.nextInt();
        
        System.out.println("Digite o segundo número. \n ");
        
        n2 = scan.nextInt();
        
        while ( n2 <= n1 ){
        
            System.out.println(n1);
            --n1;
            
        }
            
            
            
            
    }
    
}
