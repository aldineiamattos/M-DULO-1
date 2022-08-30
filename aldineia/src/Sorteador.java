public class Sorteador {
    public static void main(String[] args) {
    //qualquer número decimal vai dar um número de 0 a 1 multiplicado por 100
        for (int i=0;i<100;i++){
            System.out.println(Math.round(Math.random() * 100));
            System.out.println(Math.round(Math.random() * 100));

        }
    }
}
