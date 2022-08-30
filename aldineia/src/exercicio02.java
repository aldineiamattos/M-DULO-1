/*
Faça um programa para calcular a quantidade de carne necessária para um churrasco 
de acordo com o número de pessoas convidadas. Considere que todas são adultas 
e que um adulto consome 250 gramas de carne por refeição.

*/ 

import java.util.Scanner;
public class exercicio02 {
    public static void main(String[] args) {
        int numpessoas = 0;
        int qtdcarne = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o numero de convidados");
        numpessoas = Integer.parseInt(leitor.nextLine());
        
        qtdcarne  = numpessoas * 250;
        
        System.out.println("A qtd de carne em gramas e: " + qtdcarne);   

        leitor.close();

        
    }
}
