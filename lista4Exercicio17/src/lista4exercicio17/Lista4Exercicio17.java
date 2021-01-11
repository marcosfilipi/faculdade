
package lista4exercicio17;


public class Lista4Exercicio17 {

    
    public static void main(String[] args) {
        
        System.out.println("Programa para calcular o tempo de crescimeto entre duas pessoas. ");
        
        double chico = 1.50;
        double chicoCresce =  0.02;
        int contChico=0;
                
        double juca = 1.10;
        double jucaCresce = 0.03;
        int contJuca=0;
        
        while ( juca < chico ){
                                               
                 juca = (juca * jucaCresce) + juca;
               
                 chico = (chico * chicoCresce) + chico;
                
                    contJuca++;
                    contChico++;
              
       }
                System.out.println(" Juca ficará maior que chico em " + contJuca + " anos ");
   }
}
