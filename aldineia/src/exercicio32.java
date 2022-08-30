/*
Faça um programa que receba três notas de um aluno, calcule e mostre a média aritmética e a 
mensagem constante na tabela a seguir. 
Aos alunos que ficaram para exame,  calcule e mostre a nota que deverão tirar para serem aprovados(10-MF), 
considerando que a média exigida é 7.0
Média Aritmética              Mensagem
0,0    ●-------O     3,0      Reprovado
3,0    ●-------O     7,0      Exame
7,0    ●-------● 10,00        Aprovado

ENTRADAS
- nota1,nota2, nota3
PROCESSAMENTO
media = (nota1 + nota2 + nota3) / 3
- Descobrir o status do aluno
- Calcular a nota do exame
SAIDA
- Media, status a nota do exame
 
 */
import java.util.Scanner;
 public class exercicio32 {
    public static void main(String[] args) {
        float nota1=0, nota2=0, nota3=0, media =0, notaexame=0;
        Scanner leitor  = new Scanner(System.in);
        System.out.println("Digite a primeira nota");
        nota1 = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a segunda nota");
        nota2 = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a terceira nota");
        nota3 = Float.parseFloat(leitor.nextLine());

        media = (nota1 + nota2 + nota3) / 3;
        //media = Math.roud (media)
        // pode usar & (preguiçoso - não avalia a segunda expressão) &&(não preguiçoso - avalia os dois e 
        //resolve a junção dos dois)
        // Operador E &&
        // Operador OU ||
        // Operador não ! (!= / ===)
        
        if (media >= 7 && media <= 10){
            //sim
            System.out.println("Aprovado sua media e" + media);
        }else{
            //nao
            if (media >= 3 && media < 7){
                notaexame = 10 - media;
                System.out.println("EXAME sua nota e" + notaexame);
            }else{
                System.out.println("Voce esta REPROVADO");
            }

            }

        }
        }
         
               
           
        
        



        
        




        
    
    

