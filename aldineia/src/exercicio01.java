/*
Faça um programa que solicite o número de horas que um trabalhador realiza por dia, 
solicite o número de dias trabalhados em um mês e apresente 
o número total de horas trabalhadas no mês.

*/ 
import java.util.Scanner;
public class exercicio01 {
    public static void main(String[] args) {
        int numhorasdia = 0;
        int numdiasmes = 0;
        int numhorasmes = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o numero de horas trabalhadas por dia");
        numhorasdia = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o numero de dias trabalhadas por mês");
        numdiasmes = Integer.parseInt(leitor.nextLine());

        numhorasmes = numhorasdia * numdiasmes;

        System.out.println("O numero de horas no mes e: " + numhorasmes);   




        
    }
}
    


           
