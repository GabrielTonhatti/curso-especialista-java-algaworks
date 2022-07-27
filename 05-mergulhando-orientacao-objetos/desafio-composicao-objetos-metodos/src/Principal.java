public class Principal {

    public static void main(String[] args) {
        FolhaPagamento folha = new FolhaPagamento();
        ContratoTrabalho contratoTrabalho = new ContratoTrabalho();
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "João";
        funcionario.qtdeFilhos = 1;

        contratoTrabalho.valorHora = 15.98;
        contratoTrabalho.valorHoraExtra = 7.99;
        contratoTrabalho.funcionario = funcionario;

        Holerite holerite = folha.calcularSalario(180, 30, contratoTrabalho);
        holerite.imprimir();
    }

}
