public class Principal {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.nome = "Rex";
        cachorro.raca = "Labrador";
        cachorro.sexo = "Macho";
        cachorro.idade = 2;

        System.out.println("Cachorro 1");
        System.out.printf("Nome: %s%n", cachorro.nome);
        System.out.printf("Raça: %s%n", cachorro.raca);
        System.out.printf("Sexo: %s%n", cachorro.sexo);
        System.out.printf("Idade: %s%n", cachorro.idade);

        System.out.println();

        Cachorro cachorro2 = new Cachorro();
        cachorro2.nome = "Bix";
        cachorro2.raca = "Poodle";
        cachorro2.sexo = "Macho";
        cachorro2.idade = 1;

        System.out.println("Cachorro 2");
        System.out.printf("Nome: %s%n", cachorro2.nome);
        System.out.printf("Raça: %s%n", cachorro2.raca);
        System.out.printf("Sexo: %s%n", cachorro2.sexo);
        System.out.printf("Idade: %s%n", cachorro2.idade);
    }

}
