
package lista2exercicio13;

import java.util.Scanner;

public class Lista2Exercicio13 {

    public static void main(String[] args) {
        
        double multi;
        double soma;
        double cubo;
        Scanner ler = new Scanner(System.in);
        
//        Ler 2 números inteiros e um número real. Calcule e mostre:
//a multiplicação do dobro do primeiro com metade do segundo .
//a soma do triplo do primeiro com o terceiro.
//o terceiro elevado ao cubo.

        System.out.println("Programa para calcular números inteiros e real. \n  ");
        
        System.out.println("Digite o primeiro número inteiro. \n ");
        
        int numInt = ler.nextInt();
        
        System.out.println("Digite o segundo número inteiro. \n ");
        
        int numInt2 = ler.nextInt();
        
        System.out.println("Digite um número Real. \n ");
        
        double numReal = ler.nextDouble();
        System.out.println(" ");
        
        multi = (numInt*2) * (numInt2/2);
        System.out.println("A multiplicação do dobro do primeiro com metade do segundo é: " + multi);
        
        System.out.println("---------------------------------------------------------------------------\n ");
        
        soma = (numInt * 3) + numReal;
        System.out.println(" ");
        
        System.out.println("A soma do triplo do Primeiro com o Terceiro é: " + soma);
        
        cubo = (numReal*numReal) * numReal;
        
        System.out.println("-------------------------------------------------------------------------- \n ");
        
        System.out.println("O terceiro número elevado ao cubo é: " + cubo);
   
        
        

       
    }
    
}
