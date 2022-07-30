public class Principal {

    public static void main(String[] args) {
        var calculadoraImc = new CalculadoraImc();

        var joao = new Paciente();
        joao.altura = 1.82;
        joao.peso = 175;

        var imc = calculadoraImc.calcular(joao);

        if (imc.estaComObesidade()) {
            System.out.printf("Paciente com altura %.2f e peso de %.2f está com obesidade%n", imc.altura, imc.peso);
        }

        System.out.printf("IMC: %.2f%n", imc.resultado);
    }

}
