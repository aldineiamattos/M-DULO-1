

/*
Faça um programa que receba o valor do salario mínimo e o valor do salário de um funcionário, 
calcule e mostre a quantidade de salários mínimos que esses funcionário ganha.

salminimo........100
qtdsalminimo.....salfunc

ENTRADAS
- valsalminimo
- valsalario
PROCESSAMENTO   
numsalminimos = valsalario /valsalminimo
SAIDA
numsalminimos
*/
    import java.util.Scanner;
    public class exercicio16 {
        public static void main(String[] args) {
        float valsalminimo = 0;
        float valsalario = 0;
        float numsalminimos = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do salario minimo");
        valsalminimo = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o valor do salario");
        valsalario = Float.parseFloat(leitor.nextLine());

        numsalminimos = valsalario / valsalminimo;

        System.out.println("O numero de salarios é: " + numsalminimos);





        


        
    }
    
}
