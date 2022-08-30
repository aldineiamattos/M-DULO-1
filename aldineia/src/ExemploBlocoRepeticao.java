import java.util.Scanner;

public class ExemploBlocoRepeticao {
    public static void main(String[] args) {
        // enquanto
        int contador = 0;
        while (contador <= 10) {
            System.out.println("rodando... " + contador);
            //operador de incremento pós fixado
            //contador = contador + 1
            //contador += 1
            contador++;
        }
        contador = 10;
        //VOCE NUNCA SABE QUANTAS VEZES ELE VAI REPETIR
        while(contador >= 0){
            System.out.println("rodando... " + contador);
            contador--;
        }

        int resposta = 0;
        Scanner leitor = new Scanner(System.in);
        //VOCE NUNCA SABE QUANTAS VEZES ELE VAI REPETIR
        do{
            System.out.println("sim eu vou entrar pelo menos uma vez");
            System.out.println("Digite o numero 5");
            resposta = Integer.parseInt(leitor.nextLine());
        }while(resposta != 5);
        //contador = contador + 2
        //contador += 2
        
    }
}

      
    

