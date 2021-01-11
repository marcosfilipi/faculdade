
package lista4exercicio15;

import java.util.Scanner;


public class Lista4Exercicio15 {

    
    public static void main(String[] args) {
        
         System.out.println("Programa para identificar números primos. \n ");
        
        int num1;
        int num2;
        int primo=0;
        int naoPrimo=0;
        int cont=0;
        Scanner scan = new Scanner(System.in);
        
            System.out.println("Digite o primeiro número. \n ");
        
                num1 = scan.nextInt();
        
            System.out.println("Digite o segundo número.\n ");
            
                num2 = scan.nextInt();
                
                int resultado = ( num1 - num2);
                
                while ( resultado >= cont){
        
                if ( resultado % 2 == 0 || resultado % 3 == 0){
                    
                    naoPrimo = resultado;    
                    System.out.println(naoPrimo + " -> Não é um número primo " );
                    naoPrimo++;
                    
                }else{
                           
                    primo = resultado;
                    System.out.println(primo + " -> É um número primo. \n ");
                    primo++;
                }
                resultado--;
        }
    }
}
        
    
    

