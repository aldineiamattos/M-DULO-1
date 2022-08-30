
/*
Construa um programa que mostre o percentual que uma despesa mensal 
representa do seu salário total.
*/

import java.util.Scanner;
import javax.sound.sampled.FloatControl;
public class exercicio05 {
    public static void main(String[] args) {
       float salario=0, despesa=0, percdesp=0;
       Scanner leitor = new Scanner(System.in);

       System.out.println("Digite o valor do salario");
       salario = Float.parseFloat(leitor.nextLine());
       System.out.println("Digite o valor da despesa");
       despesa = Float.parseFloat(leitor.nextLine());

       percdesp = (despesa * 100) / salario;

       System.out.println(String.format(
           "A despesa R$ %.2f representa %.2f%% do salario de R$ %.2f", 
           despesa, percdesp, salario));
           


    }
}
