public class Principal {

    public static void main(String[] args) {
        double areaQuadrado = Geometria.calcularAreaQuadrado(5.2);
        double areaCirculo = Geometria.calcularAreaCirculo(10.5);

        System.out.printf("Área do quadrado: %.2f%n", areaQuadrado);
        System.out.printf("Área do círculo: %.2f%n", areaCirculo);
    }

}
