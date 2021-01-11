
package lista2exercicio15;

import java.util.Scanner;

public class Lista2Exercicio15 {

    
    public static void main(String[] args) {        
    
    int num;
    int conversor = 0 ;
                
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite um número que contenha no máximo 3 digitos: \n  ");
                        
                            num = ler.nextInt();        

				while(num > 0)
				{
                                        conversor = conversor * 10;
                                        
					conversor = conversor + (num % 10);
                                        // conversor = 5
                                        
					num = num / 10;
				}
                                
				System.out.print("O numero invertido é: " + conversor + "\n");

    }
}
    

    


