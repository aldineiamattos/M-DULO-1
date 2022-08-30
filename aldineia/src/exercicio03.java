/*
Faça um programa que calcule o valor de reembolso de despesas de combustível 
de um funcionário. Considere que o carro tem o consumo de 1 litro de gasolina 
a cada 13km rodado. E o preço do litro de gasolina é de R$ 2,20.

*/

import java.util.Scanner;
public class exercicio03 {
    public static void main(String[] args) {
        float distancia = 0;
        float qtdlitros = 0;
        float valreembolso = 0;
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a distancia percorrida");
        distancia = Float.parseFloat(leitor.nextLine());

        qtdlitros = distancia / 13;
        valreembolso = qtdlitros * 2.20f;

        System.out.println("O valor do reembolso e: R$ " + valreembolso);
        leitor.close();



    }      
    
}
