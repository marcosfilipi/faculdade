
package data;



public class Data {

    
    
    public static void main(String[] args) {
        
        System.out.println("Datas do Ano \n ");
        
        int data = 12122016;
        int dia;
        int mes;
        int ano;
        
        ano = data % 10000;
        
        data = data / 10000;
        
        mes = data % 100;
        
        data = data / 100;
        
        dia = data;
        System.out.println(("Dia: ") + (dia));
        System.out.println(("Mês: ") + (mes));
        System.out.println(("Ano: ") + (ano));
    }
    
}
