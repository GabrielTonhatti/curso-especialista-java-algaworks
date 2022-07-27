public class FolhaPagamento {

    Holerite calcularSalario(int horasTrabalhadas, int horaExtra, ContratoTrabalho contratoTrabalho) {
        Holerite holerite = new Holerite();
        holerite.valorTotalHora = horasTrabalhadas * contratoTrabalho.valorHora;
        holerite.valorTotalHoraExtra = horaExtra * contratoTrabalho.valorHoraExtra;
        double resultado = holerite.valorTotalHora + holerite.valorTotalHoraExtra;

        if (contratoTrabalho.temAdicional()) {
            holerite.valorAdicionalParaFilhos += resultado * 0.1;
        }

        return holerite;
    }

}
