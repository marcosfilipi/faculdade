
package lista3exercicio9;

import java.util.Scanner;

public class Lista3Exercicio9 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
                
        System.out.println("Programa para verificar a Idade eleitoral obrigatória, não obrigatória e não elegível. \n ");
        System.out.println("Digite a sua idade para verificarmos se você é um eleitor elegível para votar. \n ");
        int idade = sc.nextInt();
        
        if ( idade < 16){
            System.out.println("Você ainda não está elegível para votar. você tem: " + idade + " anos.  Menor de 16 anos.");
        }
        if ( idade >= 16 && idade <= 18 || idade >= 65 ){
            System.out.println("Você é um eleitor facultativo. \n ");           
        }
        if ( idade >= 18 && idade < 65){
            System.out.println("Você é um eleitor elegível e é obrigado a votar. você tem: " + idade + " anos. ");
        }
        

    }
    
}
