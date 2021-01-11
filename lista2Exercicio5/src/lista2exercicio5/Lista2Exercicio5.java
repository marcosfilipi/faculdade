
package lista2exercicio5;

import java.util.Scanner;

public class Lista2Exercicio5 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite 3 números por gentileza. \n ");
        
        System.out.println("Digite o primeiro número. \n ");
        double num1 = ler.nextDouble();
        
        System.out.println("Digite o segundo número. \n ");
        double num2 = ler.nextDouble();
        
        System.out.println("Digite o terceiro número \n ");
        double num3 = ler.nextDouble();

        System.out.println("Os números na ordem inversa são: ");
        System.out.println(num3);
        System.out.println(num2);
        System.out.println(num1);
    }
    
}
