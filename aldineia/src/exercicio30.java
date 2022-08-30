import java.util.Scanner;

/*
Uma empresa decide dar um aumento de 30% aos funcionários com 
salários inferiores a R$ 500,00. Faça um programa que receba o 
salário do funcionário e mostre o valor do salário reajustado ou uma 
mensagem caso ele não tenha direito ao aumento. 
ENTRADAS
- valsalario

PROCESSAMENTO
Se (valsalario <= 500)entao inicio
    novosalario = valsalario + (valsalario * 30 / 100)
    ESCREVA novosalario
fim
senao inicio
    ESCREVA "VOCE NAO TEM DIREITO A AUMENTO"
fim
SAIDA
Novo valor do salario, ou não ter direito a aumento


*/
public class exercicio30 {
    public static void main(String[] args) {
        // Declaração das variáveis
        float valsalario = 0;
        float novosalario = 0;
        Scanner leitor  = new Scanner(System.in);

        System.out.println("Digite o valor do salário");
        valsalario = Float.parseFloat(leitor.nextLine());
                    
        if (valsalario <= 500f){
            //ENTAO - tem direito ao aumento
            novosalario = valsalario + (valsalario * 30f / 100f);
            System.out.println("O novo salario e: " + novosalario);   
        }else{
            System.out.println("Você não tem direito ao aumento"); 

        
        }  
        
    }
    
}
