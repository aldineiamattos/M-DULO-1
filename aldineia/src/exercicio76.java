import java.util.Scanner;

public class exercicio76 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner((System.in));
        int[] numeros = new int[10]; 
        int omaior=0;
        int omenor=0;

        for(int i=0; i<10; i++){
            System.out.println("Digite um numero");
            numeros [i] = Integer.parseInt(leitor.nextLine());

        }
        for(int i=0; i<10; i++){
            if(i ==0){
                omaior = numeros[i];
            }else{
                if(numeros[i] > omaior){
                    omaior = numeros[i];
                }
            }
            //nunca vincule a logica do maior com a logica do menor
            if(i == 0){
                omenor = numeros[i];
            }else{
                if(numeros[i] < omenor){
                    omenor = numeros[i];
                }
            }
        }  
        System.out.println("O maior numero e " + omaior);  
        System.out.println("O maior numero e " + omenor);  
    
    }

}
