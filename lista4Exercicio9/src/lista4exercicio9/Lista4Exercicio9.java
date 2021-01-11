
package lista4exercicio9;


public class Lista4Exercicio9 {

    
    public static void main(String[] args) {
        
            System.out.println("Programa que calcula a qauntidade de anos para igualar um dos paises. \n ");
            
            double pa = 80.000;
            double txa = 0.03;
            int contA = 0;
                   
                    
            double pb = 200.000;
            double txb = 0.015;
            int contB = 0;
            
            while ( pa <= pb ){
                                               
                System.out.println("População país A \n" + ( pa = (pa * txa) + pa));
                System.out.println(" ");
                System.out.println("População país B \n" + ( pb = (pb * txb) + pb));
                System.out.println(" ");
                    contA++;
                    contB++;
                               
            }
                System.out.println(" O país A levará " + contA + " anos para igualar ou ultrapassar o país B ");
                //System.out.println(" O país B levará " + contB + " anos para igualar ou ultrapassar o país A ");
                
    }               
    
}
