

/*
Faça um programa que receba o número de horas trabalhadas e o valor do salário mínimo. 
Calcule e mostre o salário a receber seguindo as regras abaixo: 
- A hora trabalhada vale a metade do salário mínimo 
- O salário bruto equivale ao número de horas trabalhas multiplicado pelo valor da 
hora trabalhada; 
- O imposto equivale a 3% do salário bruto; 
- O salário a receber equivale ao salário bruto menos o imposto. 

ENTRADA 
- numhorastrab
- salminimo

PROCESSAMENTO
- valhora = salminimo / 2 
- salbruto = numhorastrab* horatrabalhada
- valimposto = (salbruto * 3) / 100


SAIDA
- salreceber = salbruto - valimposto
*/
import java.util.Scanner;
public class exercicio24 {
    public static void main(String[] args) {
        int numhorastrab = 0;
        float salminimo = 0;
        float valhora = 0;
        float salbruto = 0;
        float valimposto = 0;
        float salreceber = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o número de horas trabalhadas");
        numhorastrab = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o valor do salario minimo");
        salminimo = Float.parseFloat(leitor.nextLine());

        valhora = salminimo / 2f;
        salbruto = numhorastrab * valhora;
        valimposto = (salbruto * 3f) / 100f;
        salreceber = salbruto - valimposto;

        System.out.println("O salario a receber é "  + salreceber);




        
    }
    
}
