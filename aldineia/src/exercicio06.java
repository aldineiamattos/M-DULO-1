
/*
Construa um programa que calcule a quantidade total de ração consumida por um cachorro por mês.
Solicite a quantidade consumida por refeição e o numero de refeições por dia.

ENTRADAS
qtdporrefeicao
numrefeicoesdia

PROCESSAMENTO

SAIDA
qtdtotalracao

*/
import java.util.Scanner;
public class exercicio06 {
    public static void main(String[] args) {
        float qtdporrefeicao = 0;
        int numrefeicoesdia = 0;
        float qtdtotalracao = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite qtd por refeição");
        qtdporrefeicao = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o numero de refeições por dia");
        numrefeicoesdia = Integer.parseInt(leitor.nextLine());

        qtdtotalracao  = (qtdporrefeicao * numrefeicoesdia) * 30f;

        System.out.println("A qtd total de ração e: " + qtdtotalracao);  
         
        
    }
}
