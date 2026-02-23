package Desafios;

import java.util.Random;
import java.util.Scanner;

public class Desafios2 {
    static void main() {
        Scanner leitura = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int tentativas = 5;
        int numero = 0;

        while (tentativas > 0) {
            System.out.println("\nDigite um número");
            numero = leitura.nextInt();

            if (numero == numeroAleatorio) {
                System.out.println("\nVocê acertou! Era o número " + numeroAleatorio);
                break;
            }
            tentativas--;

            if (numero > numeroAleatorio) {
                System.out.println("\nTente um número MENOR");
                System.out.println("Tentativas restantes: " + tentativas);
            } else {
                System.out.println("\nTente um número MAIOR");
                System.out.println("Tentativas restantes: " + tentativas);
            }

            if (tentativas == 0) {
                System.out.println("\nAcabou suas tentativas :(");
                System.out.println("O número secreto era: " + numeroAleatorio);
            }
        }
    }
}
