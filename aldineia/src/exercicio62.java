/*
 62) Elaborar um programa que efetue a leitura de valores positivos 
 inteiros até que um valor negativo seja informado. Ao final deve ser 
 apresentados o maior e o menor número informado pelo usuário.
 
 */
import java.util.Scanner;

public class exercicio62 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int umnumero = 0;
        int omaiornumero = 0;
        int omenornumero = 0;
        int contador = 0; // para eu saber o numero de voltas no while
        do{
            System.out.print("Digite um numero");
            umnumero = Integer.parseInt(leitor.nextLine());
            
            if(umnumero >=0){
                if (umnumero > omaiornumero){
                    omaiornumero = umnumero;
                }
                //estou na primeira volta? passando aqui pela primeira vez!!!
                if (contador ==0){
                    //entao o numero digitado é o menor de todos
                    omenornumero = umnumero;
                }else{
                    //para todos os outros numeros digitados, comparar com o menor
                    if (umnumero < omenornumero){
                        omenornumero = umnumero;
                    }
                }
            }
            contador++;
        }while (umnumero >=0);
        System.out.println("O maior numero e " + omaiornumero);
        System.out.println("O menor numero e " + omenornumero);
    
    }
}