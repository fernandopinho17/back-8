package pt.com.ferpinho;

public class Operadores {

    public static void  main(String args[]) {
        operacoesAritmeticas();
        operacoesAtribuicoes();
    }

    private static void operacoesAtribuicoes() {
        System.out.println("**** operacoesAtribuicoes");
        int numero1 = 10;
        int numero2 = 10;
        int numero3 = numero1 + numero2;
        System.out.println(numero3);
        numero3 += numero3;
        System.out.println(numero3);
    }

    public static void operacoesAritmeticas() {
            System.out.println("**** operacoesAritmeticas");
            int num1 = 10;
            int num2 = 20;

            int num3 = num1 + num2;
            int num4 = num1 - num2;
            int num5 = num1 / num2;
            int num6 = num1 * num2;
            int num7 = (10 + 10)/2;

            System.out.println(num3);
            System.out.println(num4);
            System.out.println(num5);
            System.out.println(num6);
            System.out.println(num7);
    }
}
