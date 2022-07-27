public class ServicoDePrecificacao {

    void definirPrecoVenda(Produto produto, double precentualMargemLucro) {
        // poderia ter cálculos muito mais complexos aqui

       produto.precoVenda = produto.precoCusto * ((precentualMargemLucro / 100) + 1);
    }

}
