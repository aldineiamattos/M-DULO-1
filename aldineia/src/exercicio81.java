import java.util.Arrays;

/*
81) Faça um programa que carregue dois vetores/array, X e Y, com dez números 
inteiros cada um. Considere que os números de cada vetor digital, X e Y, 
não podem estar repetidos. Calcule e mostre os seguintes vetores resultantes:
- a união de X com Y (todos os elementos de X e os elementos de Y que não estejam em X)
- a diferença entre X e Y (todos os elementos de X que não existam em Y)
- a soma entre X e Y (soma de cada elemento de X com o elemento de mesma posição em Y)
- produto entre X e Y (multiplicação de cada elemento de X com o elemento de mesma posição em Y)
- a interseção entre X e Y (apenas os elementos que aparecem nos dois vetores) */

// SQL VAI FAZER ISSO POR MIM, VOU USAR DE FORMA INDIRETA EM BANCO DE DADOS.
public class exercicio81 {
    public static void main(String[] args) {
        int[] x = {1,2,3,4,5,6,7,8,9,0};
        int[] y = {1,20,3,40,5,60,7,80,9,100};
        //TODO: implementar a entrada
        int[] uniao = new int[20];

        //UNIAO
        for(int i=0;i<10;i++){
            uniao[i] = x[i];
        }
        int proxlivre = 10;
        for(int i=0;i<10;i++){
            System.out.println(y[i]);
            boolean achei = false;
            for(int j=0;j<10;j++){
                System.out.println("\t"+x[j]);
                if(y[i] == x[j]){
                    System.out.println("ACHEI!!!!");
                    achei = true;
                    break;
                }
            }
            if(achei == false){
                System.out.println("NAO ACHEI EM LUGAR NENHUM");
                uniao[proxlivre] = y[i];
                proxlivre = proxlivre + 1;
            }
        }

        System.out.println(Arrays.toString(uniao));
        // a diferença entre x e y 
        //(todos os elementos de x que não existam em y)
        System.out.println("*****DIFERENCA*****");
        proxlivre =0;
        int [] diferença = new int[10];
        for(int i=0; i<10; i++){
            System.out.println("diff x: " + x[i]);
            boolean achei = false;
            for(int j=0; j<10; j++){
                System.out.println("\tdiff y: " + y[j]);
                if(x[i] == y[j]){
                    System.out.println("ACHEI IGUAL");
                    achei = true;
                    break;
                    
                }

            }
            if(!achei){
                diferença[proxlivre]= x[i];
                proxlivre++;
            }
        
        }
        System.out.println(Arrays.toString(diferença));

        //a soma entre x e y 
        //(soma de cada elemento de x com o elemento de mesma)
        //posição.
        System.out.println("*****SOMA*****");
        int [] soma = new int[10];
        for(int i=0; i<10; i++){
            soma[i]= x[i] + y[i];
        }
        System.out.println(Arrays.toString(soma));

        //- produto entre x e y
        //(multiplicação de cada elemento de x com o elemento 
        //de mesma posição)
        System.out.println("*****PRODUTO*****");
        int [] produto = new int[10];
        for(int i=0; i<10; i++){
            produto[i]= x[i] + y[i];
        }
        System.out.println(Arrays.toString(produto));

        //a interseção entre x e y
        //(apenas os elementos que aparecem nos dois vetores)
        System.out.println("*****intersecao*****");
        int [] intersecao=  new int[10];
        proxlivre = 0;
        for(int i=0; i<10; i++){
            System.out.println("inter X:" + x[i]);
            for(int j=0; j<10; j++){
                System.out.println("\tinter Y:" + y[i]);
                if(x[i] == y[j]){
                    intersecao[proxlivre] = x[i];
                    proxlivre++;
                    break;
                }

            }

        }
        System.out.println(Arrays.toString(intersecao));

    }

}

        
     
      
    
