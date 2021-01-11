package lista3exercicio12;

import java.util.Scanner;

public class Lista3Exercicio12 {

    public static void main(String[] args) {
               
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Programa de verificação de suspeita de crime. \n ");
        System.out.println("Digite 1 para SIM \n ");
        System.out.println("Digite 2 para NAO \n ");
        
        int contsim = 0;
        int contnao = 0;
        
        System.out.println("Você telefonou para a vítima ? \n ");
        int resposta = sc.nextInt();
        
        if ( resposta == 1)
            contsim = contsim +1;
        
        if ( resposta == 2)
            contnao = contnao +1;
        
        
        System.out.println("Esteve no local do crime ? \n ");
        int resposta1 = sc.nextInt();
        if ( resposta1 == 1)
            contsim = contsim +1;
        
        if ( resposta1 == 2)
    
            contnao = contnao +1;
        
        
        System.out.println("Mora perto da vítima ? \n ");
        int resposta2 = sc.nextInt();
        if ( resposta2 == 1)
            contsim = contsim +1;
        
        if ( resposta2 == 2)
            contnao = contnao +1;
        
        
        System.out.println("Devia para a vítima ? \n ");
        int resposta3 = sc.nextInt();
        if ( resposta3 == 1)
            contsim = contsim +1;
        
        if ( resposta3 == 2)
            contnao = contnao +1;
        
        
        System.out.println("Já trabalhou com a vítima ? \n ");
        int resposta4 = sc.nextInt();
        if ( resposta4 == 1)
            contsim = contsim +1;
        
        if ( resposta4 == 2)
            contnao = contnao +1;
        
        if ( contsim <= 2){
            System.out.println("A vítima é suspeita. \n ");
        }
        if ( contsim == 3 || contsim == 4){
            System.out.println("Vítima é Cúmplice. \n ");
        }
        if ( contsim == 5){
            System.out.println("Vítima é o Assassino. \n ");
        }
             System.out.println("sim " + contsim);
            System.out.println("não " + contnao);
        }
}


            
        
    
    


