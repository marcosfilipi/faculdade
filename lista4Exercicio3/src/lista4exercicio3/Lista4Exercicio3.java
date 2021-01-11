
package lista4exercicio3;

import java.util.Scanner;


public class Lista4Exercicio3 {

    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int n1;
        int n2 = 0;
        
        System.out.println("Digite um número positivo. \n");
        
        n1 = scan.nextInt();
        
        while (n2 < n1 + 1){
            System.out.println(n2);
            ++n2;
        }
    }
    
}
