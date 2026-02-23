import java.util.Scanner;

public class Leitura {
    static void main() {
        Scanner leitura =  new Scanner(System.in);

        // nome do filme
        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();

        // ano de lancamento
        System.out.println("Qual é ano de lançamento");
        int anoDeLancamento = leitura.nextInt();

        // avaliacao
        System.out.println("De uma nota para o filme");
        double notaDoFilme = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(notaDoFilme);
    }
}
