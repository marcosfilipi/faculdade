
package lista4exercicio12;

import java.util.Scanner;


public class Lista4Exercicio12 {

    
    public static void main(String[] args) {
        
        System.out.println("Programa para calcular um número fatorial. \n ");
        
        int num;
        int cont;
        int resultado=1;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um número para calcularmos o seu fatorial. \n");
        
        num = scan.nextInt();
        
        for( cont = 2; cont <= num ; cont++){
            
            resultado *= cont;
        }
        System.out.println("O Fatorial de "+ num + " é " + resultado);
    }
    
}
