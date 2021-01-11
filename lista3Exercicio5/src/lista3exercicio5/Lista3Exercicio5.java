
package lista3exercicio5;

import java.util.Scanner;

public class Lista3Exercicio5 {

    
    public static void main(String[] args) {
    
        System.out.println("Digite 3 números e vamos colocar em ordem crescente. \n ");
        
        Scanner sc = new Scanner(System.in);
        
                
        System.out.println("Digite o Primeiro número. \n ");
        int num1 = sc.nextInt();
        
        System.out.println("Digite o Segundo número. \n ");
        int num2 = sc.nextInt();
        
        System.out.println("Digite o Terceiro número. \n ");
        int num3 = sc.nextInt();
        
        if ( num1 > num2 && num1 > num3 && num2 > num3){
            System.out.println(num3 + " " + num2 + " " + num1);
        }
        if ( num2 > num1 && num2 > num3 && num1 > num3){
            System.out.println(num3 + " " + num1 + " "+ num2);
                       
        }
        if ( num3 > num2 && num3 > num1 && num2 > num1){
            System.out.println(num1 + " " + num2 + " " + num3);
        }
    }
}

    

