
package lista3exercicio7;

import java.util.Scanner;

public class Lista3Exercicio7 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Programa para calcular o IMC. \n ");
        
        System.out.println("Digite a sua altura. \n ");
        double altura = sc.nextDouble();
        
        System.out.println("Digite o seu peso. \n ");
        double peso = sc.nextDouble();
        
        double imc = peso / ( altura * altura);
        
        if ( imc < 18.5){
            System.out.println("CLASSIFICAÇÃO: MAGREZA. SEU IMC É:  " + imc);
    }
        if ( imc > 18.5 && imc < 24.9){
            System.out.println("CLASSIFICAÇÃO: NORMAL. SEU IMC É:  " + imc);
        }
        if ( imc > 24.9 && imc < 29.9){
            System.out.println("CLASSIFICAÇÃO: SOBREPESO. SEU IMC É:  " + imc);
        }
        if ( imc > 29.9 && imc < 39.9){
            System.out.println("CLASSIFICAÇÃO: OBESIDADE. SEU IMC É:  " + imc);
        }
        if ( imc > 40){
            System.out.println("CLASSIFICAÇÃO: OBESIDADE GRAVE. SEU IMC É:  " + imc);
        }
    }
    
}
