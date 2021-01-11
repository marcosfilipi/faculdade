
package lista2exercicio11;

import java.util.Scanner;

public class Lista2Exercicio11 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Vamos Calcular o seu IMC ?!?!?!?! \n ");
        
        System.out.println("Digite o seu nome \n");
        
        String nome = ler.nextLine();
        
        System.out.println("Digite o seu peso \n ");
        
        double peso = ler.nextDouble();
        
        System.out.println("Digite a sua altura \n ");
        
        double altura = ler.nextDouble();
        
        double imc = peso/(altura * altura);
        
        System.out.println(nome + ", seu IMC é: " + imc);
    }
    
}
