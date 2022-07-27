public class Carro {

    String fabricante;
    String modelo;
    String cor;
    int anoFacricacao;
    double precoCompra;
    Pessoa proprietario;

    double calcularValorRevenda() {
        int tempoDeUsoEmAnos = 2022 - anoFacricacao;
        int vidaUtilEmAnos = 20;
        double valorRevenda = (precoCompra / vidaUtilEmAnos) * (vidaUtilEmAnos - tempoDeUsoEmAnos);

        if (valorRevenda < 0) {
            valorRevenda = 0;
        }

        return valorRevenda;
    }

}
