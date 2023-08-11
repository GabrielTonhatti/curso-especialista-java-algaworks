import java.util.Arrays;

public class Cardapio {

    ItemCardapio[] itens = new ItemCardapio[0];
    ;

    void adicionarItem(ItemCardapio item) {
        itens = Arrays.copyOf(itens, itens.length + 1);
        itens[itens.length - 1] = item;
    }

    void removerItem(int indice) {
        ItemCardapio[] itensAntigo = itens;
        itens = new ItemCardapio[itensAntigo.length - 1];
        System.arraycopy(itensAntigo, 0, itens, 0, indice);
        System.arraycopy(itensAntigo, indice + 1, itens, 0, itens.length - indice);
    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
        for (ItemCardapio item : itens) {
            if (item.preco >= precoMinimo && item.preco <= precoMaximo) {
                System.out.printf("%s - R$ %.2f\n", item.descricao, item.preco);
            }
        }
    }
}
