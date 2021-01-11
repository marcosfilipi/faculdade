
package lista4exercicio7;

import java.util.Scanner;


public class Lista4Exercicio7 {

    
    public static void main(String[] args) {
        
            int numero = 0;
        
            System.out.println("Programa que imprime os numero de 10 em 10. \n ");
            
                Scanner scan = new Scanner(System.in);
                
                System.out.println("Digite um Número qualquer poositivo.\n ");
                               
                
                while ( numero < 210 ){
                    
                    System.out.println(numero );
                        numero = numero + 10;
                }
    }
    
}
