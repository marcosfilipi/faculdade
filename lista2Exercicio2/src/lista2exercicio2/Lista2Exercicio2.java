
package lista2exercicio2;

import java.util.Scanner;

public class Lista2Exercicio2 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Ler um número e imprima ela com 10% de aumento. \n ");
        
        System.out.println("Digite o número desejado \n ");
        
        double numero = ler.nextDouble();
        
        double porcentagem = 10;
        
        double conversao;
        
        double resultado;
        
        conversao = (( porcentagem * numero)/100);
        
        resultado = conversao + numero;
        
        System.out.println("O valor do número acrescido de 10% é: \n " + resultado);
        
    }
    
}
