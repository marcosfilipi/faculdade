
package lista2exercicio14;

import java.util.Scanner;

public class Lista2Exercicio14 {

    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um Número Inteiro para gerar a tabuada. \n ");
        
        int num = ler.nextInt();
        
        System.out.println("O Número que você digitou foi:   "+ num);
        System.out.println(" ");
        
        System.out.println("TABUADA DO NÚMERO  "+num);
        System.out.println(" ");
        
        for (int multi = 0; multi <=10; multi++){
            
            if( num < 0){
                System.out.println("Número Inválido.");
                break;
            }
        else
                
            System.out.println(num+" x "+multi+" = "+num*multi);
        
        }
        
        
        
    }
    
}
