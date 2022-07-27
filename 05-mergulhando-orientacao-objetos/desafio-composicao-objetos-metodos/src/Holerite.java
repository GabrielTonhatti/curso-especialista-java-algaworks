public class Holerite {

    Funcionario funcionario;
    double valorTotalHora;
    double valorTotalHoraExtra;
    double valorAdicionalParaFilhos;

    double calcularValorTotal() {
        return valorTotalHora + valorTotalHoraExtra + valorAdicionalParaFilhos;
    }

    void imprimir() {
        System.out.printf("Valor total das horas normais: %.2f, valor total das horas extras: %.2f, " +
                "valor do adicional para filhos: %.2f, salário devido: %.2f", valorTotalHora, valorTotalHoraExtra,
                valorAdicionalParaFilhos, calcularValorTotal());
    }

}
