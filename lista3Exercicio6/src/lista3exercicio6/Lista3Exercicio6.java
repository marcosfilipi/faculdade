
package lista3exercicio6;

import java.util.Scanner;


public class Lista3Exercicio6 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Progama para verificar qual o tipo de Triâgulo. \n ");
        
        System.out.println("Digite os 3 lados do triângulo para verificarmos qual o tipo de triângulo. \n ");
        
        System.out.println("Digite o primeiro lado. \n ");
        int ladoA = sc.nextInt();
        
        System.out.println("Digite o segundo lado. \n ");
        int ladoB = sc.nextInt();
        
        System.out.println("Digite o terceiro lado. \n ");
        int ladoC = sc.nextInt();
        
        if ( ladoA == ladoB && ladoA != ladoC){
            System.out.println("Triângulo ISÓSCELES. \n ");
        }
        if ( ladoA != ladoB && ladoB != ladoC){
            System.out.println("Triângulo ESCALENO. \n ");            
        }
        if ( ladoA == ladoB && ladoB == ladoC){
            System.out.println("Triânquilo EQUILÁTERO. \n ");
        }
    }
    
}
