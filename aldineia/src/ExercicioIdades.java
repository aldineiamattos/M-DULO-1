import java.util.Scanner;

/*
Faça um programa que solicite a idade e mostre se a pessoa é jovem, adulto
ou idoso. considere que 0 até 20 jovem, 21 até 60 é adulto e mais que 60 anos é idoso.
*/

public class ExercicioIdades {
    public static void main(String[] args) {
        int idade = 0;
        Scanner leitor  = new Scanner(System.in);

        System.out.println("Digite a sua idade");
        idade = Integer.parseInt(leitor.nextLine());

        if (idade <= 20) {
            //ENTAO 
            System.out.println("JOVEM");
        }else{
            //SENAO
            if (idade <= 60){
                System.out.println("ADULTA");
            }else{
                System.out.println("IDOSO");

                }
            }
        }   
    }



