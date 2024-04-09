package view;
public class Teste {
    public static void main(String[] args) {
        System.out.println("Início do main");
        try {
            metodo1();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ocorreu uma exceção: " + e.getMessage());
        }
        System.out.println("Fim do main");
    }

    public static void metodo1() {
        System.out.println("Início do método 1");
        metodo2();
        System.out.println("Fim do método 1");
    }

    public static void metodo2() {
        System.out.println("Início do método 2");
        int[] vetor = new int[10];
        try {
            for (int i = 0; i <= 15; i++) {
                vetor[i] = i;
                System.out.println(i);
                if (i == 9) {
                    int vlr = vetor[i] / vetor[0];
                    System.out.println(vlr);
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ocorreu uma exceção: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Erro aritmético: " + e.getMessage());
        }
        System.out.println("Fim do método 2");
    }
}
