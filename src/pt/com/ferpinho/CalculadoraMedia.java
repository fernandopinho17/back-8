package pt.com.ferpinho;

import java.util.Scanner;
public class CalculadoraMedia {
    private double[] notas;

    public CalculadoraMedia() {
        notas = new double[4];
    }

    public void lerNotas() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }
    }

    public double calcularMedia() {
        if (notas.length == 0) {
            System.out.println("Por favor, insira as notas antes de calcular a média.");
            return 0.0; // Retorna 0 se não houver notas
        }

        double soma = 0.0;
        for (double nota : notas) {
            soma += nota;
        }

        return soma / notas.length;
    }

    public static void main(String[] args) {
        CalculadoraMedia calculadora = new CalculadoraMedia();
        calculadora.lerNotas();
        double media = calculadora.calcularMedia();

        if (media != 0.0) {
            System.out.println("A média das notas é: " + media);
        }
    }
}
