public class ContratoTrabalho {

    Funcionario funcionario;
    double valorHora;
    double valorHoraExtra;

    boolean temAdicional() {
        return funcionario.possuiFilhos();
    }

}
