package Desafios;

public class Desafios1 {
    public static void main(String[] args) {
        //
        char letraL = 'l';
        String texto = "Diferente usos";
        System.out.println(letraL + texto);

        //
        double precoProduto = 10.85;
        int quantidade = 15;
        double valorTotal = precoProduto * quantidade;
        String mensagemValor = """
                Preço do produto: %f
                Quantidade: %d
                Valor total: R$ %.2f
                """.formatted(precoProduto, quantidade, valorTotal);
        System.out.println(mensagemValor);

        //
        double valorEmDolares = 199;
        double dolar = 4.94;
        double valorEmReais = 199 * 4.94;
        System.out.println("Valor em: R$ " +  valorEmReais);

        //
        double precoOriginal = 100;
        double percentualDesconto = 5;
        double desconto = precoOriginal * 0.05;
        double valorFinal = precoOriginal - desconto;
        System.out.println("Valor final do produto: R$ " + valorFinal);
    }
}
