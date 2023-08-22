public class Principal {

    public static void main(String[] args) {
        Fatura fatura = new Fatura();
        fatura.numero = 123;
        fatura.valorTotal = 1_293.55;

        ServicoCobranca servicoCobranca = new ServicoCobranca();
        servicoCobranca.pagar(fatura, "joao@algaworks.com", "maria@algaworks.com");
    }
}
