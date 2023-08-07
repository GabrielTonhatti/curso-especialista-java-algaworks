import java.util.Objects;

public class CarrinhoDeCompra {

    void adicionarItem(String nomeProduto, int precoUnitario, int quantidade) {
        // TODO: implementar
    }

    void adicionarItem(Produto produto, int quantidade) {
        Objects.requireNonNull(produto, "Produto deve ser informado");

        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade deve ser maior que zero");
        }

        System.out.printf("Produto: %s%n", produto.nome);

        // TODO: implementar
    }

    void gerarPedido(Endereco enderecoEntrega) {
        Objects.requireNonNull(enderecoEntrega, "Endereço de entrega deve ser informado");

        criarNovoPedido(enderecoEntrega);
    }

    void gerarPedido() {
        criarNovoPedido(null);
    }

    // Método Interno (vamos estudar sobre private em breve)
    private void criarNovoPedido(Endereco enderecoEntrega) {
        // TODO: implementar
    }
}
