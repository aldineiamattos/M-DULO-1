import java.util.Scanner;
/*
Faça um programa que some R$ 10,00 no salario de uma pessoa e
apresente o resultado em tela.
*/
public class Entradas {
    public static void main(String[] args) {
        //CONSTANTES
        final float AUMENTO = 10F;
        //CONVERSÃO ENTRE TIPO OBJETO E PRIMITIVO
        Scanner leitor = new Scanner(System.in);
        //ENTRADA DE DADOS
        System.out.println("Digite o seu salario");
        //CONVERTENDO OBJETO(STRING) PARA PRIMITIVO(FLOAT)

        float salario = Float.parseFloat(leitor.nextLine());
        //PROCESSAMENTO
        salario = salario + AUMENTO; 
        //salario = salario - AUMENTO; 
        //salario = salario / AUMENTO; 
        //salario = salario * AUMENTO; 
        //Resto de Divisão %

        //boolean ePar = salario % 2 == 0;
        //Potencia Math.pow(2, 10)
        //Raiz quadrada Math.sqrt(18)
        //Numero absoluto Math.abs(-10)

        //OPERADORES LOGICOS
        //E  java &&
        //OU java ||
        //NOT java !
        
        if( salario > 10000 && salario < 100000 ){
            System.out.println("Muito rico");
        }else{
            System.out.println("Nem tanto");
        }

        //atribuição de valor var = var + 10
        //SAIDA
        System.out.println("O novo salario e " + salario);
    }
}

