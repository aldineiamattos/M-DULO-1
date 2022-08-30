
    /*
    Faça um programa que calcule e mostre a área de um quadrado. Sabe-se que: A=lado * lado
    area = lado * lado
    ENTRADAS 
    - lado
    PROCESSAMENTO
    area= lado * lado
    SAIDA
    - area
    */
    
    import java.util.Scanner;
    public class exercicio14 {
        public static void main(String[] args) {
        float area = 0;
        float lado = 0;
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o tamanho de um dos lados?");
        lado = Float.parseFloat(leitor.nextLine());
        
        area= lado * lado;

        System.out.println("A area do quadrado é: " + area);  



    }
}
