
package calculodeareacirculo;

import java.util.Scanner;

public class CalculoDeAreaCirculo {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite um valor para o raio");
        
        float raio = s.nextFloat();
        
        double pi = 3.14159; 
        
        double area = ( pi * (raio * raio))/10000; 
        
        System.out.println(String.format("A área de seu Círculo é: %.4f " , area ));
        
    }
    
}
