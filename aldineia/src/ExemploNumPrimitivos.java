public class ExemploNumPrimitivos {
    public static void main(String[] args) throws Exception {
        int primeironumero = 7;
        int segundonumero = 2;
        int resultado = primeironumero + segundonumero;

        //SAIDA 
        System.out.println("o resultado é:");
        System.out.println(resultado);

        //CONCATENAÇÃO
        System.out.println("o resultado é:" + resultado);
        //Interpolação de String
        System.out.print(String.format("o resultado e: %d", resultado));

        //SUBTRAÇÃO
        int resultadosub = primeironumero - segundonumero;
        System.out.println("O resultado da subtracao e " + resultadosub);
        System.out.println(resultadosub);

        //DIVISÃO
        float resultadodiv = (float)primeironumero / (float)segundonumero;
        System.out.println("O resultado da divisaoo e " + resultadodiv);
        System.out.println(resultadodiv);

        //MULTIPLICAÇÃO
        int resultadomult = primeironumero * segundonumero;
        System.out.println("O resultado da multiplicacao e " + resultadomult);
        System.out.println(resultadomult);

        //tipo lógico (booleano) = true ou false

        boolean resultadocomparacao =  primeironumero == segundonumero;
        System.out.println(resultadocomparacao);
        System.out.println(resultadocomparacao?"Verdadeiro":"falso");

        String nome = "Aldineia de Morais Mattos";
        char umaletra = 'a';

        long numeromuitogrande = 10L;
        //ERRO: A variavel INT nao suporta o valor long por conta do tamanho 
        //int vaidarruim = 10L;
        System.out.println(numeromuitogrande);

        int salario = (int)1210.5f;
        System.out.println(salario);

        //ERRO; O double tem 64bits e não cabe dentro do float 32bits
        //float imposto = 1000.0;
        


        

















    }
}
