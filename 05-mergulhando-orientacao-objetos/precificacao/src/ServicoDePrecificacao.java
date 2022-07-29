public class ServicoDePrecificacao {

    void definirPrecoVenda(Produto produto, double precentualMargemLucro) {
        // poderia ter cálculos muito mais complexos aqui
        double precoVendaCalculado = Matematica.calcularAcrescimo(produto.precoCusto, precentualMargemLucro);
        precoVendaCalculado += Produto.custoEmbalagem;

       produto.precoVenda = precoVendaCalculado;
    }

}
