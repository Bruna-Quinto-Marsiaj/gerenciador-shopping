import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        Loja loja = null;
        Produto produto = null;

        while (opcao != 3) {
            System.out.println("(1) criar uma loja");
            System.out.println("(2) criar um produto");
            System.out.println("(3) sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    loja = criarLoja(scanner);
                    break;
                case 2:
                    produto = criarProduto(scanner);
                    break;
                case 3:
                    System.out.println("Saindo.");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }


    private static Produto criarProduto(Scanner scanner) {
        System.out.println("Digite o nome do produto");
        String nome = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Preço");
        int preco = scanner.nextInt();
        System.out.println("Data de validade");
        int dataValidade = scanner.nextInt();
        System.out.println("Produto criado!");

        return null;
    }

    private static Loja criarLoja(Scanner scanner) {
        System.out.println("Nome da loja");
        String nome = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Quantidade de funcionarios");
        int quantidadeFuncionarios = scanner.nextInt();
        System.out.println("Tamanho estoque");
        int estoqueProdutos = scanner.nextInt();
        System.out.println("Salario Base");
        int salarioBaseFuncionario = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Endereco");
        System.out.println("Nome da Rua");
        String nomeDaRua = scanner.nextLine();
        System.out.println("Cidade");
        String cidade = scanner.nextLine();
        System.out.println("Estado");
        String estado = scanner.nextLine();
        System.out.println("País");
        String pais = scanner.nextLine();
        System.out.println("CEP");
        String cep = scanner.nextLine();
        System.out.println("Numero");
        String numero = scanner.nextLine();
        System.out.println("Complemento");
        String complemento = scanner.nextLine();
        System.out.println("Loja Criada!");




        return null;
    }

}



