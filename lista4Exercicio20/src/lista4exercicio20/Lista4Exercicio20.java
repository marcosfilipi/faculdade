
package lista4exercicio20;

import java.util.Scanner;


public class Lista4Exercicio20 {

    
    public static void main(String[] args) {
            
            String nome;
            String senha;
            Scanner scan = new Scanner(System.in);
                
            System.out.println("Programa de verificação de senha. \n ");
            
            System.out.println("Digite o seu Nome. \n ");
            
            nome = scan.nextLine();
            
            System.out.println("Digite a sua Senha. \n ");
            
            senha = scan.nextLine();
            
            
            while ( senha != nome ){
            
            if ( senha.equals(nome)){
                
                System.out.println("Senha não pode ser igual ao nome. ");
                
                System.out.println("Digite o seu Nome. \n ");
            
                nome = scan.nextLine();
            
                System.out.println("Digite a sua Senha. \n ");
            
                senha = scan.nextLine();
                
            }else{
                System.out.println("Seha cadastrada com sucesso. ");
                break;
            }
            
        }
            
    }
}