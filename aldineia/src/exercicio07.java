/*
Faça um programa que calcule o valor da multa por atraso de pagamento de um boleto bancário.
Solicite o valor do boleto e o percentual de multa.

ENTRADAS
- valboleto (R$)
- permulta  (%)         

PROCESSAMENTO
    R$          %
valboleto......100
valmulta.......permulta   

valmulta * 100 = valboleto * permulta

valmulta = (valboleto * percmulta) / 100

SAIDA
- valmulta
*/
import java.util.Scanner;
public class exercicio07 {
    public static void main(String[] args) {
        float valboleto=0, valmulta=0, percmulta=0;     
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do boleto");
        valboleto = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o percentual de multa");
        percmulta = Float.parseFloat(leitor.nextLine());

        valmulta = (valboleto * percmulta) / 100f;

        System.out.println("O valor da multa é: R$" + valmulta);


       valmulta = valboleto + percmulta;

       System.out.println(String.format(
           "O valor da multa R$ %.2f %% e o valor do boleto %.2f com o percentual %.2f",
           valmulta, valboleto, percmulta));

           


    }
    }

