
package lista5exercicio1;

import java.util.Scanner;


public class Lista5Exercicio1 {

             
    public boolean conversa = true;
   
   
    //public static void main(String[] args) {
        
            // 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26
            //"" a b c d e f g h i  j  k l  m  n  o  p  q  r  s  t  u  v  w  x  y  z 
        public String traduzirTexto(String texto[]){
        String texto_traduzido = "";
        for (int i = 0; i < texto.length; i++) {
            
            if (texto[i].equals("0")) {
                texto_traduzido += " ";
            }
            if (texto[i].equals("1")) {
                texto_traduzido += "a";
            }
            if (texto[i].equals("2")) {
                texto_traduzido += "b";
            }
            if (texto[i].equals("3")) {
                texto_traduzido += "c";
            }
            if (texto[i].equals("4")) {
                texto_traduzido += "d";
            }
            if (texto[i].equals("5")) {
                texto_traduzido += "e";
            }
            if (texto[i].equals("6")) {
                texto_traduzido += "f";
            }
            if (texto[i].equals("7")) {
                texto_traduzido += "g";
            }
            if (texto[i].equals("8")) {
                texto_traduzido += "h";
            }
            if (texto[i].equals("9")) {
                texto_traduzido += "i";
            }
            if (texto[i].equals("10")) {
                texto_traduzido += "j";
            }
            if (texto[i].equals("11")) {
                texto_traduzido += "k";
            }
            if (texto[i].equals("12")) {
                texto_traduzido += "l";
            }
            if (texto[i].equals("13")) {
                texto_traduzido += "m";
            }
            if (texto[i].equals("14")) {
                texto_traduzido += "n";
            }
            if (texto[i].equals("15")) {
                texto_traduzido += "o";
            }
            if (texto[i].equals("16")) {
                texto_traduzido += "p";
            }
            if (texto[i].equals("17")) {
                texto_traduzido += "q";
            }
            if (texto[i].equals("18")) {
                texto_traduzido += "r";
            }
            if (texto[i].equals("19")) {
                texto_traduzido += "s";
            }
            if (texto[i].equals("20")) {
                texto_traduzido += "t";
            }
            if (texto[i].equals("21")) {
                texto_traduzido += "u";
            }
            if (texto[i].equals("22")) {
                texto_traduzido += "v";
            }
            if (texto[i].equals("23")) {
                texto_traduzido += "w";
            }
            if (texto[i].equals("24")) {
                texto_traduzido += "x";
            }
            if (texto[i].equals("25")) {
                texto_traduzido += "y";
            }
            if (texto[i].equals("26")) {
                texto_traduzido += "z";
            }
            
        }
            end(texto_traduzido);
            if (conversa) {
            return texto_traduzido;
            }else{
            return texto_traduzido = "";
            
    }
    
}

        private void end(String texto_traduzido) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

