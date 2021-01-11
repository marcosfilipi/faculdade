
package exercicio15;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {

        System.out.println("Digite o seu pelo em KG para transformar em Gramas \n ");
        
        Scanner ler = new Scanner(System.in);
        
        double peso = ler.nextDouble();
        
        double pesoGramas = peso * 1000;
        
        System.out.println("Digite o seu percentual de emagrecimento \n ");
        
        double percentual = ler.nextDouble();
        
        double emagrecimento;
        
        emagrecimento = ((percentual * peso)/100)* 100;
        
        if ( percentual == 12){
            
            System.out.println("Seu peso em Gramas, mmenos o percetual de gordura: \n " + (pesoGramas - emagrecimento + " Gramas"));
        }
        
        else                        
        
        System.out.println("Seu peso em Gramas é: " + pesoGramas);
        
    }
    
}
