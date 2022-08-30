

/*
Faça um programa que receba uma hora (uma variável para hora e outra para minutos), calcule e mostre:
 - a hora digitada convertida em minutos;
 - o total dos minutos, ou seja, os minutos digitados mais a conversão anterior;
 - o total dos minutos convertidos em segundos.
 horas = 2  minutos = 37
 
 ENTRADAS
  - horas
  - minutos
  
 PROCESSAMENTO
 - horaseminutos = horas*60
 - totminutos = minutos + horaseminutos
 - totsegundos = totminutos * 60

 SAIDA 
 - horaseminutos
 - totminutos
 - totsegundos
 
*/
import java.util.Scanner;
public class exercicio20 {
    public static void main(String[] args) {
        float horas = 0;
        float minutos = 0;
        float horaseminutos = 0;
        float totminutos = 0;
        float totsegundos = 0;
        

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor das horas");
        horas = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o valor dos minutos");
        minutos = Float.parseFloat(leitor.nextLine());

        horaseminutos = horas * 60f;
        totminutos = minutos + horaseminutos;
        totsegundos = totminutos * 60f;
                    
        System.out.println("O valor das horas em minutos é: " + horaseminutos);
        System.out.println("O valor total de minutos é: " + totminutos);
        System.out.println("O valor total de segundos é: " + totsegundos);







        
    }
    
}
