package lista3exercicio10;

import java.util.Scanner;

public class Lista3Exercicio10 {

    public static void main(String[] args) {
        
        int credito = 1;
        int debito = 2;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Selecione a opção desejada. \n ");
        
        System.out.println("Para crédito, Digite a opção 1. \n ");
        System.out.println("Para débito,  Digite a opção 2. \n ");
        
        int op = sc.nextInt();
                       
        if(op == 1 ){
            System.out.println("Você escolheu a opção de Crédito. \n ");
            System.out.println("Digite dois números de sua escolha para fazer a operação selecionada. \n ");
            
            System.out.println("Digite o primeiro número. \n ");
            double num1 = sc.nextDouble();
            
            System.out.println("Digite o segundo número. \n ");
            double num2 = sc.nextDouble();
            
            double soma = num1 + num2;
            System.out.println("O resultado da operação é: "+ soma);
        }
            
        if(op == 2 ){
            System.out.println("Você escolheu a opção de Débito. \n ");
            System.out.println("Digite dois números de sua escolha para fazer a operação selecionada. \n ");
            
            System.out.println("Digite o primeiro número. \n ");
            double num1 = sc.nextDouble();
            
            System.out.println("Digite o segundo número. \n ");
            double num2 = sc.nextDouble();
            
            double subtracao = num1 - num2;
            System.out.println("O resultado da operação é: " + subtracao);
            
            System.out.println();
        }
            
            
        }
    }
    
        }
    }
}
    
