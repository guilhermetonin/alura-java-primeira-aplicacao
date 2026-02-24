import java.util.Scanner;

public class AluraBank {

    public static void exibirDados(String nome, String tipo, double saldo) {
        /*
        Exibe as informações da conta bancária.
        Argumentos:
        - nome: Nome completo do cliente.
        - tipo: Tipo da conta bancária (Corrente ou Poupança).
        - saldo: O valor disponível em conta.
         */
        String mensagemNome = "Nome: " + nome;
        String mensagemTipo = "Tipo da conta: " + tipo;
        String mensagemSaldo = String.format("Saldo: %.2f", saldo);
        String mensagemSeparador = "*************************";

        System.out.println("\n" + mensagemSeparador);
        System.out.println(mensagemNome);
        System.out.println(mensagemTipo);
        System.out.println(mensagemSaldo);
        System.out.println(mensagemSeparador);
    }
    public static void exibirOperacoes() {
        /*
        Exibe as opções valídas no programa.
        */
        String menu = """
                \nOperações:
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Encerrar programa
                """;
        System.out.println(menu);
        System.out.println("Digite a opção escolhida:");
    }

    static void main() {
        /*
        Fluxo principal do programa bancário.
        Variáveis principais:
        - leitura: Objeto Scanner para receber entradas.
        - nomeDoCliente: Nome completo do cliente.
        - saldo: Valor disponível em conta.
        - opcaoEscolhida: Opções de navegação do menu.
        */
        Scanner leitura = new Scanner(System.in);

        String nomeDoCliente = "Guilherme Tonin";
        String tipoDaConta = "Corrente";
        double saldo = 3000.00;
        int opcaoEscolhida = 0;

        exibirDados(nomeDoCliente, tipoDaConta, saldo);
        while (opcaoEscolhida != 4) {

            exibirOperacoes();
            opcaoEscolhida = leitura.nextInt();

            switch (opcaoEscolhida) {
                case 1:
                    System.out.printf("\n--- O saldo atual é R$ %.2f ---\n", saldo);
                    break;
                case 2:
                    System.out.println("\n--- Informe o valor a receber: ---");
                    double valorReceber = leitura.nextDouble();
                    while (valorReceber <= 0) {
                        System.out.println("\nO valor tem que ser positivo. Tente novamente.");
                        System.out.println("\n--- Informe o valor a receber: ---");
                        valorReceber = leitura.nextDouble();
                    }
                    saldo += valorReceber;
                    break;
                case 3:
                    System.out.println("\n--- Informe o valor que deseja transferir: ---");
                    double valorTranferir = leitura.nextDouble();

                    while (valorTranferir <= 0 || valorTranferir > saldo) {
                        if (valorTranferir > saldo) {
                            System.out.println("\nO valor não pode ser maior que o saldo. Tente novamente.");
                        } else {
                            System.out.println("\nO valor tem que ser positivo. Tente novamente.");
                        }
                        System.out.println("\n--- Informe o valor que deseja transferir: ---");
                        valorTranferir = leitura.nextDouble();
                    }
                    saldo -= valorTranferir;
                    break;
                case 4:
                    System.out.println("\n--- Encerrando programa ---");
                    break;
                default:
                    System.out.println("\n--- Opção escolhida é inválida. ---");
                    break;
            }
        }
    }
}
