

/*
Sabe-se que o quilowatt de energia custa um quinto do salário mínimo. 
Faça um programa que receba o valor do salário mínimo e a quantidade de quilowatts 
consumida por uma residência. 
Calcule e mostre 
- O valor em reais de cada quilowatt 
- O valor em reais a ser pago por essa residência 
- O valor em reais a ser pago com desconto de 15% 

ENTRADA
- salminimo
- qtdqwconsumida

PROCESSAMENTO
valqw = salminimo / 5
valpago = valqw * qtdqwconsumida
   R$         %
valpago     100
valpagodesc  85   

valpagodesc * 100 = valpago * 85
valpagodesc = (valpago * 85) / 100

SAIDA
valqw
valpago
valpagodesc

*/
import java.util.Scanner;
public class exercicio26 {
    public static void main(String[] args) {
        float salminimo = 0, qtdqwconsumida = 0, valqw = 0, valpago = 0, valpagodesc= 0;
        Scanner leitor = new Scanner(System.in);

        //ENTRADAS
        System.out.println("Digite o valor do salario minimo");
        salminimo = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a quantidade consumida de Quilowatts ");
        qtdqwconsumida = Float.parseFloat(leitor.nextLine());
        //PROCESSAMENTO
        valqw = salminimo / 5f;
        valpago = valqw * qtdqwconsumida;
        valpagodesc = valpago - (valpago * 85f) / 100f;
        //SAIDA
        System.out.println("O valor unitario do Quilowatt é: " + valqw);
        System.out.println("O valor pago e: " + valpago);
        System.out.println("O valor com desconto de 15% e " + valpagodesc);         
            



   }

    
}
