public class Calculadora {

    double calcularMedia(double numero1, double... numeros) {
        double soma = numero1;

        for (double numero : numeros) {
            soma += numero;
        }

        return soma / (numeros.length + 1);
    }
}
