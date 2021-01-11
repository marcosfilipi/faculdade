
package lista3exercicio4;

import java.util.Scanner;

public class Lista3Exercicio4 {

  
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Programa para ver qual número é maior. \n ");
        
        System.out.println("Digite o primeiro número por favor. \n ");
        
        double num1 = scan.nextDouble();
        
        System.out.println("Digite o número 2 por favor. \n ");
        
        double num2 = scan.nextDouble();
        
        System.out.println("Digite o número 3 por favor. \n ");
        
        double num3 = scan.nextDouble();
        
        if ( num1 > num2 && num1 > num3 ){
            
            System.out.println("O número " + num1 + " é maior que o número " + num2 + " e maior que o número " + num3);
        }
        if ( num2 > num1 && num2 > num3 ){
            
            System.out.println("O número " + num2 + " é maior que o número " + num1 + " e maior que o número " + num3);
        }
        if ( num3 > num2 && num3 > num1 ){
            
            System.out.println("O número " + num3 + " é maior que o número " + num2 + " e maior que o número " + num1);
        }
    }
     
}
