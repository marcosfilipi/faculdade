
package lista2exercicio4;

import java.util.Scanner;

public class Lista2Exercicio4 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um número para obter o quadrado do mesmo \n ");
        
        int numero = ler.nextInt();
        
        int quadrado;
        
        quadrado = numero * numero;
        
        System.out.println("O quadrado do numero " + numero + (" é: ") + quadrado);
        
    }
    
}
