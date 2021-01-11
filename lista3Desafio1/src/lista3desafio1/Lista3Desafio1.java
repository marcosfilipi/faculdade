
package lista3desafio1;

import java.util.Scanner;


public class Lista3Desafio1 {

   
    public static void main(String[] args) {
        
        System.out.println("----------CAIXA 24 HORAS----------");
        
        System.out.println("Digite o valor que deseja sacar \n  ");
        
        //limite máximo de saque 600 reais
        //limite mínimo de saque 10 reais 
        
        //notas de 1, 5, 10, 50, 100 
        
        Scanner sc = new Scanner(System.in);
        int centena =0;
        int saque = sc.nextInt();
        int dezena = 0;
        int unidade = 0;
        
        if ( saque > 600){
            System.out.println("Ultrapassou o limite máximo diário.\n  ");
            System.out.println("Limite máximo diário de R$600,00");
        }
        centena = saque / 100;
        dezena = (saque / 10)%10;
        unidade = saque % 10;
        
               
        System.out.println("Aguarde a contagem das cédulas. \n");  
        
        System.out.println("Liberado para saque: " + centena + " notas de R$100,00 Reais\n");
        
        if ( dezena * 10 >= 50){
             dezena = ((dezena*10) - 50);
             dezena = dezena/10;
        System.out.println("Liberado para saque: 1 nota de R$50,00 Reais " + (dezena ) + " notas de R$10,00 Reais\n");
        }
        if ( unidade >= 5){
             unidade -= 5; 
        System.out.println("Liberado para saque: 1 nota de R$5,00 Reais " + unidade + " notas de R$1,00 Real \n ");
        }
        
    }
    
}
