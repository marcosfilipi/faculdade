
package lista2exercicio9;

import java.util.Scanner;

public class Lista2Exercicio9 {

  
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Programa para calcular milhas/h em Kilometros/h \n");
        
        System.out.println("Digite uma quantidade em milhas/h  \n ");
        
        double km;
        
        double milhas = ler.nextDouble();
        
        km = milhas * 1.60934;
        
        System.out.println("O valor de milhas/h convertido em Km/h é: " + km + "Km/h");
        
    }   
        
    
}
