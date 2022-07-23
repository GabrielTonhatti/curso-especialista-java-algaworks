public class Princpial {

    public static void main(String[] args) {
        Pessoa eu = new Pessoa();
        eu.nome = "Gabriel Tonhatti";
        eu.cpf = "123.456.789-00";
        eu.anoNascimento = 2000;

        Pessoa voce = new Pessoa();
        voce.nome = "João das Couves";
        voce.cpf = "999.999.999-99";
        voce.anoNascimento = 2000;

        Carro meuCarro = new Carro();
        meuCarro.anoFacricacao = 2021;
        meuCarro.cor = "Preto";
        meuCarro.fabricante = "Honda";
        meuCarro.modelo = "HR-V";
        meuCarro.proprietario = eu;
//        meuCarro.proprietario = new Pessoa();
//        meuCarro.proprietario.nome = "Gabriel Tonhatti";
//        meuCarro.proprietario.cpf = "123.456.789-00";
//        meuCarro.proprietario.anoNascimento = 2000;

        Carro seuCarro = new Carro();
        seuCarro.anoFacricacao = 2022;
        seuCarro.cor = "Branco";
        seuCarro.fabricante = "BMW";
        seuCarro.modelo = "X6";
        seuCarro.proprietario = voce;

        System.out.println("Meu carro");
        System.out.println("----------");
        System.out.printf("Modelo: %s%n", meuCarro.modelo);
        System.out.printf("Ano: %s%n", meuCarro.anoFacricacao);
        System.out.printf("Proprietário: %s%n", meuCarro.proprietario.nome);

        System.out.println();

        System.out.println("Seu carro");
        System.out.println("----------");
        System.out.printf("Modelo: %s%n", seuCarro.modelo);
        System.out.printf("Ano: %s%n", seuCarro.anoFacricacao);
        System.out.printf("Proprietário: %s%n", seuCarro.proprietario.nome);
    }

}
