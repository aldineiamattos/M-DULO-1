

/*
Faça um programa que receba o salário de um funcionário e o percentual de aumento, 
calcule e mostre o valor do aumento e o novo salário. 

ENTRADA
- valsalario
- percaumento

PROCESSAMENTO
valaumento = (valsalario * percaumento) / 100
valnovosalario = valaumento + valsalario

SAIDA
- valaumento
- valnovosalario
*/
import java.util.Scanner;
public class exercicio21 {
    public static void main(String[] args) {
        float valsalario = 0;
        float percaumento = 0;
        float valaumento = 0;
        float valnovosalario = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do salario");
        valsalario = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o percentual de aumento");
        percaumento = Float.parseFloat(leitor.nextLine());

        valaumento = (valsalario * percaumento) / 100f;
        valnovosalario = valsalario + valaumento;

        System.out.println("O valor do aumento é R$: " + valaumento);
        System.out.println("O valor do novo salario e R$: " + valnovosalario);








        
    }
    
}
