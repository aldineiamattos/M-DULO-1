import java.security.Principal;
import java.util.Arrays;

public class ExemploString {
public static void main(String[] args) {
    String texto = "Universidade da Região de Joinville";
    char[]textoarray = texto.toCharArray();
    // () para não aparecer para o java que são variáveis
    // toCharArray - diz para o java chama o teu método 
    System.out.println(Arrays.toString(textoarray));
     //(5) ele sempre conta do 0 que dá letra U
     // retorna um caracter na posição informada
    System.out.println(texto.charAt(0));
    //troca um ou mais caracteres por outros caracteres
    // STRINGS SAO OBJETOS IMUTAVEIS
    System.out.println(texto.replace(" ", ","));
    // (" ", "#")) diz onde têm espaços " ", troca por #  "#"
    // pode ser trocado por , (" ", ",")
    System.out.println(texto);
    // (texto.replace(" ", ",")) - texto); Têm a original na memória e cria outra String.
    // nunca vai perder a original por está fixa no código (String texto = "Universidade da Região de Joinville";
    // se ele têm memória sobrando não apaga nada.
    // GC dá uma limpada na memória, porém têm que deixar o java tomar a decisão.
    // w3schools.com  
    // Novatec Expressões Regulares - email conjunto de carateres A a Z, de 0 a 9.
    // Expressões Regulares serve para encontrar padrões dentro de um texto complexo.
    // texto.substring(26, 35) quero cortar a frase do 26 ao 35 - ficou só Joinville.
    // substring = Corta o texto
    System.out.println(texto.substring(26, 35));
    // length - Quantos caracteres tem no texto
    System.out.println(texto.length());
    //System.out.println(texto.split(",")) - ele mostra [Ljava.lang.String;@161cd475 pois o java não sabe mostrar o que o usuário está pedindo, ele faz o seu melhor
    System.out.println(Arrays.toString(texto.split(",")));
    //Split quebra o texto

    String outroTexto = " \"no meio\" ";
    // aspas é o começo e o fim de um texto, porém colocando \ ele entende que é uma aspa, serve também para outros caracteres especiais. 
    // Escape Sequence \t, \b, \n, \r, \f, \' está no link  
    System.out.println(outroTexto);
    
   
    
}
    
}
