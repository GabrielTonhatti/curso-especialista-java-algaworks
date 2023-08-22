public class Principal {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double media = calculadora.calcularMedia(10, 20, 15, 25);

        System.out.println("Média: " + media);
    }
}
