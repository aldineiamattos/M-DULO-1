
/*
Faça um programa que receba a idade de uma pessoa e mostre a mensagem de maioridade ou não.

ENTRADAS
- idade
PROCESSAMENTO
se idade>=18 então       
    escrever "Maior de idade"
Senão
    escrever "Não é maior de idade"
SAIDA
- Mostrar se a pessoa é ou não maior de idade 

não tem mais um cálculo, mas uma decisão
*/
import java.util.Scanner;
public class exercicio28decisao {
    public static void main(String[] args) {
        int idade = 0;
      //System.in - receba dados do buffer de teclado
        Scanner leitor  = new Scanner(System.in);
        System.out.println("Digite a idade");
        idade = Integer.parseInt(leitor.nextLine());
        if (idade>= 18) {
            //ENTAO (THEN) (sim - verdade)
            System.out.println("Maior de idade");
        }else{
            //SENAO (não - false)
            System.out.println("Não é maior de idade");
        }

    }             
    
}  

