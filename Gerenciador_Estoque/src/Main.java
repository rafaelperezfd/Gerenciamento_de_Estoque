import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Produto> produtos = new ArrayList<>();
    private static int proximoId = 1;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = -1;

        while (opcao != 0) {
            exibirMenu();
            try {
                opcao = Integer.parseInt(scanner.nextLine());
                switch (opcao) {
                    case 1 -> cadastrarProduto();
                    case 2 -> listarProdutos();
                    case 3 -> atualizarProduto();
                    case 4 -> deletarProduto();
                    case 0 -> System.out.println("\nSaindo do sistema... Até logo!");
                    default -> System.out.println("\nOpção inválida! Tente novamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("\nEntrada inválida! Digite apenas números.");
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("\n=================================");
        System.out.println("   SISTEMA DE GESTÃO DE ESTOQUE  ");
        System.out.println("=================================");
        System.out.println("1. Cadastrar Produto");
        System.out.println("2. Listar Produtos");
        System.out.println("3. Atualizar Produto");
        System.out.println("4. Deletar Produto");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarProduto() {
        System.out.print("\nNome do Produto: ");
        String nome = scanner.nextLine();

        System.out.print("Quantidade: ");
        int qtd = Integer.parseInt(scanner.nextLine());

        System.out.print("Preço (R$): ");
        double preco = Double.parseDouble(scanner.nextLine());

        Produto p = new Produto(proximoId++, nome, qtd, preco);
        produtos.add(p);
        System.out.println("✅ Produto cadastrado com sucesso!");
    }

    private static void listarProdutos() {
        System.out.println("\n--- LISTA DE PRODUTOS ---");
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }
        for (Produto p : produtos) {
            System.out.println(p);
        }
    }

    private static void atualizarProduto() {
        System.out.print("\nDigite o ID do produto a atualizar: ");
        int id = Integer.parseInt(scanner.nextLine());
        Produto produto = buscarPorId(id);

        if (produto == null) {
            System.out.println("❌ Produto não encontrado!");
            return;
        }

        System.out.print("Novo Nome (pressione Enter para manter [" + produto.getNome() + "]): ");
        String novoNome = scanner.nextLine();
        if (!novoNome.isBlank()) produto.setNome(novoNome);

        System.out.print("Nova Quantidade (pressione Enter para manter [" + produto.getQuantidade() + "]): ");
        String novaQtd = scanner.nextLine();
        if (!novaQtd.isBlank()) produto.setQuantidade(Integer.parseInt(novaQtd));

        System.out.print("Novo Preço (pressione Enter para manter [" + produto.getPreco() + "]): ");
        String novoPreco = scanner.nextLine();
        if (!novoPreco.isBlank()) produto.setPreco(Double.parseDouble(novoPreco));

        System.out.println("✅ Produto atualizado com sucesso!");
    }

    private static void deletarProduto() {
        System.out.print("\nDigite o ID do produto a deletar: ");
        int id = Integer.parseInt(scanner.nextLine());
        Produto produto = buscarPorId(id);

        if (produto != null) {
            produtos.remove(produto);
            System.out.println("✅ Produto removido com sucesso!");
        } else {
            System.out.println("❌ Produto não encontrado!");
        }
    }

    private static Produto buscarPorId(int id) {
        for (Produto p : produtos) {
            if (p.getId() == id) return p;
        }
        return null;
    }
}