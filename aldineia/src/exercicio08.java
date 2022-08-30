
/*
Faça um programa que receba um número real, encontre e mostre:  2.5
     - a parte inteira desse número; 2 (arredondamento, conversão de float pra int)
     - a parte fracionária desse número; 0.5 (o numero original e subtrair a parte inteira)
     - o arredondamento desse número; 3 (fazer o arredondamento)

ENTRADAS
 - umnumero 

PROCESSAMENTO
numinteiro = (int)umnumero  
numdecimal = umnumero %1
numarredondado = Math.round(umnumero)    

SAIDAS
- numinteiro 
- numdecimal
- numarredondado

*/
import java.util.Scanner;
public class exercicio08 {
        public static void main(String[] args) {
                float umnumero = 0; 
                int numinteiro=0;
                float numdecimal = 0;
                float numarredondado = 0;
                Scanner leitor = new Scanner(System.in);

                System.out.println("Digite um numero REAL");
                umnumero = Float.parseFloat(leitor.nextLine());
                //Conversão de tipo float para int (com perda de info)
                numinteiro = (int)umnumero;
                numdecimal = umnumero % 1;
                //A % serve para calcular o resto da divisão
                //numdecimal = umnumero - numinteiro (outra forma de fazer)
                numarredondado = Math.round(umnumero);
        
                System.out.println("O valor inteiro é:" + numinteiro);
                System.out.println("O valor decimal é:" + numdecimal);
                System.out.println("O valor arredondado é:" + numarredondado);




        
}
   
    
}
