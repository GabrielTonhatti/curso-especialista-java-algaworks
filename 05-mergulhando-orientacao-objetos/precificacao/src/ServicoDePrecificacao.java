public class ServicoDePrecificacao {

    void definirPrecoVenda(Produto produto, double precentualMargemLucro) {
        // poderia ter cálculos muito mais complexos aqui
        double precoVendaCalculado = produto.precoCusto * ((precentualMargemLucro / 100) + 1);
        precoVendaCalculado += Produto.custoEmbalagem;
       produto.precoVenda = precoVendaCalculado;
    }

}
