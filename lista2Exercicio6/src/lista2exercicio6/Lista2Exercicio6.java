package lista2exercicio6;

import java.util.Scanner;

public class Lista2Exercicio6 {

        
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Qual o seu nome ?  \n");
        
        String nome = ler.nextLine();
        
        System.out.println("Qual a sua idade ?  \n" );
        
        int idade = ler.nextInt();
        
        idade = (100 - idade)+ 2020;
        
        System.out.println("Olá " + nome);
        
        System.out.println("Você completara 100 anos em: " + idade);
        
    }
    
}
