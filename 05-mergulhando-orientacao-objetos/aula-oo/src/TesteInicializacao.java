public class TesteInicializacao {

    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.fabricante = "Honda";

        System.out.println(meuCarro.fabricante);
        System.out.println(meuCarro.modelo);
        System.out.println(meuCarro.anoFacricacao);
    }

}
