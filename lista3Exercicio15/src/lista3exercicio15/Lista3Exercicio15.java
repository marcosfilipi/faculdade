
package lista3exercicio15;

import java.util.Scanner;

public class Lista3Exercicio15 {

  
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Programa para calcular a média dos alunos. \n ");
        
        System.out.println("Digite a primeira nota. \n ");
        
        double mat = sc.nextDouble();
        
        System.out.println("Digite a segunda nota. \n ");
        
        double fis = sc.nextDouble();
        
        System.out.println("Digite a terceira nota. \n ");
        
        double qui = sc.nextDouble();
        
        double media = ( mat + fis + qui)   ;
        
        System.out.println("Sua média é: " + media);
        
        if ( media >= 21){
            System.out.println("Parabéns, você foi aprovado. \n ");
        }
        
        if ( media < 21){
            System.out.println("Que pena, você está de recuperação. Precisa estudar mais !");
        }
        
    }
    
}
