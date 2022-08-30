import java.util.Arrays;
import java.util.Scanner;

public class ExemploEstruturaDeDados {
    public static void main(String[] args) {
        // Variaveis com dados simples 
        int idade = 10;
        float salario =1200f;
        boolean vaiChover= true;

        //Variaveis estruturadas - Array/Vetor/Lista
        String [] listaNomes = new String[10];
        listaNomes[0] = "zezinho";
        listaNomes[9] = "mariazinha";

        System.out.println(listaNomes[0]);
        //listaNomes[o] = null;
        //System.out.println(listaNomes[o]);
        System.out.println(listaNomes[9]);

        //incluir Scanner para usuário digitar os nomes
        Scanner leitor = new Scanner(System.in);
        for(int i=0; i< 10; i++){
            System.out.println("Digite um nome");
            listaNomes[i] = leitor.nextLine();   
        }
        
        for(int i=0; i<10; i++){
            System.out.println(listaNomes[i]);
        }
        System.out.println(Arrays.toString(listaNomes));
    }


    }
    

