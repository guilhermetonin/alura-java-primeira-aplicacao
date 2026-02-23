import java.util.Scanner;

public class Loop {
    static void main() {
        Scanner leitura =  new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("De uma nota para o filme");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.println("Média das avaliações: " + mediaAvaliacao/3);
    }
}
