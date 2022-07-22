public class Princpial {

    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.anoFacricacao = 2021;
        meuCarro.cor = "Preto";
        meuCarro.fabricante = "Honda";
        meuCarro.modelo = "HR-V";

        Carro seuCarro = new Carro();
        seuCarro.anoFacricacao = 2022;
        seuCarro.cor = "Branco";
        seuCarro.fabricante = "BMW";
        seuCarro.modelo = "X6";

        System.out.println("Meu carro");
        System.out.println("----------");
        System.out.printf("Modelo: %s%n", meuCarro.modelo);
        System.out.printf("Ano: %s%n", meuCarro.anoFacricacao);

        System.out.println();

        System.out.println("Seu carro");
        System.out.println("----------");
        System.out.printf("Modelo: %s%n", seuCarro.modelo);
        System.out.printf("Ano: %s%n", seuCarro.anoFacricacao);
    }

}
