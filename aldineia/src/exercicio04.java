/*
Construa um programa que retorne o valor total da revelação de um filme de 24 poses, 
solicite o número de fotos reveladas. E considere que o valor unitário
da revelação por foto é de R$ 0,90.
*/

import java.util.Scanner;
public class exercicio04 {
    public static void main(String[] args) {
    int numfotos = 0;
    float valortotal = 0f;

    Scanner leitor = new Scanner(System.in);
    System.out.println("Digite o numero de fotos");
    numfotos = Integer.parseInt(leitor.nextLine());

    valortotal = numfotos * 0.9f;

    System.out.println("O valor total e: " + valortotal); 
        

    }

}

