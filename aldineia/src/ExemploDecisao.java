import java.util.Scanner;

public class ExemploDecisao {
    public static void main(String[] args) {
        int numero = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero");
        numero = Integer.parseInt(leitor.nextLine());
        /*
        if(condição/TESTE){
            //bloco de codigo (ENTAO - VERDADEIRO)
        }else{
            //bloco de codigo (SENAO - FALSO)
        }
        if(condição/TESTE){
            //bloco de codigo (ENTAO - VERDADEIRO)
        }
        */
        if(numero >= 10){
            System.out.println("O numero é maior ou igual a DEZ");
        }else{
            System.out.println("O numero e menor que DEZ");
        }
        System.out.println("FIM DO PROGRAMA");

        /* int idade = 10;
        boolean estouMentindo= false; // comparação transforma num valor boolenao
        if (idade = 10){ // pode ser if(true)
            // sim entao
        }else if(idade > 10){ // senao não testa nada - precisa do if

        }
       int idade = 10;

       if(idade >= 10 && idade<=20){ 
        // >= <= usar && quando as setas apontam uma para outra
        // <= >= usar OR || quando as setas apontam para fora

       }
       switch (idade){
           case 1: case 2: case 3: case 4: case 5:

           break;
           case 6:
           // todo case têm que ter um break
           break;
           default: // qdo ele não caiu em nada, ele não é obrigatório
           break; // usa para dar uma limitada*/
           // Estudar Exercicios do 28 ao 47
       }     
    }            

