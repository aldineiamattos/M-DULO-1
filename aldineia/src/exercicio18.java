

/*
Faça um programa que receba uma temperatura em Celsius, 
calcule e mostre essa temperatura em Fahrenheit. 
Sabe-se que F = C x 1,8 + 32
Temperatura em Celsius = 25 e Fahrenheit = 77

ENTRADA
- tempcelsius

PROCESSAMENTO
tempfahrenheit= tempcelsius x 1.8f + 32f

SAIDA
- tempfahrenheit

*/
import java.util.Scanner;
public class exercicio18 {
    public static void main(String[] args) {
         
        float tempcelsius = 0;
        float tempfahrenheit = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a temperatura em celsius");
        tempcelsius = Float.parseFloat(leitor.nextLine());

        tempfahrenheit = tempcelsius * 1.8f + 32f;

        System.out.println("A temperatura é: " + tempfahrenheit);
    





    }
    
}
