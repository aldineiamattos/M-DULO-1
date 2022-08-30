import java.util.Scanner;

/*
Faça um programa que receba um número inteiro e mostre se ele é par ou impar. 
(utilize o operador %)
se (num % 2 == 0 ) ENTAO INICIO 
     
ENTRADAS
- int umnumero 
PROCESSAMENTO
se (umnumero%2==0) entao inicio
    ESCREVA " numero par"
fim
senao inicio
    ESCREVA "numero impar "
Fim
SAIDA
Numero par ou impar

*/
public class exercicio29 {
    public static void main(String[] args) {
        int umnumero = 0;
        Scanner leitor  = new Scanner(System.in);

        System.out.println("Digite um numero");
        umnumero = Integer.parseInt(leitor.nextLine());
        //o simbolo de % calcula o RESTO da divisão de dois numeros
        if (umnumero % 2 == 0 ) {
            System.out.println("Numero é PAR");
        }else{
            System.out.println("Numero não é PAR");
        }

    }
    
}
