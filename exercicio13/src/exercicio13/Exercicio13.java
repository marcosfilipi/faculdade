
package exercicio13;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o Preço da Gasolina \n ");
        
           
        double gasolina = ler.nextDouble();
        
        System.out.println("Digite a porcetagem a ser acrescida no valor da gasolina. \n ");
        
        double porcentagem = ler.nextDouble();
        
        porcentagem = (porcentagem /100);
        
        double precoGasolina = (gasolina * porcentagem) + gasolina;
        
        System.out.println("O preço da Gasolina é: \n " + precoGasolina);
    }
    
}
