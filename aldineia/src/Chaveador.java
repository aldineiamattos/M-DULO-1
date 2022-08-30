public class Chaveador {
    public static void main(String[] args) {
        int opcao = -1   ;
        
        if(opcao ==0) {
            //entao - sim - verdadeiro
            System.out.println("IF: Valor ZERO");
            // O NÃO não é obrigatório
            // estrutura de decisão simples
        }else{
            // senao - nao - falso
            if (opcao == 1){
                System.out.println("IF: Valor é um");
            }else{
                if (opcao==-1){
                    System.out.println("IF: Valor negativo");
                }
            }    
        }  
        switch (opcao){
            case -1:
                System.out.println("SWITCH: valor negativo");
            break;

            case 0:
                System.out.println("SWITCH: valor ZERO");
            break;

            case 1:
                System.out.println("SWITCH: valor é um");
            break;

            default:
                System.out.println("Nenhum dos casos anteriores!");
                break;

        }
    }    
}
        
        

    
    

