
package lista4exercicio8;

import java.util.Scanner;


public class Lista4Exercicio8 {

    
    public static void main(String[] args) {
        
        int numero;
        int cont = 0;
        Scanner scan = new Scanner(System.in);
        
        System.out.println(" Programa que ler um número e imprime a sua tabuada de adição e multiplicação.\n ");
        
        System.out.println("Digite um número positivo válido.\n ");
            
            numero = scan.nextInt();
            
            while ( numero > 0 && cont != 11){
                System.out.println(numero  +  " x " +  cont + " = " + numero*cont);
                cont++;
            }
    }
    
}
