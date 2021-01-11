
package lista4exercicio18;

import java.util.Scanner;


public class Lista4Exercicio18 {

    
    public static void main(String[] args) {
        
        
            System.out.println("Programa que encontra os 2 maiores valores entre 20 números digitados. \n ");
            
            
            Scanner scan = new Scanner(System.in);
            
            int num=0;
            
            int verificador=0;
            
            int cont = 0;
            int cont2=5;
            int maior1=0;
            int maior2=0;
            
            System.out.println("Digite um numero positivo qualquer.\n ");
            
            
            
            
            while ( cont < cont2 ){
                
                num = scan.nextInt();
                //maior1 = num;
                //maior2 = num;
                
                    if ( num > maior1){
                        
                        maior1 = num;
                    }
                
                    if( maior2 < num){
                    
                        maior2 = num;
                    }
                    cont2--;
                    }
                    //if ( maior1 > maior2 ){
                    
                        System.out.println("O maior número é: " + maior1);
                        System.out.println("O Segundo maior número é: " + maior2);
                    }
                    //if ( maior2 < maior1){        
                        
                        //System.out.println("O Segundo maior número é: " + maior2);
                }       
    }
}
    
