
package lista4exercicio10;

import java.util.Scanner;


public class Lista4Exercicio10 {

 
    public static void main(String[] args) {
        
        int cont =2;
        int base;
        int expo;
        int resultado=0;
        Scanner scan = new Scanner(System.in);
                
        System.out.println("Programa que calcula a base e expoente. \n ");
        
        System.out.println("Digite a base. \n ");
        
        base = scan.nextInt();
        
        System.out.println("Digite o expoente. \n ");
        
        expo = scan.nextInt();
        
        while ( cont != expo ){
            
            base = (base * base);
            System.out.println(base);
            cont++;
        }
    }
}
    

