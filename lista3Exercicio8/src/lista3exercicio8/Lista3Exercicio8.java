
package lista3exercicio8;

import java.util.Scanner;

public class Lista3Exercicio8 {

    public static void main(String[] args) {
        
        double soma =0;
        
        Scanner sc = new Scanner(System.in);
        
            System.out.println("Programa para somar 3 números. \n ");
            
            System.out.println("Digite o primeiro número. \n ");
            double n1 = sc.nextDouble();
            
            System.out.println("Digite o segundo número.\n ");
            double n2 = sc.nextDouble();
            
            System.out.println("Digite o segundo número. \n ");
            double n3 = sc.nextDouble();
            
            if ( n1 == n2 && n1 == n3 ){
                soma = 0;
                System.out.println("A soma do números é: " + soma);
            }
            if ( n1 == n2 && n1 != n3){
                soma = (n3);
                System.out.println("A soma dos números é: " + soma);
            }
            if ( n1 != n2 && n1 != n3){
                soma = ( n1 + n2 + n3);
                System.out.println("A soma dos números são: "+ soma);
            }
    }
    
}
