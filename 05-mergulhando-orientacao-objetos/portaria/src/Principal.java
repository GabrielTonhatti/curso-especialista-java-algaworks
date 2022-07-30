public class Principal {

    public static void main(String[] args) {
        final var novoVisitante = new Visitante();

        novoVisitante.nome = "João";
        novoVisitante.idade = 15;

        final var cadastroPortaria = new CadastroPortaria();
        int codigoVisitante = cadastroPortaria.cadastrar(novoVisitante, 2);
    }

}
