package Desafios;

import java.util.Scanner;

public class Desafios2 {
    static void main() {
        Scanner leitura = new Scanner(System.in);

        // positivo ou negativo
        System.out.println("Digite um número");
        int numero = leitura.nextInt();

        if (numero > 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }

        // comparação de números
        System.out.println("\nDigite o primeiro número");
        int primeiro = leitura.nextInt();

        System.out.println("Digite o segundo número");
        int segundo = leitura.nextInt();

        if (primeiro == segundo) {
            System.out.println("sao iguais");
        } else if (primeiro > segundo) {
            System.out.println("São diferentes | O primeiro número é maior");
        } else {
            System.out.println("São diferentes | O segundo número é maior");
        }

        // fatorial
        System.out.println("\nEscolha um número para fazer fatorial");
        int numeroDigitado = leitura.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= numeroDigitado; i++) {
            fatorial *= i;
        }
        System.out.printf("Fatorial de %d é %d", numeroDigitado, fatorial);
    }
}
