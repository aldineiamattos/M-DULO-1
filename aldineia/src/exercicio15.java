
    /*
    Faça um programa que calcule e mostre a área de um losango. Sabe-se que: A = (diagonal maior * diagonal menor) / 2
    ENTRADAS 
    - diagonalmaior
    - diagonalmenor
    PROCESSAMENTO
    area=(diagonalmaior * diagonalmenor) / 2
    SAIDA
    - area
    */
    import java.util.Scanner;
    public class exercicio15 {
        public static void main(String[] args) {
        float diagonalmaior = 0;
        float diagonalmenor = 0;
        float area = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor da diagonal maior?");
        diagonalmaior = Float.parseFloat(leitor.nextLine());

        System.out.println("Digite o valor da diagonal menor?");
        diagonalmenor = Float.parseFloat(leitor.nextLine());

        area=(diagonalmaior * diagonalmenor) / 2;

        System.out.println("A area do losango é: " + area);  





        
    }
    

    
}
