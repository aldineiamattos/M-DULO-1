import java.util.Scanner;

public class ExemploEstruturaDeDados2 {
    public static void main(String[] args) {
        int [] numero = new int[10];
        int [] numero2 = {1,2,3,4,5,6,8,9,10};
        System.out.println(numero2[0]);

        char[] nome = {'u', 'n', 'i', 'v', 'i', 'l', 'l', 'e'};
        //for each - iterador
        for(char umaLetra : nome){
            System.out.println((int)umaLetra);
        }

        String nome2 = "univille";
        System.out.println(nome2.hashCode());
        System.out.println(nome2);
        System.out.println(nome2.toUpperCase());
        //.toUpperCase transforma de minúsculo para maiúsculo.
        // STRINGS SÃO IMUTÁVEIS - Array de letras E ESTÁTICA.
        nome2 = "UNIVILLE"; //string pool (piscina de textos)
        System.out.println(nome2.hashCode());

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite UNIVILLE");
        String entrada = leitor.nextLine();
        // não fazer assim: if(nome2 == entrada) e sim
        //equalsIgnoreCase = verifique se os valores são iguasis ignorando maisculo e minusculo
        if(nome2.equalsIgnoreCase(entrada)){ 
            System.out.println("São iguais");
        }else{
            System.out.println("Não são iguais");
            //Strings nunca mudam - replayce troca palavras


                  
              
        }

    }

}





        

        



    
        

    
