
package lista2exercicio3;

import java.util.Scanner;

public class Lista2Exercicio3 {

  
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite 3 número e obtenha a média dos 3 números. \n ");
        
        System.out.println("Digite o primeiro número. \n ");
        double num1 = ler.nextDouble();
        
        System.out.println("Digite o segundo número. \n ");
        double num2 = ler.nextDouble();
        
        System.out.println("Digite o terceiro número. \n ");
        double num3 = ler.nextDouble();
        
        double media = ( num1 + num2 + num3)/3;
        
        System.out.println(String.format("A média entre os 3 números digitados é: %.3fl. " , media));
    }
    
}
