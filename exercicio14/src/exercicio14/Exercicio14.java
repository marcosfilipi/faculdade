
package exercicio14;

import java.util.Scanner;

public class Exercicio14 {

  
    public static void main(String[] args) {
        
        System.out.println("Digite um valor em polegadas para ser convertido para metros \n ");
        
        Scanner ler = new Scanner(System.in);
        
        double resultado;
        double metros = 0.0254;
        double polegadas = ler.nextDouble();
        
        resultado = (polegadas / 39.37);
        
        System.out.println(String.format("O valor convertido em Metros é: %.4fl. " , resultado));
    }
    
}
