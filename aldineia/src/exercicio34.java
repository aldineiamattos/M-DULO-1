import java.util.Scanner;

/*
Faça um programa que receba o salário-base de um funcionário, 
calcule e mostre o salário a receber, sabendo-se que esse funcionário tem 
gratificação de 5% sobre o salário base e paga imposto de 7% sobre o salário-base
public class exercicio34 {
    public static void main(String[] args) {
        float salBase = 0;
        float gratificacao = 0;
        float imposto = 0;
        float novosalario = 0;
        Scanner leitor  = new Scanner(System.in);

        System.out.println("Digite a salario base");
        salBase = Float.parseFloat (leitor.nextLine());

        gratificacao = salBase * (5.0f / 100f);
        imposto = salBase * (7.0f / 100f);
        novosalario = salBase + gratificacao - imposto;
        System.out.println("O novo salario e" + novosalario);
                    }
    }
    */
    
import java.util.Scanner;
public class exercicio34 {
   public static void main(String[] args) {
       float salBase = 0;
       float salFinal = 0;
       Scanner leitor = new Scanner(System.in);

       System.out.println("Digite o salario base");
       salBase = Float.parseFloat(leitor.nextLine());
       salFinal = salBase - (salBase * 2f / 100f);
       System.out.println("O salario final e " + salFinal);
    
   } 
}
