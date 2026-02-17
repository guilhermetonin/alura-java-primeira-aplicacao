package Desafios;

public class Anotacoes {
    public static void main(String[] args) {
        /* Metodo format()
        %s  strings (nomes,textos,frases)
        %d	inteiros (idade,quantidade,anos)
        %f	ponto fluante (preços,medidas)
        %b	booleano (true ou false)
        %n  quebra de linha
        */

        String nome = "Guilherme";
        int idade = 18;
        double numero = 59.99;

        String mensagem = """
                Nome: %s
                Idade: %d
                Numero: %.2f
                """.formatted(nome, idade, numero);
        System.out.println(mensagem);
    }
}
