public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Interstellar");

        int anoDeLancamento = 2014;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        // Média calculada pelas 3 notas
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println("Média: " + media);

        String sinopse;
        sinopse = "O planeta Terra começa a sofrer com crises ambientais sérias";
        System.out.println("Sinopse: " + sinopse);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao);

    }
}