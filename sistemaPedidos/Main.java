package sistemaPedidos;

//import servico.*; Necessita classes Service
import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Cliente> clientes = new ArrayList<>();
    private static List<Produto> produtos = new ArrayList<>();
    private static List<Pedido> pedidos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n&&&& Menu &&&&");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Produto");
            System.out.println("3 - Criar Pedido");
            System.out.println("4 - Relatorios");
            System.out.println("5 - Sair");
            System.out.print("Escolha: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarCliente(scanner);
                    break;
                case 2:
                    cadastrarProduto(scanner);
                    break;
                case 3:
                    criarPedido(scanner);
                    break;
                case 4:
                    relatorio(scanner);
                    break;
                case 5:
                    System.out.println("Saindo");
                    return;
                default:
                    System.out.println("Não tem opção");
            }
        }
    }

    private static void cadastrarCliente(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        clientes.add(new Cliente(nome, cpf, email, telefone));
        System.out.println("Cliente cadastrado!");
    }

    private static void cadastrarProduto(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Preço: ");
        double preco = scanner.nextDouble();
        System.out.print("Peso: ");
        double peso = scanner.nextDouble();
        scanner.nextLine();
        produtos.add(new Produto(nome, preco, peso));
        System.out.println("Produto cadastrado!");
    }

    private static void criarPedido(Scanner scanner) {
        if (clientes.isEmpty() || produtos.isEmpty()) {
            System.out.println("Sem produto ou cliente");
            return;
        }

        System.out.println("Qual cliente?:");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(i + " - " + clientes.get(i));
        }
        int Ncliente = scanner.nextInt();
        scanner.nextLine();
        Cliente cliente = clientes.get(Ncliente);

        System.out.print("Tipo de frete (peso ou distnaica): ");
        String frete = scanner.nextLine();
        Pedido pedido = new Pedido(cliente, frete);

        while (true) {
            System.out.println("Quak produo?:");
            for (int i = 0; i < produtos.size(); i++) {
                System.out.println(i + " - " + produtos.get(i));
            }
            int Nproduto = scanner.nextInt();
            System.out.print("Quantidade: ");
            int qtd = scanner.nextInt();
            scanner.nextLine();

            pedido.adicionarItem(produtos.get(Nproduto), qtd);

            System.out.print("Adicionar outro produto? (s/n): ");
            String opc = scanner.nextLine();
            if (opc.equalsIgnoreCase("n")) break;
        }

        double totalfrete;
        if ("PESO".equalsIgnoreCase(frete)) {
            totalfrete = 0;
			//pedido.calcularFretePeso(totalfrete); Necessita classes Service
        } else {
            System.out.print("Informe a distância (km): ");
            totalfrete = scanner.nextDouble();
            scanner.nextLine();
			//pedido.calcularFreteDistancia(totalfrete); Necessita classes Service
        }

        pedidos.add(pedido);
        System.out.println("Pedido criado com sucesso!");
        System.out.println(pedido);
    }

    private static void relatorio(Scanner scanner) {
        // Necessita classes Service
    }
}