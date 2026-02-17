package Desafios;

public class ConversorTemperatura {
    public static void main(String[] args) {
        int celcius = 29;
        int fahrenheit = (int) (celcius * 1.8) + 32;
        String mensagem = """
                graus Celsius: %d
                Fahrenheit: %d
                """.formatted(celcius, fahrenheit);
        System.out.println(mensagem);
    }

}
