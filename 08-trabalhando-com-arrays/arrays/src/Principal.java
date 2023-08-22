public class Principal {

    public static void main(String[] args) {
        Fatura fatura = new Fatura();
        fatura.numero = 123;
        fatura.valorTotal = 1_293.55;

        ServicoCobranca servicoCobranca = new ServicoCobranca();

//        String[] emailsCobranca = {"joao@algaworks.com", "maria@algaworks.com"};
//        servicoCobranca.pagar(fatura, emailsCobranca);

//        servicoCobranca.pagar(fatura, new String[]{"joao@algaworks.com", "maria@algaworks.com"});

//        servicoCobranca.pagar(fatura, new String[0]);
//        servicoCobranca.pagar(fatura, new String[]{});

//        servicoCobranca.pagar(fatura, "joao@algaworks.com", "maria@algaworks.com");

        servicoCobranca.pagar(fatura);
    }
}
