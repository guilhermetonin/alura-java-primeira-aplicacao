package Desafios;
import java.util.Scanner;

public class CalcularArea {
    static void main() {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Escolha uma opção:\n1. Calcular Área do Quadrado\n2. Calcular Área do Círculo");
        int opcao = leitura.nextInt();

        switch (opcao) {

            // quadrado
            case 1:
                System.out.println("Informe o comprimento do Lado em CM");
                double lado = leitura.nextDouble();

                double areaQuadrado = lado * lado;
                System.out.println("Área do Quadrado: " + areaQuadrado + "cm²");
                break;

            // circulo
            case 2:
                System.out.println("Informe o comprimento do Raio em CM");
                double raio = leitura.nextDouble();
                final double pi = 3.14159;

                double areaCirculo = pi * (raio * raio);
                System.out.printf("Área do Circulo: %.2f cm²", areaCirculo);
                break;
        }

    }
}
