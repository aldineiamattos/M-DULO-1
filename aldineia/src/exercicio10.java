/*
Um funcionário recebe um salário fixo mais 4% de comissão sobre as vendas. 
Faça um programa que receba o salário fixo do funcionário e o valor de suas vendas,
calcule e mostre a comissão e seus salário final.

ENTRADA
- salfixo
- valtotalvendas

PROCESSAMENTO
valcomissao = (valtotvendas *4)/100
valsalfinal = salfixo + valcomissao

SAIDA
-valcomissao
- valsalfinal
*/

import java.util.Scanner;
public class exercicio10 {
   public static void main(String[] args) {
      float salfixo=0, valtotalvendas=0, valcomissao=0, valsalfinal=0;
      Scanner leitor = new Scanner(System.in);  

      System.out.println("Digite valor do salario fixo");
      salfixo = Float.parseFloat(leitor.nextLine());
      System.out.println("Digite o valor total de vendas" ); 
      valtotalvendas = Float.parseFloat(leitor.nextLine());

      valcomissao = (valtotalvendas *4f) / 100f;
      valsalfinal = salfixo + valcomissao;

      System.out.println("O valor da comissão é: " + valcomissao);
      System.out.println("O valor do salario final é: " + valsalfinal);

       }
    
}
