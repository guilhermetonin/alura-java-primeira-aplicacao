public class Condicional {
    static void main() {
        int anoDeLancamento = 2024;
        double notaDoFilme = 8.4;
        boolean incluidoNoPlano = true;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Filme lançado recentemente!");
        } else {
            System.out.println("Filme mais antigo.");
        }

        if (incluidoNoPlano && tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Filme trancado, deve ser pago o aluguel");
        }

    }
}
