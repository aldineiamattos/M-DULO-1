        /*
        Faça um programa que receba o preço de um produto, calcule e mostre o novo preço, 
        sabendo-se que esse sofreu um desconto de 10%

        ENTRADA
        - precoproduto
        PROCESSAMENTO
        valdesc = (precoproduto*10)/100
        novopreco = precoproduto-valdesc
        SAIDA
        - novopreco
                      
        */     
    import java.util.Scanner;
    public class exercicio09 {
        public static void main(String[] args) {
        float precoproduto = 0;
        float valdesc = 0;
        float novopreco = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor do produto");
        precoproduto = Float.parseFloat(leitor.nextLine());
       
       valdesc = (precoproduto * 10f) / 100f;
       novopreco = precoproduto - valdesc;

       System.out.println("O novo preço é: " + novopreco);

       


        

    }
    
}
  
