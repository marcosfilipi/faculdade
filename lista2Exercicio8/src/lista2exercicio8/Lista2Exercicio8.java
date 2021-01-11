
package lista2exercicio8;

import java.util.Scanner;

public class Lista2Exercicio8 {


    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Vamos Calcular o volume de uma esfera ! \n ");
        
        System.out.println("Informe o tamanho do raio em CENTÍMETROS. ");
        
        double volume;
        
        double raio = ler.nextDouble();
                
        raio = (raio/2);
        
        volume = (4 * 3.1415) * (raio*raio*raio)/3;
        
        System.out.println("O volume da esfera é: " + volume + " Centímetros Cúbicos " );
        
        
        
    }
    
}
